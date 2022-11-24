/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labassignment;

import org.junit.jupiter.api.BeforeAll;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class MockPaymentTest {
    static Payment payment;

    public MockPaymentTest() {
    }
    @BeforeAll
    public static void setUpClass() {
        payment = mock(Payment.class);
    }
    
    @Test 
    public void testMakePayment() {
        when(payment.MakePayment()).thenReturn(Boolean.TRUE);
        assertTrue(payment.MakePayment());
                
    }
    
    
    
}
