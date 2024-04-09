package com.typhoon0678.findresto.service;

import com.typhoon0678.findresto.domain.Restaurant;
import com.typhoon0678.findresto.dto.AddRestaurantRequest;
import com.typhoon0678.findresto.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant save(AddRestaurantRequest request) {
        return restaurantRepository.save(request.toEntity());
    }
}
