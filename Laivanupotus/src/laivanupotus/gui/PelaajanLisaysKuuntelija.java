
package laivanupotus.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
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
    private String tulokset;

    public PelaajanLisaysKuuntelija(NimiPanel nimiPanel, AmpumisNapinKuuntelija ampumisNapinKuuntelija) {
        //this.pelaajaVarasto = pelaajaVarasto;
        this.nimiPanel = nimiPanel;
        this.ampumisNapinKuuntelija = ampumisNapinKuuntelija;
        this.tulokset = "";
    }

    /*
     * 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Pelaaja pelaaja = new Pelaaja(nimiKentta.getText());
        //this.pelaajaVarasto.talleta(pelaaja);
        try {
            kirjoitaTiedostoon(nimiPanel.getNimiKentta().getText() + ", " + this.ampumisNapinKuuntelija.getYritysKerrat());
        } catch (Exception ex) {
            Logger.getLogger(PelaajanLisaysKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.nimiPanel.setInfo1Label("Tuloksesi on lisätty!");
        
        /*
        try {
            this.tulokset = lueTiedostoMerkkijonoon(new File("highscore"));
        } catch (Exception ex) {
            Logger.getLogger(PelaajanLisaysKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<String> pelaajat = new ArrayList<String>();
        HashMap<String, Integer> tuloslista = new HashMap<String, Integer>();
        String[] pilkottu = this.tulokset.split(", ");
        
        pelaajat.addAll(Arrays.asList(pilkottu));
        
        for (int i = 0; i < pilkottu.length; i = i + 2) {
            tuloslista.put(pilkottu[i], Integer.parseInt(pilkottu[i + 1]));
            
        }
        
        int pieninLuku = 100;
        for (String pelaaja : pelaajat) {
            if(tuloslista.get(pelaaja) < pieninLuku) {
                pieninLuku = tuloslista.get(pelaaja);
                System.out.println("Pienin luku on " + pieninLuku);
            }
        }
        
        
        this.nimiPanel.setInfo2Label("Paras tulos on:");
        this.nimiPanel.setInfo3Label(tuloslista.get(pieninLuku).toString() + ", " + pieninLuku);
        */
    }
    
    public void kirjoitaTiedostoon(String tulokset) throws Exception {
        FileWriter kirjoittaja = new FileWriter("highscore.txt");
        kirjoittaja.append(tulokset);
        kirjoittaja.close();
    }
    
    public String lueTiedostoMerkkijonoon(File tiedosto) throws Exception {
        Scanner lukija = new Scanner(tiedosto);

        String merkkijono = "";

        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            merkkijono += rivi;
            merkkijono += "\n";
        }

        lukija.close();
        return merkkijono;
    }
}
