/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.peli;

import laivanupotus.domain.Laiva;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohman
 */
public class LaivanupotusTest {
    private Laiva laiva2;
    private Laivanupotus peli;
    
    public LaivanupotusTest() {
        this.laiva2 = new Laiva(2);
        this.peli = new Laivanupotus(10, 10);
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
    
    
    @Test
    public void laivaAsettuuTietylleValille() {
        peli.laivanAsetus(laiva2);
        assertTrue(laiva2.getLaivanEkaKoordinaattiX() >= 0);
        assertTrue(laiva2.getLaivanEkaKoordinaattiX() < 10);
    }
}