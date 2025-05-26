package com.tahri.Food.Order.service;

import com.tahri.Food.Order.model.IngredientCategory;
import com.tahri.Food.Order.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception;

    public IngredientCategory findIngredientCategory(long id) throws Exception;

    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;

    public List<IngredientsItem> findRestaurantsIngredients(Long restaurantId);

    public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception;

    public IngredientsItem updateStock(Long id) throws Exception;
}
