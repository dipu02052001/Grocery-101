package com.example.springdemo.service;

import java.util.List;
import com.example.springdemo.model.Grocery;
import com.example.springdemo.model.Category;


public interface GroceryService {

    //delacred a abstract method
    //set into data base using class which contains the getter setter 
    public Grocery saveinGrovery(Grocery grocery);

    //get the data from database 
    public List<Grocery> getAllGrocery(); 

    public Category saveinCatogery(Category category);


}


