package controllers;

import helpers.Authenticator;
import models.Category;
import models.SubCategory;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Collection;
import java.util.Collections;
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
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createCategory(){
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        Category.createCategory(name);
        return redirect(routes.Categories.listOfCategories());
    }


    /* ------------------- update category render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateCategoryRender(Integer categoryId){
        Category category = Category.findCategoryById(categoryId);
        return ok(views.html.Category.updateCategory.render(category));
    }

    /* ------------------- update category  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateCategory(Integer categoryId){
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        Category.updateCategory(name, categoryId);
        return redirect(routes.Categories.listOfCategories());
    }

    /* ------------------- delete category  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result deleteCategory(Integer categoryId){
        Category.deleteCategory(categoryId);
        return redirect(routes.Categories.listOfCategories());

    }
     /* ------------------- list of categories  ------------------ */

    public Result listOfCategories(){
        List<Category> categories = Category.findAllCategories();
        return ok(views.html.Category.listOfCategories.render(categories));
    }



        /* -----------------------------------------------  SUBCATEGORIES ---------------------------------------------- */




    /* ------------------- create  subcategory  render ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public  Result createSubCategoryRender(Integer categoryId) {
        return ok(views.html.Category.createSubCategory.render(categoryId));
    }

    /* ------------------- create  subcategory   ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result createSubCategory(Integer categoryId) {
        Category category = Category.findCategoryById(categoryId);
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        SubCategory.createSubCategory(name, category);
        return redirect(routes.Categories.listOfSubCategories(categoryId));
    }


    /* ------------------- list of subcategories  ------------------ */

    public Result listOfSubCategories(Integer categoryId){
        List<SubCategory> subCategories = SubCategory.allSubCategories(categoryId);

        return ok(views.html.Category.listOfSubCategories.render(subCategories, categoryId));
    }


    /* ------------------- update  subcategory render  ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateSubCategoryRender(Integer subcategoryId) {
        SubCategory subcategory = SubCategory.findSubCategoryById(subcategoryId);
        return ok(views.html.Category.updateSubCategory.render(subcategory));
    }


    /* ------------------- update  subcategory   ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result updateSubCategory(Integer subcategoryId) {
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        Integer categoryId = SubCategory.updateSubCategory(name, subcategoryId);
        return redirect(routes.Categories.listOfSubCategories(categoryId));
    }


    /* ------------------- delete  subcategory   ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result deleteSubCategory(Integer subcategoryId) {
        Integer categoryId = SubCategory.deleteSubCategory(subcategoryId);
        return redirect(routes.Categories.listOfSubCategories(categoryId));
    }




}
