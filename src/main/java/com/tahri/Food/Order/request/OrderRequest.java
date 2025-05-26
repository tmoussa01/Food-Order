package com.tahri.Food.Order.request;

import com.tahri.Food.Order.model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}
