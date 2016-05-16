package controllers;

import models.AppUser;
import models.Item;
import models.Store;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/2/2016.
 */
public class Partners extends Controller {

    public Result partnerPanel() {
        List<AppUser> users = AppUser.getAllUsers();
        return ok(views.html.partner.partnerMain.render(users));
    }

    public Result partnerPageRender(Integer userId) {
        AppUser user = AppUser.findUserById(userId);
        List<Store> stores = Store.userStores(userId);
        List<String> locations = new ArrayList<>();

            for (int i = 0; i < stores.size(); i++) {
                locations.add(stores.get(i).toString());
            }

        List<Item> items = Item.findAllUserItems(userId);

        return ok(views.html.partner.userProfilePage.render(user, locations, items));
    }
}
