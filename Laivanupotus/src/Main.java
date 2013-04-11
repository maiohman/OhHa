
import laivanupotus.domain.Kentta;
import laivanupotus.domain.Laiva;
import laivanupotus.domain.Pala;
import laivanupotus.peli.Pelaaja;
import laivanupotus.peli.Laivanupotus;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maiohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testausta
        
        Laivanupotus peli = new Laivanupotus(10, 10);
        peli.kaynnistys();
        peli.paljastaKentta();
    }
}
