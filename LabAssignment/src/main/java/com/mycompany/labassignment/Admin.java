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
public class Admin {
    int Id;
    String Name;
    ArrayList<Products> productList;
    

    public Admin(int Id, String Name) {
        this.productList = new ArrayList<Products>();
        this.Id = Id;
        this.Name = Name;
    }
    
    
    
    public ArrayList<Products> ViewProducts(){
        for (Products product : productList){
            System.out.println(product.Name);
        }
        return productList;
        
    }
    
    public void AddProducts(Products product){
        productList.add(product);
        
    }
    public void DeleteProducts(int Id){
        productList.remove(Id);
    } 
    
    public void ModifyProducts(int Id, String Name, String Group, String Subgroup, int Price){
        Products product = productList.get(Id);
        product.setName(Name);
        product.setGroup(Group);
        product.setPrice(Price);
        
    }
    
    public void MakeShipment(){
        System.out.println("Shipment Successfull.");
        
    }
    
    public void ConfirmDelivery(){
        System.out.println("Delivery Confirmed.");
        
    }
}
