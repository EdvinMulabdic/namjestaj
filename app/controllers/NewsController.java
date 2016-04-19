package controllers;

import helpers.Authenticator;
import models.Image;
import models.News;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import java.io.File;
import java.util.List;

/**
 * Created by User on 4/16/2016.
 */
public class NewsController extends Controller {

    /* ------------------- news panel render ------------------ */

    public Result newsPanelRender() {
        List<News> newsList = News.findAllNews();
        return ok(views.html.news.newsPanel.render(newsList));
    }


    /* ------------------- news render ------------------ */

    public Result newsRender(Integer newsId) {
        News news = News.findNewsById(newsId);
        return ok(views.html.news.news.render(news));
    }


    /* ------------------- create news render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createNewsRender() {
        return ok(views.html.news.createNews.render());
    }


    /* ------------------- create news  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createNews() {
        DynamicForm form = Form.form().bindFromRequest();

        String title = form.field("title").value();
        String text = form.field("text").value();

        News news = News.createNews(title, text);

//        News news = News.findNewsById(newsId);

        Http.MultipartFormData body1 = request().body().asMultipartFormData();
        List<Http.MultipartFormData.FilePart> fileParts = body1.getFiles();
        if (fileParts != null) {
            for (Http.MultipartFormData.FilePart filePart1 : fileParts) {
                File file = filePart1.getFile();
                Image image = Image.createNews(file, news.id);
                news.images.add(image);
            }
        }
        news.update();

        return redirect(routes.NewsController.newsPanelRender());
    }


    /* ------------------- delete news  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result deleteNews(Integer newsId) {
        News.deleteNews(newsId);
        return redirect(routes.NewsController.newsPanelRender());
    }


    /* ------------------- update news render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateNewsRender(Integer newsId) {
        News news = News.findNewsById(newsId);
        return ok(views.html.news.updateNews.render(news));
    }

    /* ------------------- update news  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateNews(Integer newsId) {
        DynamicForm form = Form.form().bindFromRequest();

        String title = form.field("title").value();
        String text = form.field("text").value();

        News.updateNews(title, text, newsId);
        return redirect(routes.NewsController.newsRender(newsId));
    }
}
