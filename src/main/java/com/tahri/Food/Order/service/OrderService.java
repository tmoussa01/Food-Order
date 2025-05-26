package com.tahri.Food.Order.service;

import com.tahri.Food.Order.model.Order;
import com.tahri.Food.Order.model.User;
import com.tahri.Food.Order.request.OrderRequest;

import java.util.List;

public interface OrderService {
    public Order createOrder(OrderRequest request, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus) throws Exception;

    public void cancelOrder(Long orderId) throws Exception;

    public List<Order> getUserOrder(Long userId) throws Exception;

    public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus) throws Exception;

    public Order findOrderById(Long orderId) throws Exception;
}
