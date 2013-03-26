package laivanupotus.peli;

import java.util.Random;
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
    private Kentta kentta;
    
    public Laivanupotus(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.kentta = new Kentta(leveys, korkeus);
    }
    
    //public void kaynnistys() {
        //luo pelaajan        
        //Pelaaja pelaaja = new Pelaaja("Anna");
        //ohjelma arpoo laivojen paikat
        //laivanAsetus(2);
        //laivanAsetus(3);
        //pelaaja arvaa
        //
    //}
    
    public void laivanIIAsetus() {
        // suunnat: 1 vaakasuora, 2 pystysuora, 3 vino nouseva, 4 vino laskeva
        // LaivaII, LaivaIII, LaivaIV, LaivaV
        
        // vaakasuora laivaII
        int pituus = 2;
        int x1 = 1 + new Random().nextInt(leveys - pituus + 1);
        int y1 = 1 + new Random().nextInt(korkeus);
        int x2 = x1 + 1;
        int y2 = y1;
        
        
    }
}
