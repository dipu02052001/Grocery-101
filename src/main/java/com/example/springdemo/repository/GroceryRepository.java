package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.model.Grocery;

@Repository
public interface GroceryRepository extends JpaRepository<Grocery,Integer>{

    
}
