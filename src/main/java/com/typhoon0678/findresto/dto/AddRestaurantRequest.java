package com.typhoon0678.findresto.dto;

import com.typhoon0678.findresto.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddRestaurantRequest {

    private String name;
    private double lat;
    private double lng;

    public Restaurant toEntity() {
        return Restaurant.builder()
                .name(name)
                .lat(lat)
                .lng(lng)
                .build();
    }
}
