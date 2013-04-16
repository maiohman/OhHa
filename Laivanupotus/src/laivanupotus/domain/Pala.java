package laivanupotus.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maiohman
 */
public class Pala {
    int x;
    int y;
    boolean vapaaPala;
    
    public Pala(int x, int y) {
        this.x = x;
        this.y = y;
        this.vapaaPala = true;
    }
    
    /*
     * Palauttaa palan tilan; onko pala vapaa vai varattu.
     */
    public boolean getPalanTila() {
        return this.vapaaPala;
    }
    
    /*
     * Palauttaa palan koordinaatti x:n.
     */
    public int getPalanKoordinaattiX() {
        return this.x;
    }
    
    /*
     * Palauttaa palan koordinaatti y:n.
     */
    public int getPalanKoordinaattiY() {
        return this.y;
    }
    
    /*
     * Asettaa palan varatuksi.
     */
    public void setPalaVarattu() {
        this.vapaaPala = false;
    }
    
}
