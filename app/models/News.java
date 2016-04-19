package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 4/13/2016.
 */
@Entity
public class News extends Model {

    @Id
    public Integer id;
    public String title;
    @Column(columnDefinition = "TEXT")
    public String text;
    public Date date;
    @ManyToOne
    public AppUser user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="news")
    public List<Image> images;

    public News() {}
    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public static Finder<String, News> finder = new Finder<>(News.class);

    /* ------------------- find news by id ------------------ */

    public static News findNewsById (Integer newsId) {
        return finder.where().eq("id", newsId).findUnique();
    }

    /* ------------------- find all news ------------------ */

    public static List<News> findAllNews () {
        return finder.all();
    }

    /* ------------------- create news ------------------ */

    public static News createNews(String title, String text) {
        News news = new News();
        news.title = title;
        news.text = text;
        news.date = new Date();
        news.user = AppUser.findUserById(1);
        news.save();
        return news;
    }

    /* ------------------- update news ------------------ */

    public static void updateNews(String title, String text, Integer newsId) {
        News news = findNewsById(newsId);
        news.title = title;
        news.text = text;
        news.update();
    }

    /* ------------------- delete news ------------------ */

    public static void deleteNews(Integer newsId) {
        News news = findNewsById(newsId);
        List<Image> newsImages = Image.findImagesByNewsId(newsId);
        for(int i = 0; i < newsImages.size(); i++) {
            Image.deleteImage(newsImages.get(i));
        }
        news.delete();
    }

    /* ------------------- get last 3 news for index page ------------------ */

    public static List<News> lastNews() {
        List<News> newsList = new ArrayList<>();
        List<News> allNews = findAllNews();
        if(allNews.size() > 3) {
            newsList = allNews.subList(allNews.size()-3, allNews.size());
            Collections.reverse(newsList);
            return newsList;
        }else {
            Collections.reverse(allNews);
            return allNews;
        }
    }
}
