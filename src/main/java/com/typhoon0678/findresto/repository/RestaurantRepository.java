package com.typhoon0678.findresto.repository;

import com.typhoon0678.findresto.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
