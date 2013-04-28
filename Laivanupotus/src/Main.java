
import java.util.Scanner;
import javax.swing.SwingUtilities;
import laivanupotus.domain.Kentta;
import laivanupotus.domain.Laiva;
import laivanupotus.gui.Kayttoliittyma;
import laivanupotus.gui.Laskuri;
import laivanupotus.gui.PelaajaVarasto;
import laivanupotus.peli.Pelaaja;
import laivanupotus.peli.Laivanupotus;

/**
 *
 * @author maiohman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Laivanupotus peli = new Laivanupotus(10, 10);
        peli.luoLaivat();
        peli.asetaLaivat();
        
        Laskuri laskuri = new Laskuri();
        PelaajaVarasto pelaajaVarasto = new PelaajaVarasto();
        
        Kayttoliittyma kali = new Kayttoliittyma(peli, laskuri, pelaajaVarasto);
        SwingUtilities.invokeLater(kali);
        
        peli.paljastaKentta();
    }
}
