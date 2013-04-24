/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import laivanupotus.peli.Laivanupotus;

/**
 *
 * @author mohman
 */
public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    private Laivanupotus peli;
    private PelaajaVarasto pelaajaVarasto;
    private Laskuri laskuri;
    
    public Kayttoliittyma(Laivanupotus peli, Laskuri laskuri, PelaajaVarasto pelaajaVarasto) {
        this.peli = peli;
        this.laskuri = laskuri;
        this.pelaajaVarasto = pelaajaVarasto;
    }

    @Override
    public void run() {
        frame = new JFrame("Laivanupotus");
        int leveys = (peli.getLeveys())*30*2 + 60;
        int korkeus = (peli.getKorkeus())*30*2 + 230;
         
        frame.setPreferredSize(new Dimension(leveys, korkeus));
 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        luoKomponentit(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
    
    public void luoKomponentit(Container container) {
        
        
        NimiPanel nimiPanel = new NimiPanel();
        PelaajanLisaysKuuntelija pKuuntelija = new PelaajanLisaysKuuntelija(pelaajaVarasto, nimiPanel.getNimiKentta());
        nimiPanel.getNimiKentta().addActionListener(pKuuntelija);
        
        AmpumisPanel ampumisPanel = new AmpumisPanel();
        
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        
        AmpumisNapinKuuntelija kKuuntelija = new AmpumisNapinKuuntelija(laskuri, ampumisPanel.getKlikkaustenLuku(), piirtoalusta, ampumisPanel, peli);
        ampumisPanel.getAmpumisNappi().addActionListener(kKuuntelija);
        ampumisPanel.getKenttaX().addActionListener(kKuuntelija);
        ampumisPanel.getKenttaY().addActionListener(kKuuntelija);
        
        
        container.add(piirtoalusta, BorderLayout.CENTER);
        container.add(nimiPanel, BorderLayout.NORTH);
        container.add(ampumisPanel, BorderLayout.SOUTH);
        
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
}
