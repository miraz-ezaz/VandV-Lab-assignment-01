/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class Cart {

    public Cart(int Id, int NumberOfProducts, char Product1, char Product2, char Productn, float Price, float Total) {
        this.Id = Id;
        this.NumberOfProducts = NumberOfProducts;
        this.Product1 = Product1;
        this.Product2 = Product2;
        this.Productn = Productn;
        this.Price = Price;
        this.Total = Total;
    }
    
    
    
    int Id;
    int NumberOfProducts;
    char Product1;
    char Product2;
    char Productn;
    float Price;
    float Total;
}
