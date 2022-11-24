/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class Products {
    int Id;
    String Name;
    String Group;
    String Subgroup;
    int Price;

    public Products(int Id, String Name, String Group, String Subgroup, int Price) {
        this.Id = Id;
        this.Name = Name;
        this.Group = Group;
        this.Subgroup = Subgroup;
        this.Price = Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public void setSubgroup(String Subgroup) {
        this.Subgroup = Subgroup;
    }

  
    
    
}
