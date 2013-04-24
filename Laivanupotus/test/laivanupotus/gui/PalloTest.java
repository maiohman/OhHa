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
public class PalloTest {
    
    public PalloTest() {
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
    public void pallonKoordinaattiX() {
        AmpumisPanel ampumisPanel = new AmpumisPanel();
        ampumisPanel.setKenttaX(new JTextField("3"));
        ampumisPanel.setKenttaY(new JTextField("D"));
        int x = ampumisPanel.getAnnettuX();
        int y = ampumisPanel.getAnnettuY();
        Pallo pallo = new Pallo(x, y);
        assertTrue(pallo.getPallonX() == 3 - 1);
    }
    
    public void pallonKoordinaattiY() {
        AmpumisPanel ampumisPanel = new AmpumisPanel();
        ampumisPanel.setKenttaX(new JTextField("3"));
        ampumisPanel.setKenttaY(new JTextField("D"));
        int x = ampumisPanel.getAnnettuX();
        int y = ampumisPanel.getAnnettuY();
        Pallo pallo = new Pallo(x, y);
        assertTrue(pallo.getPallonY() == 4 - 1);
    }
}