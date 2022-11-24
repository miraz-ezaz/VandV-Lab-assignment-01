/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.labassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CustomerTest {
    
    static Customer customer1;
    static Customer customer2;
    static Products product1;
    static Products product2;
    
    public CustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        customer1 = new Customer("1", "Miraj", "Sylhet", 123456);
        customer1 = new Customer("2", "Ejaz", "Dhaka", 789);
        product1 = new Products(0, "Carrot", "Vegetable", "Winter Veg", 100);
        product2 = new Products(1, "Cabbage", "Vegetable", "Winter Veg", 80);
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of AddToCart method, of class Customer.
     */
    @Test
    public void testAddToCart() {
        System.out.println("AddToCart");
        Products product = product1;
        Customer instance = customer1;
        instance.AddToCart(product);
        assertEquals(1,customer1.cart.productList.size());
        customer1.AddToCart(product2);
        assertEquals(2,customer1.cart.productList.size());
        
    }

    /**
     * Test of BuyProducts method, of class Customer.
     */
    @Test
    public void testBuyProducts() {
        System.out.println("BuyProducts");
        Products product = product1;
        Customer instance = customer1;
        instance.BuyProducts(product);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ViewProducts method, of class Customer.
     */
    @Test
    public void testViewProducts() {
        System.out.println("ViewProducts");
        Customer instance = customer1;
        instance.ViewProducts();
        
        
    }

    /**
     * Test of MakePayment method, of class Customer.
     */
    @Test
    public void testMakePayment() {
        System.out.println("MakePayment");
        String CardType = "Debit";
        String CardNo = "10101";
        Customer instance = customer1;
        instance.MakePayment(CardType, CardNo);
        
    }

    

    /**
     * Test of DeleteFromCart method, of class Customer.
     */
    @Test
    public void testDeleteFromCart() {
        System.out.println("DeleteFromCart");
        int Id = 0;
        Customer instance = customer1;
        instance.DeleteFromCart(Id);
        assertEquals(1,customer1.cart.productList.size());
        
    }
    
}
