package app.daos;

import app.models.Categories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoriesDao {
    int createCategory();
    List<Categories> getAllCategories();
    Categories getCategoryById();
    int updateCategory();
    int deleteCategory();
}
