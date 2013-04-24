/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import javax.swing.JTextField;
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
public class RuksiTest {
    
    public RuksiTest() {
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
    public void ruksinKoordinaattiX() {
        AmpumisPanel ampumisPanel = new AmpumisPanel();
        ampumisPanel.setKenttaX(new JTextField("3"));
        ampumisPanel.setKenttaY(new JTextField("D"));
        int x = ampumisPanel.getAnnettuX();
        int y = ampumisPanel.getAnnettuY();
        Ruksi ruksi = new Ruksi(x, y);
        assertTrue(ruksi.getRuksinX() == 3 - 1);
    }
    
    public void ruksinKoordinaattiY() {
        AmpumisPanel ampumisPanel = new AmpumisPanel();
        ampumisPanel.setKenttaX(new JTextField("3"));
        ampumisPanel.setKenttaY(new JTextField("D"));
        int x = ampumisPanel.getAnnettuX();
        int y = ampumisPanel.getAnnettuY();
        Ruksi ruksi = new Ruksi(x, y);
        assertTrue(ruksi.getRuksinY() == 4 - 1);
    }
}