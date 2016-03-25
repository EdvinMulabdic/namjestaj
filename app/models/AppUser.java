package models;

import com.avaje.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;
import play.Logger;

import javax.persistence.*;
import java.util.List;

/**
 * Created by User on 3/14/2016.
 */
@Entity
public class AppUser extends Model {

    @Id
    public Integer id;
    public String name;
    public String email;
    public String phone;
    public String city;
    public String address;
    public String password;
    public Integer userAccessLevel;

    @OneToMany(cascade = CascadeType.ALL)
    public Item item;

    @OneToMany(cascade = CascadeType.ALL)
    public Store store;

    public AppUser(){
    }

    public AppUser(String name, String email, String phone, String city, String address, String password, Integer userAccessLevel) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.password = password;
        this.userAccessLevel = userAccessLevel;
    }

    public static Finder<String, AppUser> finder = new Finder<>(AppUser.class);

    /* ------------------- authenticate user ------------------ */
    public static AppUser authenticate(String email, String password) {

        AppUser user = finder.where().eq("email", email).findUnique();

        if (user != null && BCrypt.checkpw(password, user.password)) {
            return user;
        } else {
            return null;
        }
    }

     /* ------------------- finds user by id ------------------ */

    public static AppUser findUserById(Integer id){
        return finder.where().eq("id", id).findUnique();
    }

      /* ------------------- finds user by email ------------------ */

    public static AppUser findUserByEmail(String email){
        return finder.where().eq("email", email).findUnique();
    }

    /* ------------------- finds user by email ------------------ */

    public static List<AppUser> getAllUsers(){
        Finder<String, AppUser> finder = new Finder<>(AppUser.class);
        List<AppUser> users = finder.all();
        return users;
    }

    /**
     * Hashes user password.
     */
    public void hashPass() {
        this.password = BCrypt.hashpw(this.password, BCrypt.gensalt());

    }
     /* ------------------- update admin informations ------------------ */
    public static Boolean updateAdminInformations(String name, String city, String address, String phone, Integer adminId){
        AppUser user = findUserById(adminId);
        if(user != null){
            try {
                user.name = name;
                user.city = city;
                user.address = address;
                user.phone = phone;
                user.update();
            }catch (PersistenceException e ){
                    Logger.error("Failed to update user password" + e.getMessage());
                    return false;
                }
            }
            return false;
    }


    /* ------------------- update admin password ------------------ */

    public static Boolean updateAdminPassword(AppUser user, String password){
        if(user != null){
            try{
                user.password = password;
                user.hashPass();
                user.update();
            }catch (PersistenceException e ){
                Logger.error("Failed to update user password" + e.getMessage());
                return false;
            }
        }
        return false;

    }


    /* ------------------- create user ------------------ */

    public static Boolean createUser(String name, String email, String phone, String city, String address, String password){
        AppUser appUser = findUserByEmail(email);
        if(appUser == null){
            AppUser user = new AppUser();
            try {
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.city = city;
                user.address = address;
                user.password = password;
                user.hashPass();
                user.userAccessLevel = 2;
                user.save();
                return true;
            }catch (PersistenceException e){
                Logger.info("Neuspjelo kreiranje korisnika " + e.getMessage());
                return false;
            }
        }
        return false;


    }

    /* ------------------- update user informations ------------------ */
    public static Boolean updateUserInformations(String name, String city, String address, String phone, Integer userId){
        AppUser user = findUserById(userId);
        if(user != null){
            try {
                user.name = name;
                user.city = city;
                user.address = address;
                user.phone = phone;
                user.update();
            }catch (PersistenceException e ){
                Logger.error("Failed to update user password" + e.getMessage());
                return false;
            }
        }
        return false;
    }

    /* ------------------- update user password ------------------ */

    public static Boolean updateUserPassword(AppUser user, String password){
        if(user != null){
            try{
                user.password = password;
                user.hashPass();
                user.update();
            }catch (PersistenceException e ){
                Logger.error("Failed to update user password" + e.getMessage());
                return false;
            }
        }
        return false;

    }


    /* ------------------- delete user ------------------ */

    public static void deleteUser(Integer userId){
        AppUser user = findUserById(userId);

        user.delete();
    }



}
