package com.example.springdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.Grocery;
import com.example.springdemo.service.GroceryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;



@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @PostMapping("/additems")
    public String addItems(@RequestBody Grocery grocery) {
        //TODO: process POST request
        
        groceryService.saveinGrovery(grocery);
        return "New Grocery item is added";
    }

    @GetMapping("/getitems")
    public List<Grocery> getItems() {

        return groceryService.getAllGrocery();

    }

    
    


    
}
