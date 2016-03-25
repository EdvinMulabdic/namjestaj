package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by User on 3/17/2016.
 */
@Entity
public class Store extends Model {

    @Id
    public Integer id;
    public String name;
    public String city;
    public String address;
    @ManyToOne
    public AppUser user;

    public Store(){
    }

    public Store(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    @Override
    public String toString() {
        return  name + '-' + address +' '+ city ;
    }

    public static Finder<String, Store> finder = new Finder<>(Store.class);


        /* ------------------- create store ------------------ */

    public static void creteStore(String name, String city, String address, AppUser user){
        Store store = new Store();
        store.name = name;
        store.city = city;
        store.address = address;
        store.user = user;
        store.save();
    }

            /* ------------------- update store ------------------ */

    public static Integer updateStore(String name, String city, String address, Integer storeId){
        Store store = findStoreById(storeId);
        store.name = name;
        store.city = city;
        store.address = address;
        store.update();
        return store.user.id;
    }

            /* ------------------- delete store ------------------ */
    public static Integer deleteStore(Integer storeId){
        Store store = findStoreById(storeId);
        store.delete();
        return store.user.id;
    }


          /* ------------------- get all users stores ------------------ */

    public static List<Store> userStores(Integer userId){
        return  finder.where().eq("user_id", userId).findList();
    }

          /* ------------------- find store by Id ------------------ */
    public static Store findStoreById(Integer storeId){
        return finder.where().eq("id", storeId).findUnique();
    }

}
