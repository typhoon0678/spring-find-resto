package com.typhoon0678.findresto.controller;

import com.typhoon0678.findresto.domain.Restaurant;
import com.typhoon0678.findresto.dto.AddRestaurantRequest;
import com.typhoon0678.findresto.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestaurantApiController {

    private final RestaurantService restaurantService;

    @PostMapping("api/restaurants")
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody AddRestaurantRequest request) {
        Restaurant savedRestaurant = restaurantService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRestaurant);
    }
}
