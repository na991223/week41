package com.delivery.baedal.controller;

import com.delivery.baedal.Repository.RestaurantRepository;
import com.delivery.baedal.domain.Restaurant;
import com.delivery.baedal.dto.RestaurantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants(){

        return restaurantRepository.findAll();

    }

    @PostMapping("/restaurant/register")
    public Restaurant postRestaurants(@RequestBody RestaurantDto restaurantDto){

        Restaurant restaurant = new Restaurant(restaurantDto);

        return restaurantRepository.save(restaurant);
    }

}

