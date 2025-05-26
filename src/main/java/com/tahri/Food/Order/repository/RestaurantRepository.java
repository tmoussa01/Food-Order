package com.tahri.Food.Order.repository;

import com.tahri.Food.Order.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    public Restaurant findByOwnerId(Long userId);

    @Query("SELECT r from Restaurant r WHERE lower(r.name) LIKE lower(concat('%',:query,'%')) OR lower(r.cuisineType) LIKE lower(concat('%',:query,'%'))")
    List<Restaurant> findBySearchQuery(String query);


}
