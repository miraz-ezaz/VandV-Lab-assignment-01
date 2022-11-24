/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class Customer {
    String Id;
    String Name;
    String Address;
    int PhNo;
    Cart cart;

    public Customer(String Id, String Name, String Address, int PhNo) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.PhNo = PhNo;
        this.cart = new Cart(Id)
    }

   
    
    public void BuyProducts(Products product){
        
    }
    
    public void ViewProducts(){
        
    }
    
    public void MakePayment(){
        
    }
    
    public void AddToCart(Products product){
        cart.AddToCart(product);
        
    }
    
    public void DeleteFromCart(int Id){
        
        cart.productList.remove(Id);
        
    }
}
