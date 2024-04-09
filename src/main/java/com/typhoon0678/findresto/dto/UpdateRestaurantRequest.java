package com.typhoon0678.findresto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateRestaurantRequest {
    private String name;
    private double lat;
    private double lng;
}
