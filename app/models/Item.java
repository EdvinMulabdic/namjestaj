package models;

import com.avaje.ebean.Model;
import play.Logger;

import javax.persistence.*;
import java.util.*;

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
    public Integer average_Grade;
    public Date dateOfActivation;
    public Date dateOfDeActivation;
    public Date blockingDate;
    public Boolean isActive;
    public Boolean isVisible;
    public Boolean isBlocked;

    @ManyToOne
    public AppUser user;

    @ManyToOne
    public Category category;

    @ManyToOne
    public SubCategory subCategory;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="item")
    public List<Image> images;

    @OneToMany
    public List<Review> reviews;

    public Item(){
    }

    @Override
    public String toString() {
        return   name + ' ' +
                price + ' ' +
                description + ' ' +
                category.name + ' ' +
                subCategory.name;
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
        item.oldPrice = "0";
        item.description = description;
        item.average_Grade = 0;
        item.dateOfActivation = new Date();
        item.isVisible = false;
        item.user = user;
        item.category = category;
        item.isActive = true;
        item.isBlocked = false;
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

        /* ------------------- find all active items  ------------------ */

    public static List<Item> allActiveItems() {
        return finder.where().eq("is_active",  1).eq("is_blocked", 0).findList();
    }

     /* ------------------- find all active items for home page shuffle  ------------------ */

    public static List<Item> allActiveItemsShuffled() {
        List<Item> items = allActiveItems();
        Collections.shuffle(items);
        return items;
    }

    /* ------------------- get last 10 products from database ------------------ */

    public static List<Item> getLastTenProducts(){
        List<Item> allItems = allActiveItems();
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

     /* --------------- Item  activate/deactivate  ---------------*/

    public static Integer isItemActive(Integer itemId){
        Item  item = findItemById(itemId);
        if(item.isActive == false) {
            item.isActive = true;
            item.dateOfActivation = new Date();
        }else if(item.isActive == true){
            item.isActive = false;
            item.dateOfDeActivation = new Date();
        }
        item.update();
        return item.user.id;
    }

     /* --------------- Item  block/unblock  ---------------*/

    public static void isItemBlocked(Integer itemId){
        Item  item = findItemById(itemId);
        if(item.isBlocked == false) {
            item.isBlocked = true;
            item.blockingDate = new Date();
        }else if(item.isBlocked == true){
            item.isBlocked = false;
        }
        item.update();
    }


    /* --------------- List of items for homepage slider ---------------*/

    public static List<Item> itemsForHomepageSlider(){
        List<Item> itemsForHomepageSlider = new ArrayList<>();
        List<Item> items = finder.where().eq("isVisible", true).findList();
        for(int i = 0; i < items.size(); i ++) {
            if(items.get(i).isActive == true && items.get(i).isBlocked == false) {
                itemsForHomepageSlider.add(items.get(i));
            }
        }
        return itemsForHomepageSlider;
    }

    /* --------------- Items to recommend. We recommend items with same subcategory ---------------*/

    public static List<Item> itemsToRecommend(Integer itemId) {

        Item item = findItemById(itemId);
//        Integer price = Integer.parseInt(item.price);
//        List<Integer> prices = new ArrayList<>();
        Integer subcategoryId = item.subCategory.id;
        List<Item> itemsToRecommend = new ArrayList<>();


            List<Item> items = finder.where().eq("sub_category_id", subcategoryId).findList();

            for(int i = 0; i < items.size(); i ++ ) {
                if(items.get(i).isActive == true && items.get(i).isBlocked == false) {
                    itemsToRecommend.add(items.get(i));
                }
            }


        if(items.size() > 10 ) {
            itemsToRecommend = items.subList(0 , 10);
        }else{
            itemsToRecommend = items;
        }

        Collections.shuffle(itemsToRecommend);

        return itemsToRecommend;
    }

    /* ------------------- return items with cagtegories  ------------------ */
    public static List<Item> itemsWithCategory(Integer categoryId) {
        List<Item> itemsWithCategory = new ArrayList<>();
        List<Item> items = finder.where().eq("category_id", categoryId).findList();

        for(int i = 0; i < items.size(); i ++ ) {
            if(items.get(i).isActive == true && items.get(i).isBlocked == false) {
                itemsWithCategory.add(items.get(i));
            }
        }
        return itemsWithCategory;
    }

    /* ------------------- return items with subCagtegories  ------------------ */
    public static List<Item> itemsWithSubCategory(Integer subCategoryId) {
        List<Item> itemsWithSubCategory = new ArrayList<>();
        List<Item> items = finder.where().eq("sub_category_id", subCategoryId).findList();
        for(int i = 0; i < items.size(); i ++ ) {
            if(items.get(i).isActive == true && items.get(i).isBlocked == false) {
                itemsWithSubCategory.add(items.get(i));
            }
        }
        return itemsWithSubCategory;
    }

    /* ------------------- return items with price range < 100 ------------------ */
    public static List<Item> itemsWithPriceRange1() {
        List<Item> allActiveItems = allActiveItems();
        List<Item> itemsToRetrun = new ArrayList<>();
        for(int i = 0; i < allActiveItems.size(); i ++) {
            if (Integer.parseInt(allActiveItems.get(i).price )< 100) {
                itemsToRetrun.add(allActiveItems.get(i));
            }
        }
        return itemsToRetrun;
    }

    /* ------------------- return items with price range >100 < 150 ------------------ */
    public static List<Item> itemsWithPriceRange2() {
        List<Item> allItems = allActiveItems();
        List<Item> itemsToRetrun = new ArrayList<>();
        for(int i = 0; i < allItems.size(); i ++) {
            if (Integer.parseInt(allItems.get(i).price) > 100 && Integer.parseInt(allItems.get(i).price) < 150 ) {
                itemsToRetrun.add(allItems.get(i));
            }
        }
        return itemsToRetrun;
    }

    /* ------------------- return items with price range > 150  <200 ------------------ */
    public static List<Item> itemsWithPriceRange3() {
        List<Item> allItems = allActiveItems();
        List<Item> itemsToRetrun = new ArrayList<>();
        for(int i = 0; i < allItems.size(); i ++) {
            if (Integer.parseInt(allItems.get(i).price ) > 150 && Integer.parseInt(allItems.get(i).price ) < 200) {
                itemsToRetrun.add(allItems.get(i));
            }
        }
        return itemsToRetrun;
    }

    /* ------------------- return items with price range > 200 ------------------ */
    public static List<Item> itemsWithPriceRange4 () {
        List<Item> allItems = allActiveItems();
        List<Item> itemsToRetrun = new ArrayList<>();
        for(int i = 0; i < allItems.size(); i ++) {
            if (Integer.parseInt(allItems.get(i).price ) > 200) {
                itemsToRetrun.add(allItems.get(i));
            }
        }
        return itemsToRetrun;
    }


        /* ------------------- return items with action price ------------------ */

    public static List<Item> itemsOnSale () {
        List<Item> allItems = allActiveItems();
        List<Item> itemsToReturn = new ArrayList<>();
        for(Item item: allItems) {
            if(!item.oldPrice.equals("0")) {
                itemsToReturn.add(item);
            }
        }
//        for(int i = 0; i < allItems.size(); i++) {
//            if(!allItems.get(i).oldPrice.equals("") ){
//                itemsToReturn.add(allItems.get(i));
//            }
//        }
        return itemsToReturn;
//        List<Item> allItems = finder.where().isNotNull("old_price").findList();
//        return allItems;

    }


    public static List<Item> searchBox(String term) {
        List<Item> items = finder.all();
        List<Item> itemsToReturn = new ArrayList<>();

        for(int i = 0; i < items.size(); i ++) {
            if(items.get(i).toString().toLowerCase().contains(term.toLowerCase())) {
                itemsToReturn.add(items.get(i));
            }
        }
        return itemsToReturn;


    }

        /* ------------------- top rated items  ------------------ */

    public static List<Item> topRatedItems() {
        List<Item> itemsToShuffle = new ArrayList<>();
        List<Item> itemsToReturn = new ArrayList<>();
        List<Item> fiveStarItems = finder.where().eq("average_grade",5).findList();
        if(fiveStarItems.size() < 10) {
            for(Item item: fiveStarItems) {
                itemsToShuffle.add(item);
            }
        }
        List<Item> fourStarItems = finder.where().eq("average_grade",4).findList();
        for(Item item: fourStarItems) {
            itemsToShuffle.add(item);
        }
        if(itemsToShuffle.size() > 10 ) {
            itemsToReturn = itemsToShuffle.subList(0, 10);
            Collections.shuffle(itemsToReturn);
            return itemsToReturn;
        }else{
            List<Item> threeStarItems = finder.where().eq("average_grade",3).findList();
            for(Item item: threeStarItems) {
                itemsToShuffle.add(item);
            }
            if(itemsToShuffle.size() > 10) {
                itemsToReturn = itemsToShuffle.subList(0,10);
                Collections.shuffle(itemsToReturn);
                return itemsToReturn;
            }else{
                Collections.shuffle(itemsToReturn);

                return fiveStarItems;
            }
        }
    }
}
