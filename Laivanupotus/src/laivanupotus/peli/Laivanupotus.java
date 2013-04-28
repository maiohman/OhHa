package laivanupotus.peli;

import java.util.ArrayList;
import java.util.Random;
import laivanupotus.domain.Kentta;
import laivanupotus.domain.Laiva;
import laivanupotus.gui.Suunta;

/**
 * Laivanupotus.
 * Asettaa laivat kentälle.
 *
 * @author maiohman
 */
public class Laivanupotus {
    private int leveys;
    private int korkeus;
    private Kentta kentta;
    private ArrayList<Laiva> laivaLista;
    
    public Laivanupotus(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.kentta = new Kentta(leveys, korkeus);
        this.laivaLista = new ArrayList<Laiva>();
    }
    
    public void luoLaivat() {
        this.laivaLista.add(new Laiva(2));
        this.laivaLista.add(new Laiva(3));
        this.laivaLista.add(new Laiva(3));
        this.laivaLista.add(new Laiva(4));
        this.laivaLista.add(new Laiva(5));
    }
    
    /**
     * Asettaa laivat.
     * Asettaa kaikki laivat paikoilleen kentälle arpomalla.
     */
    public void asetaLaivat() {
        for (Laiva laiva : laivaLista) {
            laivanAsetus(laiva);
            System.out.println(laiva.getLaivanEkaKoordinaattiX());
            System.out.println(laiva.getLaivanEkaKoordinaattiY());
        }
    }
    
    /**
     * Minkä tahanta pituisen laivan asetus.
     * 
     */
    public void laivanAsetus(Laiva laiva) {
        leveys = leveys - 1; // jos 10x10 niin koordinaatit 0-9
        korkeus = korkeus - 1; // -||-
        
        int pituus = laiva.getLaivanPituus();
        Suunta suunta = laiva.getLaivanSuunta();
        
        System.out.println("Laivan suunta on " + laiva.getLaivanSuunta());
        
        for (int onnistui = 0; onnistui < 1; onnistui++) {
            int x = new Random().nextInt(leveys);
            int y = new Random().nextInt(korkeus);
            laiva.setLaivanAlkuKoordinaatit(x, y);
            for (int i = 0; i < pituus; i++) {
                if(kentta.onkoVapaaPala(x, y) == true) {
                    if(suunta == Suunta.VAAKASUORA) {
                        x = x + 1;
                    }
                    else if(suunta == Suunta.PYSTYSUORA) {
                        y = y + 1;
                    }
                    else if(suunta == Suunta.NOUSEVA) {
                        x = x + 1;
                        y = y - 1;
                    }
                    else if(suunta == Suunta.LASKEVA) {
                        x = x + 1;
                        y = y + 1;
                    }
                    else {
                        System.out.println("Laivalla ei ole suuntaa.");
                    }
                }
                else {
                    onnistui = -1;
                    System.out.println("Nyt ei onnistunut.");
                }
            }
        }
        int x = laiva.getLaivanEkaKoordinaattiX();
        int y = laiva.getLaivanEkaKoordinaattiY();
        kentta.setLaivanPala(x, y);
            
        for (int i = 0; i < pituus - 1; i++) {
            if(suunta == Suunta.VAAKASUORA) {
                x = x + 1;
            }
            if(suunta == Suunta.PYSTYSUORA) {
                y = y + 1;
            }
            if(suunta == Suunta.NOUSEVA) {
                x = x + 1;
                y = y - 1;
            }
            if(suunta == Suunta.LASKEVA) {
                x = x + 1;
                y = y + 1;
            }
            kentta.setLaivanPala(x, y);
        }
        System.out.println("Onnistui! Asetit laivan x" + laiva.getLaivanEkaKoordinaattiX() + " y" + laiva.getLaivanEkaKoordinaattiY() + " ja x" + x + " y" + y);
    }
    
    /*
     * Paljastaa mitä kentällä on.
     */
    public void paljastaKentta() {
        kentta.paljastaKentta();
    }
    
    /*
     * Kertoo onko kentällä vapaata vai onko siellä laiva.
     */
    public boolean onkoVapaaPala(int x, int y) {
        return kentta.onkoVapaaPala(x, y);
    }
    
    /*
     * Palauttaa kentän leveyden.
     */
    public int getLeveys() {
        return this.leveys;
    }
    
    /*
     * Palauttaa kentän Kkorkeuden.
     */
    public int getKorkeus() {
        return this.korkeus;
    }
    
    /*
     * Palauttaa kentän.
     * Piirrustusalusta pääsee näin käsiksi kentän tietoihin.
     */
    public Kentta getKentta() {
        return kentta;
    }
}
