/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import javax.swing.JLabel;

/**
 *
 * @author mohman
 */
public class Laskuri extends JLabel {
    private int maara;
    
    public Laskuri() {
        this.maara = 0;
    }

    public void lisaaYksi() {
        this.maara = maara + 1;
    }
    
    public int getMaara() {
        return this.maara;
    }
}
