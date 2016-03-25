package controllers;

import models.Category;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by User on 3/18/2016.
 */
public class Categories extends Controller {

            /* ------------------- create category render------------------ */

    public Result createCategoryRender(){
        return ok(views.html.Category.createCategory.render());
    }

                /* ------------------- create category ------------------ */

    public Result createCategory(){
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        Category.createCategory(name);
        return redirect(routes.Categories.listOfCategories());
    }


            /* ------------------- update category render ------------------ */

    public Result updateCategoryRender(Integer categoryId){
        Category category = Category.findCategoryById(categoryId);
        return ok(views.html.Category.updateCategory.render(category));
    }

                /* ------------------- update category  ------------------ */
    public Result updateCategory(Integer categoryId){
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        Category.updateCategory(name, categoryId);
        return redirect(routes.Categories.listOfCategories());
    }

                    /* ------------------- delete category  ------------------ */

    public Result deleteCategory(Integer categoryId){
        Category.deleteCategory(categoryId);
        return redirect(routes.Categories.listOfCategories());

    }
     /* ------------------- list od categories  ------------------ */

    public Result listOfCategories(){
        List<Category> categories = Category.findAllCategories();
        return ok(views.html.Category.listOfCategories.render(categories));
    }
}
