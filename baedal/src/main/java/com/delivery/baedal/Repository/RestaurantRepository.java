package com.delivery.baedal.Repository;

import com.delivery.baedal.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    Restaurant findByName(String name);
}
