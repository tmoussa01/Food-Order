package com.tahri.Food.Order.Controller;

import com.tahri.Food.Order.model.IngredientCategory;
import com.tahri.Food.Order.model.IngredientsItem;
import com.tahri.Food.Order.request.IngredientCategoryRequest;
import com.tahri.Food.Order.request.IngredientRequest;
import com.tahri.Food.Order.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientController {
    @Autowired
    private IngredientsService ingredientsService;

    @PostMapping("/category")
    public ResponseEntity<IngredientCategory> createIngredientCategory(@RequestBody IngredientCategoryRequest request) throws Exception {
        IngredientCategory ingredientCategory = ingredientsService.createIngredientCategory(request.getName(), request.getRestaurantId());
        return new ResponseEntity<>(ingredientCategory, HttpStatus.CREATED);
    }

    @PostMapping()
    public ResponseEntity<IngredientsItem> createIngredientItem(@RequestBody IngredientRequest request) throws Exception {
        IngredientsItem ingredientsItem = ingredientsService.createIngredientItem(request.getRestaurantId(), request.getName(), request.getCategoryId());
        return new ResponseEntity<>(ingredientsItem, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/stoke")
    public ResponseEntity<IngredientsItem> updateIngredientStock(@PathVariable Long id) throws Exception {
        IngredientsItem ingredientsItem = ingredientsService.updateStock(id);
        return new ResponseEntity<>(ingredientsItem, HttpStatus.OK);
    }

    @GetMapping("restaurant/{id}")
    public ResponseEntity<List<IngredientsItem>> getRestaurantIngredient(@PathVariable Long id) throws Exception {
        List<IngredientsItem> ingredientsItem = ingredientsService.findRestaurantsIngredients(id);
        return new ResponseEntity<>(ingredientsItem, HttpStatus.OK);
    }

    @GetMapping("restaurant/{id}/category")
    public ResponseEntity<List<IngredientCategory>> getRestaurantIngredientCategory(@PathVariable Long id) throws Exception {
        List<IngredientCategory> ingredientsItem = ingredientsService.findIngredientCategoryByRestaurantId(id);
        return new ResponseEntity<>(ingredientsItem, HttpStatus.OK);
    }

}
