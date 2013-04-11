/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import laivanupotus.peli.Laivanupotus;

/**
 *
 * @author mohman
 */
public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    private Laivanupotus peli;    
    private int sivunPituus;
    
    public Kayttoliittyma(Laivanupotus peli, int sivunPituus) {
        this.peli = peli;
        this.sivunPituus = sivunPituus;
    }

    @Override
    public void run() {
        frame = new JFrame("Laivanupotus");
        int leveys = (peli.getLeveys()+1)*sivunPituus+10;
        int korkeus = (peli.getKorkeus()+2)*sivunPituus+10;
         
        frame.setPreferredSize(new Dimension(leveys, korkeus));
 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        luoKomponentit(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
    
    public void luoKomponentit(Container container) {
        
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
}
