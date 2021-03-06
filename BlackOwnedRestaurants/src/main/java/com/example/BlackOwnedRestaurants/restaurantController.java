package com.example.BlackOwnedRestaurants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class restaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/all-restaurants")
    public List<RestaurantEntity> getAllRestaurant(){
        List<RestaurantEntity> allRestaurantlist = restaurantRepository.findAll();
        return allRestaurantlist;

    }

    @GetMapping("/get-restaurant/{id}")
    public RestaurantEntity getRestaurantId(@PathVariable(value = "id") Integer restaurantId) {
        RestaurantEntity restaurantEntity = restaurantRepository.findById(restaurantId).get();
        return restaurantEntity;
    }

}
