package helpers;

import models.AppUser;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import controllers.routes;

/**
 * Created by User on 1/10/2016.
 */
public class Authenticator {

    public static class AdminFilter extends Security.Authenticator {

        @Override
        public String getUsername(Http.Context ctx) {
            if (!ctx.session().containsKey("email"))
                return null;
            String email = ctx.session().get("email");
            AppUser user = AppUser.findUserByEmail(email);
            if (user != null && user.userAccessLevel == UserAccessLevel.ADMIN)
                return user.email;
            return null;
        }
        @Override
        public Result onUnauthorized(Http.Context ctx) {
            return redirect(routes.Application.unAuthorized());
        }

    }
    public static class UserFilter extends Security.Authenticator {

        @Override
        public String getUsername(Http.Context ctx) {
            if (!ctx.session().containsKey("email"))
                return null;
            String email = ctx.session().get("email");
            AppUser user = AppUser.findUserByEmail(email);
            if (user != null && user.userAccessLevel == UserAccessLevel.USER)
                return user.email;
            return null;
        }
        @Override
        public Result onUnauthorized(Http.Context ctx) {
            return redirect(routes.Application.unAuthorized());
        }
    }

    public static class AdminUserFilter extends Security.Authenticator {

        @Override
        public String getUsername(Http.Context ctx) {
            if (!ctx.session().containsKey("email"))
                return null;
            String email = ctx.session().get("email");
            AppUser user = AppUser.findUserByEmail(email);
            if (user != null && user.userAccessLevel == UserAccessLevel.USER || user.userAccessLevel == UserAccessLevel.ADMIN)
                return user.email;
            return null;
        }

        @Override
        public Result onUnauthorized(Http.Context ctx) {
            return redirect(routes.Application.unAuthorized());
        }
    }

}
