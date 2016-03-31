package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by User on 3/18/2016.
 */
@Entity
public class Category extends Model {
    @Id
    public Integer id;
    public String name;
    @OneToMany
    public Item item;

    public Category(){
    }

    public Category(Item item, String name) {
        this.item = item;
        this.name = name;
    }

    public static Finder<String, Category> finder = new Finder<>(Category.class);

            /* ------------------- create category ------------------ */

    public static void createCategory(String name){
        Category category = new Category();
        category.name = name;
        category.save();
    }

            /* ------------------- update category ------------------ */
    public static void updateCategory(String name, Integer categoryId){
        Category category = findCategoryById(categoryId);
        category.name = name;
        category.update();
    }

            /* ------------------- delete category ------------------ */
    public static void deleteCategory(Integer categoryId){
        Category category = findCategoryById(categoryId);
        category.delete();
    }

    /* ------------------- find category by Id ------------------ */
    public static Category findCategoryById(Integer category){
        return finder.where().eq("id", category).findUnique();
    }

        /* ------------------- find all categories ------------------ */
    public static List<Category> findAllCategories(){
        return finder.all();
    }



}
