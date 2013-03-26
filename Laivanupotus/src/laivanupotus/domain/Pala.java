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
    
    public boolean getPalanTila() {
        return this.vapaaPala;
    }
    
    public int getPalanKoordinaattiX() {
        return this.x;
    }
    
    public int getPalanKoordinaattiY() {
        return this.y;
    }
    
    public void setPalaVarattu() {
        this.vapaaPala = false;
    }
    
}
