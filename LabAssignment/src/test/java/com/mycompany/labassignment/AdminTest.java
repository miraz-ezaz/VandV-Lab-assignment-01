/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.labassignment;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author User
 */
public class AdminTest {
    static Admin admin;
    static Admin admin1;
    static Products product1;
    static Products product2;
    
    
    public AdminTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
        
        admin = new Admin(1, "Admin");
        admin1 = new Admin(1, "Admin1");
        product1 = new Products(0, "Carrot", "Vegetable", "Winter Veg", 100);
        product2 = new Products(1, "Cabbage", "Vegetable", "Winter Veg", 80);
        
        
        admin.AddProducts(product1);
        admin.AddProducts(product2);
        
        
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of ViewProducts method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testViewProducts() {
        assertEquals(2, admin.productList.size());
        assertEquals("Carrot", admin.productList.get(0).Name);
        assertEquals("Cabbage", admin.productList.get(1).Name);
        assertEquals("Vegetable", admin.productList.get(0).Group);
        assertEquals("Winter Veg", admin.productList.get(0).Subgroup);
        assertEquals(100, admin.productList.get(0).Price);
        assertEquals("Vegetable", admin.productList.get(1).Group);
        assertEquals("Winter Veg", admin.productList.get(1).Subgroup);
        assertEquals(80, admin.productList.get(1).Price);
        
    }

    /**
     * Test of AddProducts method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testAddProducts() {
        admin1.AddProducts(product1);
        assertEquals(1, admin1.productList.size());
        admin1.AddProducts(product2);
        assertEquals(2, admin1.productList.size());
    }

    /**
     * Test of DeleteProducts method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testDeleteProducts() {
        
        admin1.DeleteProducts(0);
        assertEquals(1, admin1.productList.size());
        
    }

    /**
     * Test of ModifyProducts method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testModifyProducts() {
        
        admin1.ModifyProducts(0, product1.Name, product1.Group, product1.Subgroup, 150);
        assertEquals(150, admin1.productList.get(0).Price);
    }

    /**
     * Test of MakeShipment method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testMakeShipment() {
        
        admin1.MakeShipment();
    }

    /**
     * Test of ConfirmDelivery method, of class Admin.
     */
    @org.junit.jupiter.api.Test
    public void testConfirmDelivery() {
        admin.ConfirmDelivery();
    }
    
}
