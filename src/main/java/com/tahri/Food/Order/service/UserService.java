package com.tahri.Food.Order.service;

import com.tahri.Food.Order.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
