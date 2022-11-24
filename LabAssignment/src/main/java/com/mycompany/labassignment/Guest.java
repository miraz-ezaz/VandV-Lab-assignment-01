/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class Guest {

    public Guest() {
    }
    
    
    
    public void ViewProducts(){
        
    }
    
    public void GetRegistered(String Id, String Name, String Address, int PhNo){
        Customer customer = new Customer(Id, Name, Address, PhNo);
        System.out.println("Customer Registration SuccessFull. Name: " + customer.Name);
        
    }
    
}
