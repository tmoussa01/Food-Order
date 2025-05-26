package com.tahri.Food.Order.request;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
    private Long cartItem;
    private int quantity;
}
