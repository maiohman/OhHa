package laivanupous.peli;

import laivanupotus.domain.Kentta;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maiohman
 */
public class Laivanupotus {
    private int leveys;
    private int korkeus;
    
    public Laivanupotus(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }
    
    public void kaynnistys() {
        //luo ruudukon
        Kentta kentta = new Kentta(10, 10);
        //ohjelma arpoo laivojen paikat
        //pelaaja arvaa
        //
    }
}
