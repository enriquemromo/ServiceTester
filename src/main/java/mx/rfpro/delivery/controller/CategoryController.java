package mx.rfpro.delivery.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import mx.rfpro.delivery.model.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("v1/api/support")
public class CategoryController{

    private static List<Category> categories;

    static{
        categories = new ArrayList<Category>();

        categories.add(new Category("Vegetables", 43, "assets/images/categories/vegetables.png"));
        categories.add(new Category("Fruits", 32, "assets/images/categories/fruit.png"));
        categories.add(new Category("Bread", 22, "assets/images/categories/bread.png"));
        categories.add(new Category("Sweets", 56, "assets/images/categories/sweets.png"));
        categories.add(new Category("Pasta", 13, "assets/images/categories/pasta.png"));
        categories.add(new Category("Drinks", 26, "assets/images/categories/drinks.png"));
        categories.add(new Category("Fritangas", 1024, "assets/images/categories/vegetables.png"));
    }

    @GetMapping
    public ResponseEntity getAllCategories() {
		try{
			return ResponseEntity.ok(categories);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body(ex.getMessage());
		}
	}

}