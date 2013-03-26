/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.domain;

/**
 *
 * @author maiohman
 */
public class Laiva {
    int pituus;
    int y;
    int x;

    public Laiva(int pituus, int x, int y) {
        this.pituus = pituus;
        this.x = x;
        this.y = y;
    }
    
    public int getLaivanPituus() {
        return this.pituus;
    }
    
    public int getLaivanEkaKoordinaattiX() {
        return this.x;
    }
    
    public int getLaivanEkaKoordinaattiY() {
        return this.y;
    }
}
