/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.UserService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hjita
 */
public class UsersControllerTest {
    
    public UsersControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of process method, of class UsersController.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        UsersController instance = new UsersController();
        String expResult = "";
        String result = instance.process();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class UsersController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        UsersController instance = new UsersController();
        String expResult = "";
        String result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class UsersController.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 0L;
        UsersController instance = new UsersController();
        String expResult = "";
        String result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchDataByEmail method, of class UsersController.
     */
    @Test
    public void testFetchDataByEmail() {
        System.out.println("fetchDataByEmail");
        String email = "";
        UsersController instance = new UsersController();
        String expResult = "";
        String result = instance.fetchDataByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
