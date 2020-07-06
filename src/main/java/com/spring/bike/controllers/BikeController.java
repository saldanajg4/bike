package com.spring.bike.controllers;

import java.util.List;

import com.spring.bike.models.Bike;
import com.spring.bike.repositories.BikeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// @RequestMapping("/api/v1/bikes") //the /api/v1 are specified in the application properties servlet cotext-path
@RequestMapping("/bikes")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BikeController {
    // no constructor needed to access the JpaRepository
    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> list() {
        List<Bike> allBikes = this.bikeRepository.findAll();
        return allBikes;
    }
    
    /**
     * Take the bike body and persist it using Jpa save method to insert it 
     * into db.
     * @param Bike
     */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        this.bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        Bike bike = this.bikeRepository.getOne(id);

        return bike;
    }
}