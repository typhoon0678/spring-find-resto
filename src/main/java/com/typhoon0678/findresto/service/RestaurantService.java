package com.typhoon0678.findresto.service;

import com.typhoon0678.findresto.domain.Restaurant;
import com.typhoon0678.findresto.dto.AddRestaurantRequest;
import com.typhoon0678.findresto.dto.UpdateRestaurantRequest;
import com.typhoon0678.findresto.repository.RestaurantRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant save(AddRestaurantRequest request) {
        return restaurantRepository.save(request.toEntity());
    }

    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    public Restaurant findById(Long id) {
        return restaurantRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("id: " + id + " not found"));
    }

    public void delete(Long id) {
        restaurantRepository.deleteById(id);
    }

    @Transactional
    public Restaurant update(long id, UpdateRestaurantRequest request) {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("id: " + id + " not found"));

        restaurant.update(request.getName(), request.getLat(), request.getLng());

        return restaurant;
    }
}
