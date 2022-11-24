

package com.mycompany.labassignment;

/**
 *
 * @author User
 */
public class LabAssignment {

    public static void main(String[] args) {
        System.out.println("Welcome to Online Shoping System");
        
        Admin admin = new Admin(1, "Admin");
        System.out.println("Admin Page");
        System.out.println("Admin Name: "+admin.Name);
        Products product1 = new Products(0, "Carrot", "Vegetable", "Winter Veg", 100);
        Products product2 = new Products(1, "Cabbage", "Vegetable", "Winter Veg", 80);
        
        
        admin.AddProducts(product1);
        admin.AddProducts(product2);
        
        System.out.println("Product Added");
        
        System.out.println("ProductList Page");
        admin.ViewProducts();
        
        
        
        System.out.println("Guest Page");
        Guest guest = new Guest();
        guest.ViewProducts();
        
        guest.GetRegistered("1", "Miraj", "Sylhet", 123456);
        
        
        
    }
}
