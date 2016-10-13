package controllers;

import models.Banner;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by User on 6/8/2016.
 */
public class Banners extends Controller {

    public Result createBannerRender() {
        return ok(views.html.banner.createBanner.render());
    }

    public Result createBanner() {
        DynamicForm form = Form.form().bindFromRequest();
        String image = form.field("image").value();
        String link = form.field("link").value();
        Integer bannerPosition = Integer.parseInt(form.field("bannerPosition").value());

        Banner.createBanner(link, image, bannerPosition);
        return redirect(routes.Banners.listOfBanners());
    }
    
    public Result listOfBanners() {
        List<Banner> banners = Banner.getAllBanners();
        return ok(views.html.banner.listOfBanners.render(banners));
    }

    public Result deleteBanner(Integer bannerId) {
        Banner.deleteBanner(bannerId);
        return redirect(routes.Banners.listOfBanners());
    }
}
