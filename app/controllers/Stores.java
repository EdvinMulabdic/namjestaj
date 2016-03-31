package controllers;

import helpers.Authenticator;
import models.AppUser;
import models.Store;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

/**
 * Created by User on 3/17/2016.
 */
public class Stores extends Controller {

    /* ------------------- create store render------------------ */
    public Result createStoreRender(Integer userId){
        return ok(views.html.Store.createStore.render(userId));
    }
        /* ------------------- create store ------------------ */
        @Security.Authenticated(Authenticator.UserFilter.class)
    public Result createStore(Integer userId){
        AppUser user = AppUser.findUserById(userId);
        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String city = form.field("city").value();
        String address = form.field("address").value();

        Store.creteStore(name, city, address, user);
        return redirect(routes.Stores.listOfStores(userId));
    }

        /* ------------------- update store render------------------ */
    public Result updateStoreRender(Integer storeId){
        Store store = Store.findStoreById(storeId);
        return ok(views.html.Store.updateStore.render(store));
    }

            /* ------------------- update store ------------------ */
            @Security.Authenticated(Authenticator.UserFilter.class)
    public Result updateStore(Integer storeId) {

        DynamicForm form = Form.form().bindFromRequest();

        String name = form.field("name").value();
        String city = form.field("city").value();
        String address = form.field("address").value();
        Integer userId = Store.updateStore(name, city, address, storeId);

        return redirect(routes.Stores.listOfStores(userId));
    }

            /* ------------------- delete store ------------------ */
            @Security.Authenticated(Authenticator.UserFilter.class)
    public Result deleteStore(Integer storeId){
        Integer userId = Store.deleteStore(storeId);
        return redirect(routes.Stores.listOfStores(userId));
    }

    /* ------------------- list of stores ------------------ */
    public Result listOfStores(Integer userId){
        List<Store> stores = Store.userStores(userId);
        return ok(views.html.Store.listOfStores.render(stores, userId));
    }

}
