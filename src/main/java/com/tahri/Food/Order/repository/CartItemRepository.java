package com.tahri.Food.Order.repository;

import com.tahri.Food.Order.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
