package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 3/30/2016.
 */
@Entity
public class SubCategory extends Model {

    @Id
    public Integer id;
    public String name;

    @ManyToOne
    public Category category;

    public SubCategory() {}

    public SubCategory(Category category, String name) {
        this.category = category;
        this.name = name;
    }

    public static Finder<String, SubCategory> finder = new Finder<>(SubCategory.class);


    /* ------------------- create subcategories  ------------------ */
    public static void createSubCategory(String name, Category category) {

        SubCategory subCategory = new SubCategory();
        subCategory.name = name;
        subCategory.category = category;
        subCategory.save();
    }

    /* ------------------- all subcategories of specific category  ------------------ */

    public static List<SubCategory> allSubCategories (Integer categoryId) {
        return  finder.where().eq("category_id", categoryId).orderBy("id").findList();

    }


    /* ------------------- find subcategory by Id------------------ */

    public static SubCategory findSubCategoryById(Integer subcategoryId) {
        return finder.where().eq("id", subcategoryId).findUnique();
    }

    /* ------------------- update subcategory ------------------ */

    public static Integer updateSubCategory(String name, Integer subcategoryId) {
        SubCategory subCategory = findSubCategoryById(subcategoryId);
        subCategory.name = name;
        subCategory.update();
        return subCategory.category.id;
    }


    /* ------------------- delete subcategory ------------------ */

    public static Integer deleteSubCategory(Integer subcategoryId) {
        SubCategory subCategory = findSubCategoryById(subcategoryId);
        subCategory.delete();
        return subCategory.category.id;
    }
}
