package controllers;

import helpers.Authenticator;
import helpers.UserAccessLevel;
import models.*;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 3/16/2016.
 */
public class Items extends Controller {

    /* ------------------- item render  ------------------ */
    public Result itemRender(Integer itemId){
        Item item = Item.findItemById(itemId);
        List<Store> stores = Store.userStores(item.user.id);
        List<Item> itemsToRecommend = Item.itemsToRecommend(itemId);
        AppUser currentUser = UserAccessLevel.getCurrentUser(ctx());

        List<String> locations = new ArrayList<>();
        for(int i = 0; i < stores.size(); i ++){
            locations.add(stores.get(i).toString());
        }
        return ok(views.html.Item.item.render(item, locations, currentUser, itemsToRecommend));
    }

    /* ------------------- create item render ------------------ */
    public Result createItemRender(Integer userId){
        return ok(views.html.Item.createItem.render(userId));
    }

    /* ------------------- create item  ------------------ */
    @Security.Authenticated(Authenticator.UserFilter.class)
    public Result createItem(Integer userId){
        AppUser user = AppUser.findUserById(userId);

        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String price = form.field("price").value();
        Integer categoryId =Integer.parseInt(form.field("category").value());
        String description = form.field("description").value();
        Category category = Category.findCategoryById(categoryId);

        Integer itemId = Item.createItem(name, price, description, category, user);

        return redirect(routes.Items.updateItemRender(itemId));
    }
    
        /* ------------------- update item render ------------------ */
        @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateItemRender(Integer itemId){
        Item item = Item.findItemById(itemId);
        return ok(views.html.Item.updateItem.render(item));
    }

            /* ------------------- update item  ------------------ */
            @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateItem(Integer itemId){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String oldPrice = form.field("oldPrice").value();
        String price = form.field("price").value();
        Integer categoryId =Integer.parseInt(form.field("category").value());
        Integer subCategoryId =Integer.parseInt(form.field("subCategory").value());
        String description = form.field("description").value();
        Category category = Category.findCategoryById(categoryId);
        SubCategory  subCategory = SubCategory.findSubCategoryById(subCategoryId);

        Integer userId = Item.updateItem(name, oldPrice, price, description, category,subCategory, itemId);

        return redirect(routes.Items.itemRender(itemId));
    }

            /* ------------------- delete item  ------------------ */
            @Security.Authenticated(Authenticator.UserFilter.class)
    public Result deleteItem(Integer itemId){
        Integer userId = Item.findItemById(itemId).user.id;
        boolean isDeleted = Item.deleteItem(itemId);
        if(isDeleted) {
            flash("success", "Proizvod je obrisan!");
            return redirect(routes.Items.listOfItems(userId));
        }else{
            flash("error", "Došlo je do greške.Proizvod nije obrisan!");
            return redirect(routes.Items.listOfItems(userId));
        }
    }


        /* ------------------- list of  user items  ------------------ */
        @Security.Authenticated(Authenticator.UserFilter.class)
    public Result listOfItems(Integer userId){
        List<Item> items = Item.findAllUserItems(userId);
        return ok(views.html.Item.listOfItems.render(items, userId));
    }

    /* ------------------- find all items ------------------ */
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result allItems(){
        List<Item> allItems = Item.allItems();
        return ok(views.html.Admin.listOfAllItems.render(allItems));
    }

    /* ------------------- last 10 products  ------------------ */

    public Result lastTenProducts(){
        Item.getLastTenProducts();
        return ok();
    }

    /* --------------- show item on homepage slider ---------------*/
    @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result showOnHomepage(Integer itemId){
        Item.isVisible(itemId);
        return redirect(routes.Items.allItems());
    }



      /* ------------------- return items with categories  ------------------ */

    public Result getItemsWithCategory(Integer categoryId) {
        List<Item> itemsWithCategory = Item.itemsWithCategory(categoryId);
        return ok(views.html.Item.categoryItems.render(itemsWithCategory));
    }

     /* ------------------- return items with subcategories  ------------------ */

    public Result getItemsWithSubCategory(Integer subcategoryId) {
        List<Item> itemsWithSubCategory = Item.itemsWithSubCategory(subcategoryId);
        return ok(views.html.Item.categoryItems.render(itemsWithSubCategory));
    }

     /* ------------------- return items with price range 1  ------------------ */

    public Result getItemsWithPriceRange1() {
        List<Item> itemsWithPriceRange1 = Item.itemsWithPriceRange1();
        return ok(views.html.Item.categoryItems.render(itemsWithPriceRange1));
    }

    /* ------------------- return items with price range 2  ------------------ */

    public Result getItemsWithPriceRange2() {
        List<Item> itemsWithPriceRange2 = Item.itemsWithPriceRange2();
        return ok(views.html.Item.categoryItems.render(itemsWithPriceRange2));
    }

    /* ------------------- return items with price range 3  ------------------ */

    public Result getItemsWithPriceRange3() {
        List<Item> itemsWithPriceRange3 = Item.itemsWithPriceRange3();
        return ok(views.html.Item.categoryItems.render(itemsWithPriceRange3));
    }

    /* ------------------- return items with price range 4  ------------------ */

    public Result getItemsWithPriceRange4() {
        List<Item> itemsWithPriceRange4 = Item.itemsWithPriceRange4();
        return ok(views.html.Item.categoryItems.render(itemsWithPriceRange4));
    }


    /* -------------------  items with sale price ------------------ */

    public Result itemsOnSale() {
        List<Item> itemsOnSale = Item.itemsOnSale();
        return ok(views.html.Item.categoryItems.render(itemsOnSale));
    }


}
