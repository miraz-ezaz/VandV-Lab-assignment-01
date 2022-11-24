/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.labassignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class GuestTest {
    
    Guest guest;
    Guest guest2;
    
    public GuestTest() {
    }

    /**
     * Test of ViewProducts method, of class Guest.
     */
    @Test
    public void testViewProducts() {
        Guest guest = new Guest();
        guest.ViewProducts();
    }

    /**
     * Test of GetRegistered method, of class Guest.
     */
    @Test
    public void testGetRegistered() {
        Guest guest2 = new Guest();
        guest2.GetRegistered("1", "Miraj", "Sylhet", 123456);
    }
    
}
