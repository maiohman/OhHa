
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
public class KenttaTest {
    
    public KenttaTest() {
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
    public void kentanLeveys() {
        Kentta kentta = new Kentta(11, 11);
        assertTrue(kentta.getLeveys() == 11);
    }
    
    public void kentanKorkeus() {
        Kentta kentta = new Kentta(11, 11);
        assertTrue(kentta.getKorkeus() == 11);
    }
    
    public void kentanPalaVapaana() {
        Kentta kentta = new Kentta(11, 11);
        assertTrue(kentta.onkoVapaaPala(3, 3) == false);
    }
    
    public void kentanPalaVarattuna() {
        Kentta kentta = new Kentta(11, 11);
        kentta.setLaivanPala(3, 3);
        assertTrue(kentta.onkoVapaaPala(3, 3) == true);
    }
}