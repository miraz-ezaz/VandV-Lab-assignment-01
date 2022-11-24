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
public class PaymentTest {
    
    public PaymentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
     * Test of MakePayment method, of class Payment.
     */
    @Test
    public void testMakePayment() {
        System.out.println("MakePayment");
        Payment instance = new Payment();
        boolean expResult = false;
        boolean result = instance.MakePayment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCustomerId method, of class Payment.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String CustomerId = "";
        Payment instance = new Payment();
        instance.setCustomerId(CustomerId);
        
    }

    /**
     * Test of setPrice method, of class Payment.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Payment instance = new Payment();
        instance.setPrice(price);
        
    }

    /**
     * Test of setName method, of class Payment.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Payment instance = new Payment();
        instance.setName(Name);
        
    }

    /**
     * Test of setCardType method, of class Payment.
     */
    @Test
    public void testSetCardType() {
        System.out.println("setCardType");
        String CardType = "";
        Payment instance = new Payment();
        instance.setCardType(CardType);
        
    }

    /**
     * Test of setCardNo method, of class Payment.
     */
    @Test
    public void testSetCardNo() {
        System.out.println("setCardNo");
        String CardNo = "";
        Payment instance = new Payment();
        instance.setCardNo(CardNo);
        
    }
    
}
