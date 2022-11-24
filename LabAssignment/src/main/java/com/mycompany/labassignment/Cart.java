/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cart {
    int Id;
    int NumberOfProducts;
    float Price;
    float Total;
    ArrayList<Products> productList;

    public Cart(int Id) {
        
        this.Id = Id;
        this.productList = new ArrayList<Products>();
        this.Total = 0 ;
    }
    
    public void AddToCart(Products product){
        productList.add(product);
        Total += product.Price;
                
    }
   

    public int getNumberOfProducts() {
        return productList.size();
    }

    public float getTotal() {
        return Total;
    }
    
    
    
    

    
    
}
