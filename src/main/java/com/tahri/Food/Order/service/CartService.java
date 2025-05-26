package com.tahri.Food.Order.service;

import com.tahri.Food.Order.model.Cart;
import com.tahri.Food.Order.model.CartItem;
import com.tahri.Food.Order.request.AddCartItemRequest;

public interface CartService {
    public CartItem addItemToCart(AddCartItemRequest request, String jwt) throws Exception;

    public CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws Exception;

    public Cart removeItemFromcart(Long cartItemId, String jwt) throws Exception;

    public Long calculateCartTotals(Cart cart) throws Exception;

    public Cart findCartById(Long id) throws Exception;

    public Cart findCartByUserId(Long userId) throws Exception;

    public Cart clearCart(Long userId) throws Exception;
}
