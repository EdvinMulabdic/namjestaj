package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.faq;
import views.html.index;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result faqRender(){
        return ok (faq.render());
    }
}
