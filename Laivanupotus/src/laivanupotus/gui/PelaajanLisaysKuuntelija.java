
package laivanupotus.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import laivanupotus.peli.Pelaaja;

/**
 * PelaajanLisaysKuuntelija.
 * Lisää pelaajan nimen ja tuloksen tekstitiedostoon.
 * 
 * @author mohman
 */
public class PelaajanLisaysKuuntelija implements ActionListener {
    //private PelaajaVarasto pelaajaVarasto;
    private NimiPanel nimiPanel;
    private AmpumisNapinKuuntelija ampumisNapinKuuntelija;

    public PelaajanLisaysKuuntelija(NimiPanel nimiPanel, AmpumisNapinKuuntelija ampumisNapinKuuntelija) {
        //this.pelaajaVarasto = pelaajaVarasto;
        this.nimiPanel = nimiPanel;
        this.ampumisNapinKuuntelija = ampumisNapinKuuntelija;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Pelaaja pelaaja = new Pelaaja(nimiKentta.getText());
        //this.pelaajaVarasto.talleta(pelaaja);
        try {
            kirjoitaTiedostoon(nimiPanel.getNimiKentta().getText() + ", " + this.ampumisNapinKuuntelija.getYritysKerrat());
        } catch (Exception ex) {
            Logger.getLogger(PelaajanLisaysKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.nimiPanel.setTervehdysLabel("Tuloksesi on lisätty!");
    }
    
    public void kirjoitaTiedostoon(String tulokset) throws Exception {
        FileWriter kirjoittaja = new FileWriter("highscore.txt");
        kirjoittaja.write(tulokset);
        kirjoittaja.close();
    }
}
