package com.tahri.Food.Order.Controller;

import com.tahri.Food.Order.model.Food;
import com.tahri.Food.Order.model.Restaurant;
import com.tahri.Food.Order.model.User;
import com.tahri.Food.Order.request.CreateFoodRequest;
import com.tahri.Food.Order.service.FoodService;
import com.tahri.Food.Order.service.RestaurantService;
import com.tahri.Food.Order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private UserService userService;
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name, @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.searchFood(name);

        return new ResponseEntity<>(foods, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam String name, @RequestParam boolean vegetarian, @RequestParam boolean nonVegetarian, @RequestParam(required = false) String foood_category, @RequestParam boolean seasonal, @PathVariable Long restaurantId, @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.getRestaurantsFood(restaurantId, vegetarian, nonVegetarian, seasonal, foood_category);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }
}
