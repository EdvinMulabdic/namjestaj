package controllers;

import models.Email;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.contactUs;

/**
 * Created by User on 3/26/2016.
 */
public class ContactUs extends Controller {

        /* ------------------- contact us render ------------------ */

    public Result contactUsRender(){
        return ok(contactUs.render());
    }

        /* ------------------- contact us  ------------------ */

    public Result contactUs(){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String lastName = form.field("lastName").value();
        String email = form.field("email").value();
        String phone = form.field("phone").value();
        String message = form.field("message").value();

        Email.contactFormEmail(name, lastName, email, phone, message);
        return redirect(routes.Application.index());

    }

}
