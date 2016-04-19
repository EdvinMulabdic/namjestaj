package controllers;

import helpers.Authenticator;
import models.Image;
import models.Item;
import models.News;
import play.Logger;
import play.mvc.*;
import views.html.imagesUpload;

import java.io.File;
import java.util.List;

/**
 * Created by User on 3/27/2016.
 */
public class Images extends Controller {

    /* ------------------- images upload render ------------------ */
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result imagesUploadRender(Integer itemId){
        return ok(imagesUpload.render(itemId));
    }

        /* ------------------- images upload  ------------------ */
//        @BodyParser.Of(value = BodyParser.MultipartFormData.class, maxLength = 1000 * 1024)
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result imagesUpload(Integer itemId) {
        Item item = Item.findItemById(itemId);

        Http.MultipartFormData body1 = request().body().asMultipartFormData();
        List<Http.MultipartFormData.FilePart> fileParts = body1.getFiles();
        if (fileParts != null) {
            for (Http.MultipartFormData.FilePart filePart1 : fileParts) {
                File file = filePart1.getFile();
                Image image = Image.create(file, item.id);
                item.images.add(image);
            }
        }
        item.update();
        return redirect(routes.Images.listOfPicturesRender(item.id));
    }

    /* ------------------- list of images render ------------------ */
    public Result listOfPicturesRender(Integer itemId){
        List<Image> images = Image.findImagesByItemId(itemId);
        return ok(views.html.Item.listOfImages.render(images, itemId));
    }

    /* ------------------- delete image ------------------ */
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result deleteImage(String image_public_id){
        Image image = Image.findImageById(image_public_id);
        Integer itemId =  Image.deleteImage(image);
        return redirect(routes.Images.listOfPicturesRender(itemId));
    }

}
