package helpers;

import models.AppUser;
import play.mvc.Http;

public class UserAccessLevel {
    public static final Integer ADMIN = 1;
    public static final Integer USER = 2;



    public static AppUser getCurrentUser(Http.Context ctx) {
        String email = ctx.session().get("email");
        if (email == null)
            return null;
        return AppUser.findUserByEmail(email);
    }
}

