package controllers;

import models.AppUser;
import models.Category;
import models.Item;
import models.Store;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 3/16/2016.
 */
public class Items extends Controller {

    /* ------------------- item render  ------------------ */
    public Result itemRender(Integer itemId){
        Item item = Item.findItemById(itemId);
        List<Store> stores = Store.userStores(item.user.id);

        List<String> locations = new ArrayList<>();
        for(int i = 0; i < stores.size(); i ++){
            locations.add(stores.get(i).toString());
        }
        return ok(views.html.Item.item.render(item, locations));
    }

    /* ------------------- create item render ------------------ */
    public Result createItemRender(Integer userId){
        return ok(views.html.Item.createItem.render(userId));
    }

    /* ------------------- create item  ------------------ */

    public Result createItem(Integer userId){
        AppUser user = AppUser.findUserById(userId);

        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String price = form.field("price").value();
        Integer categoryId =Integer.parseInt(form.field("category").value());
        String description = form.field("description").value();
        Category category = Category.findCategoryById(categoryId);

        Item.createItem(name, price, description, category, user);

        return redirect(routes.Items.listOfItems(userId));
    }
    
        /* ------------------- update item render ------------------ */
    public Result updateItemRender(Integer itemId){
        Item item = Item.findItemById(itemId);
        return ok(views.html.Item.updateItem.render(item));
    }

            /* ------------------- update item  ------------------ */
    public Result updateItem(Integer itemId){
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String price = form.field("price").value();
        Integer categoryId =Integer.parseInt(form.field("category").value());
        String description = form.field("description").value();
        Category category = Category.findCategoryById(categoryId);


        Integer userId = Item.updateItem(name, price, description, category, itemId);

        return redirect(routes.Items.listOfItems(userId));
    }

            /* ------------------- delete item  ------------------ */

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


        /* ------------------- list of items  ------------------ */

    public Result listOfItems(Integer userId){
        List<Item> items = Item.findAllUserItems(userId);
        return ok(views.html.Item.listOfItems.render(items, userId));
    }
}
