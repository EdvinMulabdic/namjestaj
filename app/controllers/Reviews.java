package controllers;

import models.Review;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by User on 4/22/2016.
 */
public class Reviews extends Controller {

    /* ------------------- save review ------------------ */

    public Result saveReview(Integer itemId) {
        DynamicForm form = Form.form().bindFromRequest();
        Integer mark = Integer.parseInt(form.field("mark").value());
        String name = form.field("name").value();
        String email = form.field("email").value();
        String phone = form.field("phone").value();

        Review.saveReview(mark, name, email, phone, itemId);
        flash("success", "Hvala Vam što se odvojili vrijeme i ocijenili proizvod.");
        return redirect(routes.Items.itemRender(itemId));
    }


    /* ------------------- item reviews list ------------------ */

    public Result itemReviews(Integer itemId) {
        List<Review> reviews = Review.allItemReviews(itemId);
        return ok(views.html.Admin.itemsReviews.render(reviews));
    }


    /* ------------------- delete item review ------------------ */

    public Result deleteReview(Integer reviewId) {
        Integer itemId = Review.deleteReview(reviewId);
        return redirect(routes.Reviews.itemReviews(itemId));
    }

}
