/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.domain;

import java.util.Random;
import laivanupotus.peli.Laivanupotus;

/**
 *
 * @author maiohman
 */
public class Laiva {
    int pituus;
    int y;
    int x;
    int suunta;

    public Laiva(int pituus) {
        this.pituus = pituus;
    }
    
    /*
     * Palautta laivan pituuden.
     */
    public int getLaivanPituus() {
        return this.pituus;
    }
    
    /*
     * Asettaa laivan ensimmäiset koordinaatit sekä suunnan.
     */
    public void setLaivanAlkuKoordinaatit(int x, int y, int suunta) { 
        this.x = x;
        this.y = y;
        this.suunta = suunta;
    }
    
    /*
     * Palauttaa laivan ensimmäisen koordinaatti x:n.
     */
    public int getLaivanEkaKoordinaattiX() {
        return this.x;
    }
    
    /*
     * Palauttaa laivan ensimmäisen koordinaatti y:n.
     */
    public int getLaivanEkaKoordinaattiY() {
        return this.y;
    }
}
