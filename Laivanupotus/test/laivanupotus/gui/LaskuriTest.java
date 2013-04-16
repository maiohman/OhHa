/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

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
public class LaskuriTest {
    
    public LaskuriTest() {
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
    public void uusiLaskuri() {
        Laskuri laskuri = new Laskuri();
        assertTrue(laskuri.getMaara() == 0);
    }
}