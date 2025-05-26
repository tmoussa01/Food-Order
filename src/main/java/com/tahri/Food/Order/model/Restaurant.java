package com.tahri.Food.Order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User owner;
    private String name;
    private String description;
    @OneToOne
    private Address address;
    private String cuisineType;
    @Embedded
    private ContactInformation contactInformation;
    private String openingHours;
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();
    private LocalDateTime registrationDate;
    @ElementCollection
    @Column(length = 1000)
    private List<String> images;
    private boolean open;
    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Food> foods = new ArrayList<>();
}
