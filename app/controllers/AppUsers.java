package controllers;

import helpers.Authenticator;
import models.AppUser;
import models.Email;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

/**
 * Created by User on 3/24/2016.
 */
public class AppUsers extends Controller {


        /* ------------------- admin panel render ------------------ */
        @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result adminPanelRender(Integer adminId){
            AppUser user = AppUser.findUserById(adminId);
        return ok(views.html.Admin.adminPanel.render(user));
    }

            /* ------------------- user panel render ------------------ */
        @Security.Authenticated(Authenticator.UserFilter.class)
    public Result userPanelRender(Integer userId){
            AppUser user = AppUser.findUserById(userId);
        return ok(views.html.AppUser.userPanel.render(user));
    }

    /* ------------------- admin panel list of users render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result listOfUsersRender(){
        List<AppUser> users = AppUser.getAllUsers();
        return ok(views.html.Admin.listOfUsers.render(users));
    }

    /* ------------------- create user render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createUserRender(){
        return ok(views.html.Admin.createUser.render());
    }

    /* ------------------- create user  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createUser(){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String email = form.field("email").value();
        String phone = form.field("phone").value();
        String city = form.field("city").value();
        String address = form.field("address").value();
        String password = form.field("password").value();

        boolean exists = AppUser.createUser(name, email, phone, city, address, password);
        if(exists){
            flash("success", "Korisnik uspješno kreiran!");
            Email.createAccountMail(email, password);
            return redirect(routes.AppUsers.listOfUsersRender());

        }else{
            flash("error", "Već postoji korisnik sa ovim mailom u bazi, molimo pokušajte neki drugi mail!");
            return redirect(routes.AppUsers.listOfUsersRender());
        }
    }

    /* ------------------- delete user ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)

    public Result deleteUser(Integer userId){
        AppUser.deleteUser(userId);
        return redirect(routes.AppUsers.listOfUsersRender());
    }

        /* ------------------- admin informations update render  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateAdminInformationsRender(Integer adminId){
        AppUser user = AppUser.findUserById(adminId);
        return ok(views.html.Admin.updateAdminInformations.render(user));
    }


    /* ------------------- admin informations update   ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateAdminInformations(Integer adminId){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String city = form.field("city").value();
        String address = form.field("address").value();
        String phone = form.field("phone").value();

        boolean updated = AppUser.updateAdminInformations(name, city, address, phone, adminId);
        if(!updated){
            flash("success", "Informacije uspješno ažurirane!");
            return redirect(routes.AppUsers.adminPanelRender(adminId));
        }else{
            flash("error", "Došlo je do greške. Informacije nisu ažurirane!");
            return redirect(routes.AppUsers.adminPanelRender(adminId));
        }
    }

    /* ------------------- admin password update  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateAdminPassword(Integer adminId){
        AppUser user = AppUser.findUserById(adminId);

        DynamicForm form = Form.form().bindFromRequest();
        String password = form.field("password").value();

        boolean isUpdated = AppUser.updateAdminPassword(user, password);

        if(!isUpdated){
            flash("success", "Vaš password je ažuriran");
            return redirect(routes.AppUsers.adminPanelRender(adminId));
        }else{
            flash("error-search", "Neuspjelo ažuriranje.");
            return redirect(routes.AppUsers.adminPanelRender(adminId));
        }
    }

    /* ------------------- user informations update render  ------------------ */
   @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateUserInformationsRender(Integer userId){
        AppUser user = AppUser.findUserById(userId);
        return ok(views.html.AppUser.updateUserInformations.render(user));
    }

    /* ------------------- user informations update render  ------------------ */
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateUserInformations(Integer userId){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String city = form.field("city").value();
        String address = form.field("address").value();
        String phone = form.field("phone").value();
        String workTime = form.field("workTime").value();

        boolean updated = AppUser.updateUserInformations(name, city, address, phone, workTime, userId);
        if(!updated){
            flash("success", "Informacije uspješno ažurirane!");
            return redirect(routes.AppUsers.userPanelRender(userId));
        }else{
            flash("error", "Došlo je do greške. Informacije nisu ažurirane!");
            return redirect(routes.AppUsers.userPanelRender(userId));
        }
    }

    /* ------------------- user password update  ------------------ */
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateUserPassword(Integer userId){
        AppUser user = AppUser.findUserById(userId);

        DynamicForm form = Form.form().bindFromRequest();
        String password = form.field("password").value();

        boolean isUpdated = AppUser.updateAdminPassword(user, password);

        if(!isUpdated){
            flash("success", "Vaš password je ažuriran");
            return redirect(routes.AppUsers.userPanelRender(userId));
        }else{
            flash("error-search", "Neuspjelo ažuriranje.");
            return redirect(routes.AppUsers.userPanelRender(userId));
        }
    }



        /* ------------------- change user status (activate/deactivate user) ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)

    public Result isUserActive(Integer userId) {
        AppUser.isUserActive(userId);
        return redirect(routes.AppUsers.listOfUsersRender());
    }
}
