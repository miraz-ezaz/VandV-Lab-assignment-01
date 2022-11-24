/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class Payment {
    String CustomerId;
    String Name;
    String CardType;
    String CardNo;
    float price;
    public Payment(String CustomerId, String Name, String CardType, String CardNo) {
        this.CustomerId = CustomerId;
        this.Name = Name;
        this.CardType = CardType;
        this.CardNo = CardNo;
    }

    public Payment() {
    }
    
    public boolean MakePayment(){
        
        System.out.println("Payment Successfull");
        System.out.println("Total: "+this.price );
        return true;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }
    
    

   
}
