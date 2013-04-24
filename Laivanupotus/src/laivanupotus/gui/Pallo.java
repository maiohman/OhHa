
package laivanupotus.gui;

import java.awt.Graphics;

/**
 * Pallon muotoinen hahmo 
 * osoittaa piirtoalustalla mihin on ammuttu ja osuttu.
 * 
 * @author mohman
 */
public class Pallo {
    private int x;
    private int y;
    
    /*
     * Luo pallon piiloon.
     * Myöhemmin pallon voi siirtää halutulle paikalle.
     */
    public Pallo() {
        this.x = -20;
        this.y = -20;
    }
    
    /*
     * Luo pallon haluttuun paikkaan
     */
    public Pallo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    /*
     * Piirtää pallon
     */
    public void piirra(Graphics graphics) {
        graphics.fillOval(x, y, 15, 15);
    }
    
    /*
     * Siirtää piirretyn pallon haluttuun paikkaan
     */
    public void siirra(int x, int y) {
        this.x = (x + 1) * 30 + 8;
        this.y = (y + 1) * 30 - 12;
    }
    
    /*
     * Palauttaa pallon x koordinaatin
     */
    public int getPallonX() {
        return this.x;
    }
    
    /*
     * Palauttaa pallon y koordinaatin
     */
    public int getPallonY() {
        return this.y;
    }
}