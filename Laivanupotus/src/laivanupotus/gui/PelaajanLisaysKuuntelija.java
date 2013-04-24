
package laivanupotus.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JTextField;
import laivanupotus.peli.Pelaaja;

/**
 * Pelaajan lisäys kuuntelija.
 * Lisää pelaajan nimen pelaajavarastoon.
 * 
 * @author mohman
 */
public class PelaajanLisaysKuuntelija implements ActionListener {
    private PelaajaVarasto pelaajaVarasto;
    private JTextField nimiKentta;

    public PelaajanLisaysKuuntelija(PelaajaVarasto pelaajaVarasto, JTextField nimiKentta) {
        this.pelaajaVarasto = pelaajaVarasto;
        this.nimiKentta = nimiKentta;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Pelaaja pelaaja = new Pelaaja(nimiKentta.getText());
        this.pelaajaVarasto.talleta(pelaaja);
        
        
    }
    
    public void kirjoitaTiedostoon(String tulokset) throws Exception {
        FileWriter kirjoittaja = new FileWriter("highscore.txt");
        kirjoittaja.write(tulokset);
        kirjoittaja.close();
    }
}
