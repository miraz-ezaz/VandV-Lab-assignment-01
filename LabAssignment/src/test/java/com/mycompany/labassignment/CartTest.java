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
public class CartTest {
    
    static Cart cart;
    static  Cart cart1;
    static Products product1;
    static Products product2;
    
    public CartTest() {
        
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        cart = new Cart(0);
        cart1 = new Cart(1);
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
     * Test of AddToCart method, of class Cart.
     */
    @Test
    public void testAddToCart() {
        System.out.println("AddToCart");
        cart.AddToCart(product1);
        assertEquals(1, cart.productList.size());
        
        cart.AddToCart(product2);
        
       assertEquals(2, cart.productList.size());
    }

    /**
     * Test of getNumberOfProducts method, of class Cart.
     */
    @Test
    public void testGetNumberOfProducts() {
        System.out.println("getNumberOfProducts");
        
        cart1.AddToCart(product1);
        
        assertEquals(1, cart1.getNumberOfProducts());
        
        cart1.AddToCart(product2);
        
        assertEquals(2, cart1.getNumberOfProducts());
    }

    /**
     * Test of getTotal method, of class Cart.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        
        assertEquals(180, cart.getTotal());
        assertEquals(180, cart1.getTotal());
    }
    
}
