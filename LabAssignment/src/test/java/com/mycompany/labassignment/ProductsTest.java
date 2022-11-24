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
public class ProductsTest {
    static Products product1;
    static Products product2;
    
    public ProductsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
     * Test of setPrice method, of class Products.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int Price = 50;
        Products instance = product2;
        instance.setPrice(Price);
        
        
    }

    /**
     * Test of setId method, of class Products.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 3;
        Products instance = product2;
        instance.setId(Id);
        
        
    }

    /**
     * Test of setName method, of class Products.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "Corriander";
        Products instance = product2;
        instance.setName(Name);
        
        
    }

    /**
     * Test of setGroup method, of class Products.
     */
    @Test
    public void testSetGroup() {
        System.out.println("setGroup");
        String Group = "Veg";
        Products instance = product2;
        instance.setGroup(Group);
       
    }

    /**
     * Test of setSubgroup method, of class Products.
     */
    @Test
    public void testSetSubgroup() {
        System.out.println("setSubgroup");
        String Subgroup = "Veg";
        Products instance = product2;
        instance.setSubgroup(Subgroup);
        
    }

    /**
     * Test of getId method, of class Products.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Products instance = product1;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getName method, of class Products.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Products instance = product1;
        String expResult = "Carrot";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getGroup method, of class Products.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        Products instance = product1;
        String expResult = "Vegetable";
        String result = instance.getGroup();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSubgroup method, of class Products.
     */
    @Test
    public void testGetSubgroup() {
        System.out.println("getSubgroup");
        Products instance = product1;
        String expResult = "Winter Veg";
        String result = instance.getSubgroup();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPrice method, of class Products.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Products instance = product1;
        int expResult = 100;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        
    }
    
}
