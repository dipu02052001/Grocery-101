package com.example.springdemo.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.model.Category;

public interface CatogeryRepository extends CrudRepository<Category,Integer> {
}
