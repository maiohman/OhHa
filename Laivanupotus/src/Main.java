
import java.util.Scanner;
import javax.swing.SwingUtilities;
import laivanupotus.domain.Kentta;
import laivanupotus.domain.Laiva;
import laivanupotus.domain.Pala;
import laivanupotus.gui.Kayttoliittyma;
import laivanupotus.gui.Laskuri;
import laivanupotus.gui.PelaajaVarasto;
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
        //Scanner lukija = new Scanner(System.in);
        //System.out.println("Anna nimesi:");
        //String nimi = lukija.nextLine();
        //Pelaaja pelaaja = new Pelaaja(nimi);
        //ystem.out.println("Hei " + pelaaja.getNimi() + "!");
        
        Laivanupotus peli = new Laivanupotus(10, 10);
        peli.asetaLaivat();
        
        Laskuri laskuri = new Laskuri();
        PelaajaVarasto pelaajaVarasto = new PelaajaVarasto();
        
        Kayttoliittyma kali = new Kayttoliittyma(peli, 10, laskuri, pelaajaVarasto);
        SwingUtilities.invokeLater(kali);
        //SwingUtilities.invokeLater(kali2);
        
        //while (kali.getPaivitettava() == null) {
        //    try {
        //        Thread.sleep(100);
        //    } catch (InterruptedException ex) {
        //        System.out.println("Piirtoalustaa ei ole vielä luotu.");
        //    }
        //}

        //matopeli.setPaivitettava(kali.getPaivitettava());
        //matopeli.start();
        
        //peli.paljastaKentta();
    }
}
