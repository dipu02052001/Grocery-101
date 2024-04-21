package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grocery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Grocery_id;
    private String Grocery_description;
    private int product_id;
    private String product_name;
    private int catogery_id;
    private String catogery;
    private int payment_id;
    private int order_id;
    
    public Grocery() {
    }

    public Grocery(int grocery_id, String grocery_description, int product_id, String product_name, int catogery_id,
            String catogery, int payment_id, int order_id) {
        Grocery_id = grocery_id;
        Grocery_description = grocery_description;
        this.product_id = product_id;
        this.product_name = product_name;
        this.catogery_id = catogery_id;
        this.catogery = catogery;
        this.payment_id = payment_id;
        this.order_id = order_id;
    }

    public int getGrocery_id() {
        return Grocery_id;
    }

    public void setGrocery_id(int grocery_id) {
        Grocery_id = grocery_id;
    }

    public String getGrocery_description() {
        return Grocery_description;
    }

    public void setGrocery_description(String grocery_description) {
        Grocery_description = grocery_description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getCatogery_id() {
        return catogery_id;
    }

    public void setCatogery_id(int catogery_id) {
        this.catogery_id = catogery_id;
    }

    public String getCatogery() {
        return catogery;
    }

    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    


}
