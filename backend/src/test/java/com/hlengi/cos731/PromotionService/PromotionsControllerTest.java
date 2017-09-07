/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.PromotionService;

import java.util.Date;
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
public class PromotionsControllerTest {
    
    public PromotionsControllerTest() {
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
     * Test of process method, of class PromotionsController.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.process();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPromotion method, of class PromotionsController.
     */
    @Test
    public void testAddPromotion() {
        System.out.println("addPromotion");
        String prodName = "";
        Date start = null;
        Date end = null;
        int price = 0;
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.addPromotion(prodName, start, end, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePromotion method, of class PromotionsController.
     */
    @Test
    public void testRemovePromotion() {
        System.out.println("removePromotion");
        String prodName = "";
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.removePromotion(prodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class PromotionsController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class PromotionsController.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 0L;
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchDataByProduct method, of class PromotionsController.
     */
    @Test
    public void testFetchDataByProduct() {
        System.out.println("fetchDataByProduct");
        String prodName = "";
        PromotionsController instance = new PromotionsController();
        String expResult = "";
        String result = instance.fetchDataByProduct(prodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
