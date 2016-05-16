package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 4/22/2016.
 */
@Entity
public class Review extends Model{

    @Id
    public Integer id;
    public Integer mark;
    public String name;
    public String email;
    public String phone;

    @ManyToOne
    public Item item;

    public Review (){}

    public Review(Integer mark, String name, String email, String phone, Item item) {
        this.mark = mark;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.item = item;
    }

    public static Finder<String, Review> finder = new Finder<>(Review.class);

    public static Review findReviewById(Integer reviewId) {
        return finder.where().eq("id", reviewId).findUnique();
    }

    /* ------------------- save review ------------------ */

    public static void saveReview (Integer mark, String name, String email, String phone, Integer itemId) {
        Item item = Item.findItemById(itemId);

        Review review = new Review();
        review.mark = mark;
        review.name = name;
        review.email = email;
        review.phone = phone;
        review.item = item;
        review.save();

        List<Integer> itemsGrades = allItemsGrades(itemId);
        Integer sum = 0;
        Integer averageGrade = 0;
        if(itemsGrades.size() > 0 ) {
            for (int i = 0; i < itemsGrades.size(); i++) {
                sum += itemsGrades.get(i);
            }
            averageGrade = sum / itemsGrades.size();
            item.average_Grade = averageGrade;
            item.update();
        }

    }


    /* ------------------- delete review ------------------ */

    public static Integer deleteReview(Integer reviewId) {
        Review review = findReviewById(reviewId);
        review.delete();
        Item item = Item.findItemById(review.item.id);
        List<Integer> itemsGrades = allItemsGrades(item.id);
        Integer sum = 0;
        Integer averageGrade = 0;
        if(itemsGrades.size() > 0 ) {
            for (int i = 0; i < itemsGrades.size(); i++) {
                sum += itemsGrades.get(i);
            }
            averageGrade = sum / itemsGrades.size();
            item.average_Grade = averageGrade;
            item.update();
        }
        return item.id;
    }


    /* ------------------- find all item reviews ------------------ */

    public static List<Review> allItemReviews(Integer itemId) {
        return finder.where().eq("item_id", itemId).findList();
    }


        /* ------------------- find all item reviews grades ------------------ */

    public static List<Integer> allItemsGrades (Integer itemId) {
        List<Review> reviews = allItemReviews(itemId);
        List<Integer> itemsGrades = new ArrayList<>();
        for(int i = 0; i < reviews.size(); i++) {
            itemsGrades.add(reviews.get(i).mark);
        }
        return itemsGrades;
    }


    public static Integer getNumberOfReviews(Integer itemId) {
        return finder.where().eq("item_id", itemId).findRowCount();
    }
}
