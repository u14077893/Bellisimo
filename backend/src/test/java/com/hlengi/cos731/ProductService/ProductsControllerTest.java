/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.ProductService;

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
public class ProductsControllerTest {
    
    public ProductsControllerTest() {
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
     * Test of process method, of class ProductsController.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.process();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ProductsController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ProductsController.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchDataByName method, of class ProductsController.
     */
    @Test
    public void testFetchDataByName() {
        System.out.println("fetchDataByName");
        String name = "";
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.fetchDataByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPromotion method, of class ProductsController.
     */
    @Test
    public void testAddPromotion() {
        System.out.println("addPromotion");
        String prodName = "";
        String description = "";
        int price = 0;
        String image = "";
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.addPromotion(prodName, description, price, image);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProduct method, of class ProductsController.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        String prodName = "";
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.removeProduct(prodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProduct method, of class ProductsController.
     */
    @Test
    public void testUpdateProduct() {
        System.out.println("updateProduct");
        String prodName = "";
        ProductsController instance = new ProductsController();
        String expResult = "";
        String result = instance.updateProduct(prodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
