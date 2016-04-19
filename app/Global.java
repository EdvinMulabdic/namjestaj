import com.cloudinary.Cloudinary;
import models.Image;
import play.Application;
import play.GlobalSettings;
import play.Play;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;
import views.html.notFound;
import play.mvc.Http.RequestHeader;


import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;


public class Global extends GlobalSettings {

    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader requestHeader) {
        return F.Promise.<Result>pure(notFound(notFound.render()));
    }

    @Override
    public F.Promise<Result> onBadRequest(Http.RequestHeader request, String error) {
        return F.Promise.<Result>pure(badRequest(notFound.render()));
    }
    @Override
    public  void onStart(Application application) {

        /**
         * Calls a thread that will check reservations every hour.
         * If reservation checkoutDate passed currentDate they will
         * be set as completed.
         */

       Image.cloudinary = new Cloudinary("cloudinary://" + Play.application().configuration().getString("cloudinary.string"));
    }
}

