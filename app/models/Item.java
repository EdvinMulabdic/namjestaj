package models;

import com.avaje.ebean.Model;
import play.Logger;

import javax.persistence.*;
import java.util.List;

/**
 * Created by User on 3/16/2016.
 */
@Entity
public class Item extends Model {

    @Id
    public Integer id;
    public String name;
    public String price;
    @Column(columnDefinition = "TEXT")
    public String description;

    @ManyToOne(cascade = CascadeType.ALL)
    public AppUser user;
    @ManyToOne(cascade = CascadeType.ALL)
    public Category category;


    public Item(){

    }
    public Item(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static Finder<String, Item> finder = new Finder<>(Item.class);


    /* ------------------- create item ------------------ */
    public static void createItem(String name, String price, String description,Category category, AppUser user){
        Item item = new Item();
        item.name = name;
        item.price = price;
        item.description = description;
        item.user = user;
        item.category = category;
        item.save();
    }


    /* ------------------- update item ------------------ */

    public static Integer updateItem(String name, String price, String description,Category category, Integer itemId){
        Item item = findItemById(itemId);
        item.name = name;
        item.price = price;
        item.description = description;
        item.category = category;
        item.update();
        return item.user.id;
    }

    /* ------------------- delete item ------------------ */

    public static  Boolean deleteItem(Integer itemId){
        Item item = findItemById(itemId);
        try{
            item.delete();
            return true;
        }catch (PersistenceException e){
            Logger.error("Delete Error " + e.getMessage());
        }
        return false;
    }

    /* ------------------- find item by id ------------------ */

    public static Item findItemById(Integer itemId){
        return finder.where().eq("id", itemId).findUnique();
    }


        /* ------------------- find all items by userId ------------------ */

    public static List<Item> findAllUserItems(Integer userId){
        return finder.where().eq("user_id", userId).findList();
    }
}
