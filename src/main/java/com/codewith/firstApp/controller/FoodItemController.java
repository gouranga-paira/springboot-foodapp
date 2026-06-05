package com.codewith.firstApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codewith.firstApp.entity.FoodItems;
import com.codewith.firstApp.Repository.FoodItemRepository;

@RestController
@RequestMapping("/api/foods")
public class FoodItemController {
    private final FoodItemRepository foodItemRepository;

    public FoodItemController(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    @GetMapping // Get all food items(read)
    public List<FoodItems> getAllFoodITems() {
        return foodItemRepository.findAll();
    }

    @PostMapping // Post a food item(create)
    public FoodItems createFoodItem(FoodItems foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @GetMapping("/{id}") // Get a food item by id(read)
    public FoodItems getFoodItemById(@PathVariable Long id) {
        return foodItemRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}") // Update a food item(update)
    public FoodItems updateFoodItem(@PathVariable Long id, FoodItems foodItemDetails) {
        FoodItems foodItem = foodItemRepository.findById(id).orElse(null);
        if (foodItem != null) {
            foodItem.setName(foodItemDetails.getName());
            foodItem.setPrice(foodItemDetails.getPrice());
            return foodItemRepository.save(foodItem);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFoodItem(@PathVariable Long id) {
        foodItemRepository.deleteById(id);
    }

}
