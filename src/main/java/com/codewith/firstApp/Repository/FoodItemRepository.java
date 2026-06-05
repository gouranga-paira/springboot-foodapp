package com.codewith.firstApp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.codewith.firstApp.entity.FoodItems;
public interface FoodItemRepository extends JpaRepository<FoodItems, Long> {
    
}
