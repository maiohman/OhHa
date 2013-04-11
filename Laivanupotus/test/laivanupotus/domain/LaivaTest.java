/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.domain;

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
public class LaivaTest {
    
    public LaivaTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void uudenLaivanEkaKoordinaattiX() {
        Laiva laivaII = new Laiva(2);
        laivaII.setLaivanAlkuKoordinaatit(1, 4, 2);
        assertTrue(laivaII.getLaivanEkaKoordinaattiX() == 1);
    }
    
    @Test
    public void uudenLaivanEkaKoordinaattiY() {
        Laiva laivaII = new Laiva(2);
        laivaII.setLaivanAlkuKoordinaatit(1, 4, 2);
        assertTrue(laivaII.getLaivanEkaKoordinaattiY() == 4);
    }
    
    @Test
    public void uudenLaivanPituus() {
        Laiva laivaII = new Laiva(3);
        assertTrue(laivaII.getLaivanPituus() == 3);
    }
}
