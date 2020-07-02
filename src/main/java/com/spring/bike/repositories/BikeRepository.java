package com.spring.bike.repositories;



import com.spring.bike.models.Bike;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    
}