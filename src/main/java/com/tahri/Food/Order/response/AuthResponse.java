package com.tahri.Food.Order.response;

import com.tahri.Food.Order.model.User_Role;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private User_Role role;
}
