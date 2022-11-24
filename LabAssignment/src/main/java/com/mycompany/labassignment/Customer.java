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
public class Customer {
    String Id;
    String Name;
    String Address;
    int PhNo;
    Cart cart;
    ArrayList<Products> productList;
    Payment payment;

    public Customer(String Id, String Name, String Address, int PhNo) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.PhNo = PhNo;
        this.cart = new Cart(Integer.parseInt(Id));
        this.productList = new ArrayList<Products>();
        this.payment = new Payment();
    }

   
    
    public void BuyProducts(Products product){
        
        System.out.println("Product :" + product.Name + "Buying Successfull");
        
    }
    
    public void ViewProducts(){
        
    }
    
    public void MakePayment(String CardType, String CardNo){
        this.payment.setCardNo(CardNo);
        this.payment.setCardType(CardType);
        this.payment.setName(this.Name);
        this.payment.setCustomerId(this.Id);
        this.payment.setPrice(this.cart.Total);
        this.payment.MakePayment();
        
    }
    
    public void AddToCart(Products product){
        cart.AddToCart(product);
        
    }
    
    public void DeleteFromCart(int Id){
        
        cart.productList.remove(Id);
        
    }
}
