package mx.rfpro.delivery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import mx.rfpro.delivery.model.Category;
import mx.rfpro.delivery.model.LoginRequest;
import mx.rfpro.delivery.model.LoginResponse;
import mx.rfpro.delivery.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("v1/api")
public class ServiceTesterController{

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

    @GetMapping("/support")
    public ResponseEntity getAllCategories() {
		try{
			return ResponseEntity.ok(categories);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body(ex.getMessage());
		}
    }
    
    @PostMapping("/auth/signup")
    public ResponseEntity signUp(@RequestBody User user) {

      try{
        return ResponseEntity.ok(user);
      } catch (Exception ex) {
        return ResponseEntity.status(500).body(ex.getMessage());
      }

    }

    @PostMapping("/auth/login")
    public ResponseEntity login(@RequestBody LoginRequest loginRequest) {
      UUID uuid = UUID.randomUUID();
      LoginResponse loginResponse = new LoginResponse();
      loginResponse.setToken(uuid.toString());
      uuid = UUID.randomUUID();
      loginResponse.setRefreshToken(uuid.toString());
      try{
        return ResponseEntity.ok(loginResponse);
      } catch (Exception ex) {
        return ResponseEntity.status(500).body(ex.getMessage());
      }

    }
}