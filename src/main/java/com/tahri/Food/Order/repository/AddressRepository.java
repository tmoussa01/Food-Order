package com.tahri.Food.Order.repository;

import com.tahri.Food.Order.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
