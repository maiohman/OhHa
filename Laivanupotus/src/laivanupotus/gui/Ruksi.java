/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 * Ruksin muotoinen hahmo 
 * osoittaa piirtoalustalla mihin on ammuttu huti.
 * 
 * @author mohman
 */
public class Ruksi {
    private int x;
    private int y;
    
    /*
     * Luo ruksin piiloon
     * Myöhemmin pallon voi siirtää halutulle paikalle.
     */
    public Ruksi() {
        this.x = -20;
        this.y = -20;
    }
    
    /*
     * Luo ruksin haluttuun paikkaan
     */
    public Ruksi(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /*
     * Piirtää ruksin
     */
    public void piirra(Graphics graphics) {
        graphics.drawString("X", x, y);
    }
    
    /*
     * Siirtää ruksin haluttuun paikkaan
     */
    public void siirra(int x, int y) {
        this.x = (x + 1) * 30 + 10;
        this.y = (y + 1) * 30;
    }
    
    /*
     * Palauttaa ruksin x koordinaatin
     */
    public int getRuksinX() {
        return this.x;
    }
    
    /*
     * Palauttaa ruksin y koordinaatin
     */
    public int getRuksinY() {
        return this.y;
    }
}
