
package laivanupotus.domain;

import java.util.Random;
import laivanupotus.gui.Suunta;

/**
 * Laiva.
 * Sisältää laivan tiedot (pituuden, alku koordinaatit sekä suunnan).
 *
 * @author maiohman
 */
public class Laiva {
    private int pituus;
    private int y;
    private int x;
    private Suunta suunta;

    public Laiva(int pituus) {
        this.pituus = pituus;
        this.suunta = Suunta.values()[new Random().nextInt(Suunta.values().length)];
    }
    
    /*
     * Palautta laivan pituuden.
     */
    public int getLaivanPituus() {
        return this.pituus;
    }
    
    /*
     * Palautta laivan pituuden.
     */
    public Suunta getLaivanSuunta() {
        return this.suunta;
    }
    
    /*
     * Asettaa laivan ensimmäiset koordinaatit sekä suunnan.
     */
    public void setLaivanAlkuKoordinaatit(int x, int y) { 
        this.x = x;
        this.y = y;
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
