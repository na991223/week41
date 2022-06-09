package com.delivery.baedal.domain;

import com.delivery.baedal.dto.RestaurantDto;
import com.delivery.baedal.validator.RestaurantValidator;

import lombok.*;

import javax.persistence.*;



@NoArgsConstructor
@Entity
@Getter
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int minOrderPrice;

    @Column(nullable = false)
    private int deliveryFee;

    public Restaurant(String restaurantName, int minOrderPrice, int deliveryFee) {
        this.name = restaurantName;
        this.minOrderPrice = minOrderPrice;
        this.deliveryFee = deliveryFee;
    }

    public Restaurant(RestaurantDto restaurantDto){

        RestaurantValidator.productValidation(restaurantDto);


        this.name = restaurantDto.getName();
        this.minOrderPrice = restaurantDto.getMinOrderPrice();
        this.deliveryFee = restaurantDto.getDeliveryFee();
    }

}
