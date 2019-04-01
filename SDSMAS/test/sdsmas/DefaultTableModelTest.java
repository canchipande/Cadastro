/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdsmas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Canchipande
 */
public class DefaultTableModelTest {
    
    public DefaultTableModelTest() {
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
     * Test of addColumn method, of class DefaultTableModel.
     */
    @Test
    public void testAddColumn() {
        System.out.println("addColumn");
        String nome_Completo = "";
        DefaultTableModel instance = new DefaultTableModel();
        instance.addColumn(nome_Completo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRow method, of class DefaultTableModel.
     */
    @Test
    public void testAddRow() {
        System.out.println("addRow");
        String[] agregar = null;
        DefaultTableModel instance = new DefaultTableModel();
        instance.addRow(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRow method, of class DefaultTableModel.
     */
    @Test
    public void testRemoveRow() {
        System.out.println("removeRow");
        int i = 0;
        DefaultTableModel instance = new DefaultTableModel();
        instance.removeRow(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
