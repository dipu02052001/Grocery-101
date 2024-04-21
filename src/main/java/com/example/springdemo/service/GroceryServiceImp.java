package com.example.springdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.Category;
import com.example.springdemo.model.Grocery;
import com.example.springdemo.repository.CatogeryRepository;
import com.example.springdemo.repository.GroceryRepository;

@Service
public class GroceryServiceImp implements GroceryService {


    @Autowired
    private GroceryRepository groceryRepository;

    @Autowired
    private CatogeryRepository categoryRepository;


    @SuppressWarnings("null")
    @Override
    public Grocery saveinGrovery(Grocery grocery) {
        // TODO Auto-generated method stub
        return groceryRepository.save(grocery);
    }


    
    @Override
    public List<Grocery> getAllGrocery() {
        // TODO Auto-generated method stub
        
        return  groceryRepository.findAll();
    }



    @SuppressWarnings("null")
    @Override
    public Category saveinCatogery(Category category) {
        // TODO Auto-generated method stub
          return categoryRepository.save(category);
    }


    

}