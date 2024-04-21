package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

    // enum Catogerys{
    //   MILK,EGG,BISCUITS,CHCOCLATE;
    // }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int catogery_id;
    String catogery_name;

    public Category() {
    }


    


}
