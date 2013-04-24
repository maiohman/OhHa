/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import laivanupotus.peli.Pelaaja;
import java.awt.Graphics;
import laivanupotus.domain.Kentta;
import laivanupotus.peli.Laivanupotus;

/**
 *
 * @author mohman
 */
public class AmpumisNapinKuuntelija implements ActionListener {
    private Laskuri laskuri;
    private JLabel luku;
    private Piirtoalusta piirtoalusta;
    private AmpumisPanel ampumisPanel;
    private Laivanupotus peli;
    private int ruksiLuku;
    private int palloLuku;

    public AmpumisNapinKuuntelija(Laskuri laskuri, JLabel luku, Piirtoalusta piirtoalusta, AmpumisPanel ampumisPanel, Laivanupotus peli) {
        this.laskuri = laskuri;
        this.luku = luku;
        this.piirtoalusta = piirtoalusta;
        this.ampumisPanel = ampumisPanel;
        this.peli = peli;
        this.ruksiLuku = 0;
        this.palloLuku = 0;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.laskuri.lisaaYksi();
        this.luku.setText("" + this.laskuri.getMaara());
        
        
        
        if(osuiko(ampumisPanel.getAnnettuX(), ampumisPanel.getAnnettuY()) == false) {
            // siirrä ruksi
            this.piirtoalusta.getRuksi(ruksiLuku).siirra(ampumisPanel.getAnnettuX(), ampumisPanel.getAnnettuY());
            this.ruksiLuku = ruksiLuku + 1;
        }
        else {
            // siirrä pallo
            this.piirtoalusta.getPallo(palloLuku).siirra(ampumisPanel.getAnnettuX(), ampumisPanel.getAnnettuY());
            this.palloLuku = palloLuku + 1;
        }
        
        this.ampumisPanel.getKenttaX().setText(null);
        this.ampumisPanel.getKenttaY().setText(null);
        
        piirtoalusta.repaint();
    }
    
    public boolean osuiko(int x, int y) {
        if(peli.onkoVapaaPala(x, y) == false) {
            return true;
        }
        else {
            return false;
        }
    }
}
