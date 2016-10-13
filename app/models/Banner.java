package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by User on 6/8/2016.
 */
@Entity
public class Banner extends Model {
    @Id
    public Integer id;
    public Integer bannerPosition;
    public String link;
    public String image;

    public Banner(){}

    public static Finder<String, Banner> finder = new Finder<>(Banner.class);

    public static Banner findBannerById(Integer bannerId) {
        return finder.where().eq("id", bannerId).findUnique();
    }

    public static Banner findBannerByPosition(Integer bannerPosition) {
        return finder.where().eq("banner_position", bannerPosition).findUnique();
    }

    public static Banner createBanner(String link, String image, Integer bannerPosition) {
        Banner banner = new Banner();
        banner.link = link;
        banner.image = image;
        banner.bannerPosition = bannerPosition;
        banner.save();

        return banner;
    }

    public static void deleteBanner(Integer bannerId) {
        Banner banner = findBannerById(bannerId);
        banner.delete();
    }

    public static List<Banner> getAllBanners() {
        return finder.all();
    }
}
