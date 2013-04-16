/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.peli;

/**
 *
 * @author mohman
 */
public class Pelaaja {
    private String nimi;
    private int yritykset;
    
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.yritykset = 0;
    }
    
    /*
     * Palauttaa pelaajan nimen tai nikin.
     */
    public String getNimi() {
        return this.nimi;
    }
    
    /*
     * Asettaa yrityskerrat.
     */
    public void setYritykset(int yritykset) {
        this.yritykset = yritykset;
    }
    
    /*
     * Palauttaa yrityskerrat.
     */
    public int getYritykset() {
        return this.yritykset;
    }
}
