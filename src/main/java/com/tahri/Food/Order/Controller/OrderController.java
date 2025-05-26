package com.tahri.Food.Order.Controller;

import com.tahri.Food.Order.model.CartItem;
import com.tahri.Food.Order.model.Order;
import com.tahri.Food.Order.model.User;
import com.tahri.Food.Order.request.AddCartItemRequest;
import com.tahri.Food.Order.request.OrderRequest;
import com.tahri.Food.Order.service.OrderService;
import com.tahri.Food.Order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest request, @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        Order order = orderService.createOrder(request, user);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/order/user")
    public ResponseEntity<List<Order>> getOrderHistory(@RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Order> order = orderService.getUserOrder(user.getId());
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
