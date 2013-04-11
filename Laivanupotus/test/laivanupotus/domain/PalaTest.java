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
public class PalaTest {
    
    public PalaTest() {
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
    public void uudenPalanKoordinaattiX() {
        Pala x1y1 = new Pala(1, 1);
        assertTrue(x1y1.getPalanKoordinaattiX() == 1);
    }
    
    @Test
    public void uudenPalanKoordinaattiY() {
        Pala x1y1 = new Pala(1, 1);
        assertTrue(x1y1.getPalanKoordinaattiY() == 1);
    }
    
    @Test
    public void uudenPalanTila() {
        Pala x1y1 = new Pala(1, 1);
        assertTrue(x1y1.getPalanTila() == true);
    }
}
