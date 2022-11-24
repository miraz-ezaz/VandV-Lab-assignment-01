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
public class ProductList {
    ArrayList<Products> productList;
    Products product1 = new Products(0, "Carrot", "Vegetable", "Winter Veg", 100);
    Products product2 = new Products(1, "Cabbage", "Vegetable", "Winter Veg", 80);

    public ProductList() {
        
        productList = new ArrayList<Products>();
        productList.add(product1);
        productList.add(product2);   
    }
    
    public void ViewProducts() {
        for (Products product : productList){
            System.out.println(product.Name);
        }
    }
    
    
    
}
