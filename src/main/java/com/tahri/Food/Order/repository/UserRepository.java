package com.tahri.Food.Order.repository;

import com.tahri.Food.Order.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
}
