package com.tahri.Food.Order.service;

import com.tahri.Food.Order.model.Category;

import java.util.List;

public interface CategoryService {
    public Category createCategory(String name, Long userI)throws Exception;

    public List<Category> findCategoryByRestaurantId(Long id) throws Exception;

    public Category findCategoryId(Long id) throws Exception;

}
