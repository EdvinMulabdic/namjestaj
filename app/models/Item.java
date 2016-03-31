package models;

import com.avaje.ebean.Model;
import play.Logger;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public String oldPrice;
    @Column(columnDefinition = "TEXT")
    public String description;

    public Boolean isVisible;

    @ManyToOne
    public AppUser user;

    @ManyToOne
    public Category category;

    @ManyToOne
    public SubCategory subCategory;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="item")
    public List<Image> images;


    public Item(){
    }

    public Item(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static Finder<String, Item> finder = new Finder<>(Item.class);


    /* ------------------- create item ------------------ */
    public static Integer createItem(String name, String price, String description,Category category, AppUser user){
        Item item = new Item();
        item.name = name;
        item.price = price;
        item.description = description;
        item.isVisible = false;
        item.user = user;
        item.category = category;
        item.save();
        return item.id;
    }


    /* ------------------- update item ------------------ */

    public static Integer updateItem(String name, String oldPrice, String price, String description,Category category,SubCategory subCategory, Integer itemId){
        Item item = findItemById(itemId);
        item.name = name;
        item.oldPrice = oldPrice;
        item.price = price;
        item.description = description;
        item.category = category;
        item.subCategory = subCategory;
        item.update();
        return item.user.id;
    }

    /* ------------------- delete item ------------------ */

    public static  Boolean deleteItem(Integer itemId){
        Item item = findItemById(itemId);
        List<Image> itemImages = Image.findImagesByItemId(itemId);
        try{
            for(int i = 0; i < itemImages.size(); i ++){
                Image.deleteImage(itemImages.get(i));
            }
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

    /* ------------------- find all items  ------------------ */

    public static List<Item> allItems(){
        return finder.all();
    }

    /* ------------------- get last 10 products from database ------------------ */

    public static List<Item> getLastTenProducts(){
        List<Item> allItems = finder.all();
        List<Item> items = new ArrayList<>();
        if (allItems.size() > 10){
             items = allItems.subList(allItems.size()-10, allItems.size());
             Collections.reverse(items);
             return  items;
        }else{
            Collections.reverse(allItems);
            return allItems;
        }
    }

    /* ------------------- get first image if item has images, else return default image ------------------ */

    public static Image getFirstItemImage(Integer itemId) {
        Item item = findItemById(itemId);
        if (item.images.size() > 0) {
            return item.images.get(0);
        } else {
            return null;
        }
    }

    /* --------------- Item  visibility on homepage slider ---------------*/

    public static void isVisible(Integer itemId){
        Item  item = findItemById(itemId);
        if(item.isVisible == false) {
            item.isVisible = true;
        }else if(item.isVisible == true){
            item.isVisible = false;
        }
        item.update();
    }

          /* --------------- List of items for homepage slider ---------------*/

    public static List<Item> itemsForHomepageSlider(){
        List<Item> items = finder.where().eq("isVisible", true).findList();
        return items;
    }

    /* --------------- Items to recommend ---------------*/

    public static List<Item> itemsToRecommend(Integer itemId) {

        Item item = findItemById(itemId);
        Integer price = Integer.parseInt(item.price);
        Integer categoryId = item.category.id;

        List<Item> itemsWithSameCategory = finder.where().eq("category_id", categoryId).findList();
        List<Item> itemsToRecommend = new ArrayList<>();
        List<Integer> prices = new ArrayList<>();

//        for(int i = 0; i < itemsWithSameCategory.size(); i++) {
//            prices.add(Integer.parseInt(itemsWithSameCategory.get(i).price));
//        }
//
//        for(int k=0; k < prices.size(); k++) {
//            for (int j = price - 50; j <= price + 50; j++) {
//
//                if (itemsWithSameCategory.size() != 0 && Integer.parseInt(itemsWithSameCategory.get(k).price) == j) {
//                    itemsToRecommend.add(itemsWithSameCategory.get(k));
//                }
//
//            }
//        }
        if(itemsWithSameCategory.size() > 10 ) {
            itemsToRecommend = itemsWithSameCategory.subList(0 , 10);
        }else{
            itemsToRecommend = itemsWithSameCategory;
        }

        Collections.shuffle(itemsToRecommend);

        return itemsToRecommend;
    }

    /* ------------------- return items with cagtegories  ------------------ */
    public static List<Item> itemsWithCategory(Integer categoryId) {
        return finder.where().eq("category_id", categoryId).findList();
    }

    /* ------------------- return items with subCagtegories  ------------------ */
    public static List<Item> itemsWithSubCategory(Integer subCategoryId) {
        return finder.where().eq("sub_category_id", subCategoryId).findList();
    }
}
