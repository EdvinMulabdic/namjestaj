package models;

import com.avaje.ebean.Model;
import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import play.Logger;
import play.Play;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
public class Image extends Model {

    @Id
    public Integer id;
    public String public_id;
    public String image_url;
    public String secret_image_url;

    @ManyToOne
    @JsonBackReference
    public Item item;

    @ManyToOne
    @JsonBackReference
    public News news;


    @ManyToOne
    @JsonBackReference
    public AppUser user;

    public static Cloudinary cloudinary;


    public static Finder<Integer, Image> finder = new Finder<Integer, Image>(Image.class);

    public static Image createImage(String public_id, String image_url, String secret_image_url, Item item) {
        Image image = new Image();
        image.public_id = public_id;
        image.image_url = image_url;
        image.secret_image_url = secret_image_url;
        image.item = item;
        image.save();
        return image;
    }

    public static Image create(String public_id, String image_url, String secret_image_url) {
        Image i = new Image();
        i.public_id = public_id;
        i.image_url = image_url;
        i.secret_image_url = secret_image_url;
        i.save();
        return i;
    }

    public static Image create(File image, Integer itemId) {
        Map result;

        try {
            result = cloudinary.uploader().upload(image, null);
            return create(result, itemId);

        } catch (IOException e) {
            Logger.debug("Failed to save image.", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static Image create(Map uploadResult, Integer itemId) {
        Image image = new Image();

        image.public_id = (String) uploadResult.get("public_id");
        image.image_url = (String) uploadResult.get("url");
        image.secret_image_url = (String) uploadResult.get("secure_url");
        if(itemId != null) {
            image.item = Item.findItemById(itemId);
        }
        image.save();
        return image;
    }

    /* ------------------- all images ------------------ */

    public static List<Image> all() {
        return finder.all();
    }

    /* ------------------- get image size ------------------ */

    public String getSize(int width, int height) {
        try {
            String url;

            url = cloudinary.url().format("jpg")
                    .transformation(new Transformation().width(width).height(height)).generate(public_id);

            return url;
        }catch (NullPointerException e){
            Logger.debug("Failed to receive image url.", e.getMessage());
            return "null";
        }
    }

    /* ------------------- delete image ------------------ */

    public static Integer deleteImage(Image image) {
        Integer itemId = image.item.id;
        try {
            cloudinary.uploader().destroy(image.public_id, null);
        } catch (IOException e) {
            Logger.debug("Failed to delete image.", e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        image.delete();
        return itemId;

    }

    /* ------------------- delete logo ------------------ */

    public static void deleteLogo(Image image, Integer userId) {
        AppUser user = AppUser.findUserById(userId);
        try {
            cloudinary.uploader().destroy(image.public_id, null);
        } catch (IOException e) {
            Logger.debug("Failed to delete image.", e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        image.delete();

    }

    /* ------------------- find images by item id ------------------ */

    public static List<Image> findImagesByItemId(Integer itemId){
        return finder.where().eq("item_id", itemId).findList();
    }

    /* ------------------- find images by news id ------------------ */

    public static List<Image> findImagesByNewsId(Integer newsId){
        return finder.where().eq("news_id", newsId).findList();
    }

     /* ------------------- find images by user id ------------------ */

    public static List<Image> findImagesByUserId(Integer userId){
        return finder.where().eq("user_id", userId).findList();
    }



    /* ------------------- find images by id ------------------ */

    public static Image findImageById(String public_id){
        return finder.where().eq("public_id", public_id).findUnique();
    }


    /* ------------------- create image for news ------------------ */

    public static Image createNews(File image, Integer newsId) {
        Map result;

        try {
            result = cloudinary.uploader().upload(image, null);
            return createNews(result, newsId);

        } catch (IOException e) {
            Logger.debug("Failed to save image.", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static Image createNews(Map uploadResult, Integer newsId) {
        Image image = new Image();

        image.public_id = (String) uploadResult.get("public_id");
        Logger.debug(image.public_id);
        image.image_url = (String) uploadResult.get("url");
        Logger.debug(image.image_url);
        image.secret_image_url = (String) uploadResult.get("secure_url");
        Logger.debug(image.secret_image_url);
        if(newsId != null) {
            image.news = News.findNewsById(newsId);
        }
        image.save();
        return image;
    }



     /* ------------------- create image for user ------------------ */

    public static Image createUserImage(File image, Integer userId) {
        Map result;

        try {
            result = cloudinary.uploader().upload(image, null);
            return createUserImage(result, userId);

        } catch (IOException e) {
            Logger.debug("Failed to save image.", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static Image createUserImage(Map uploadResult, Integer userId) {
        AppUser user = AppUser.findUserById(userId);
        Image image = new Image();

        image.public_id = (String) uploadResult.get("public_id");
        Logger.debug(image.public_id);
        image.image_url = (String) uploadResult.get("url");
        Logger.debug(image.image_url);
        image.secret_image_url = (String) uploadResult.get("secure_url");
        Logger.debug(image.secret_image_url);

        if(user != null) {
            if(user.images.size() > 0) {
               Image imageToDelete =  AppUser.findUserById(userId).images.get(0);
                deleteLogo(imageToDelete, userId);
            }
            image.user = user;
        }

        image.save();
        return image;
    }



}