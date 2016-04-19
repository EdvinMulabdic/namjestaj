package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.faq;
import views.html.index;
import views.html.notFound;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result faqRender(){
        return ok (faq.render());
    }

    public Result unAuthorized() {
        return status(404, notFound.render());
    }
}
