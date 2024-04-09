package com.typhoon0678.findresto.dto;

import com.typhoon0678.findresto.domain.Restaurant;
import lombok.Getter;

@Getter
public class RestaurantResponse {

    private String name;
    private double lat;
    private double lng;

    public RestaurantResponse(Restaurant restaurant) {
        this.name = restaurant.getName();
        this.lat = restaurant.getLat();
        this.lng = restaurant.getLng();
    }
}
