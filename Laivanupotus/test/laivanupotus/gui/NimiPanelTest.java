/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import laivanupotus.gui.NimiPanel;
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
public class NimiPanelTest {
    
    public NimiPanelTest() {
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
    public void nimiPanelinNimi() {
        NimiPanel nimiPanel = new NimiPanel();
        nimiPanel.setNimi("Anna");
        System.out.println(nimiPanel.getName());
        assertTrue(nimiPanel.getName().equals("Anna"));
    }
}