
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
        Pelaaja anna = new Pelaaja("Anna");
        System.out.println(anna.getNimi());
        Kentta kentta = new Kentta(10, 10);
        if (kentta.onkoVapaaPala(5, 6) == true) {
            System.out.println("Vapaa!");
        }
        else {
            System.out.println("Varattu!");
        }
        
        
        //Laivanupotus peli = new Laivanupotus(10, 10);
        //peli.laivanAsetus(2);
        //peli.laivanAsetus(3);
        //peli.laivanAsetus(3);
        //peli.laivanAsetus(4);
        //peli.laivanAsetus(5);
    }
}
