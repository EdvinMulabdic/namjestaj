package controllers;

import helpers.SessionsAndCookies;
import helpers.UserAccessLevel;
import models.AppUser;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.loginPage;

/**
 * Created by User on 3/24/2016.
 */
public class Login extends Controller {

    /* ------------------- login page render ------------------ */

    public Result loginPageRender(){
        return ok(loginPage.render());
    }

        /* ------------------- login  ------------------ */

    public Result login(){
        DynamicForm form = Form.form().bindFromRequest();
        String email = form.field("email").value();
        String password = form.field("password").value();

        AppUser user = AppUser.authenticate(email, password);

        if (user == null) {
            flash("login-error", "Incorrect email or password! Try again.");
        }else if(user.userAccessLevel == UserAccessLevel.ADMIN){
            SessionsAndCookies.setUserCookies(user);
            SessionsAndCookies.setUserSessionData(user);
            return redirect(routes.AppUsers.adminPanelRender(user.id));
        }else if(user.userAccessLevel == UserAccessLevel.USER){
            SessionsAndCookies.setUserCookies(user);
            SessionsAndCookies.setUserSessionData(user);
            return redirect(routes.AppUsers.userPanelRender(user.id));

        }
        flash("login-error", "Incorrect email or password! Please, try again.");
        return redirect(routes.Application.index());
    }


    /* ------------------- logout  ------------------ */
    public Result logout(){
        SessionsAndCookies.clearUserSessionData();
        SessionsAndCookies.clearCookies();
        return redirect(routes.Application.index());
    }

}
