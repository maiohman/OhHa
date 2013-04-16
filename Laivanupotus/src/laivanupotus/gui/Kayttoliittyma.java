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
    private int sivunPituus;
    private PelaajaVarasto pelaajaVarasto;
    private Laskuri laskuri;
    
    public Kayttoliittyma(Laivanupotus peli, int sivunPituus, Laskuri laskuri, PelaajaVarasto pelaajaVarasto) {
        this.peli = peli;
        this.sivunPituus = sivunPituus;
        this.laskuri = laskuri;
        this.pelaajaVarasto = pelaajaVarasto;
    }

    @Override
    public void run() {
        frame = new JFrame("Laivanupotus");
        int leveys = (peli.getLeveys())*sivunPituus+320;
        int korkeus = (peli.getKorkeus())*sivunPituus+430;
         
        frame.setPreferredSize(new Dimension(leveys, korkeus));
 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        luoKomponentit(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
    
    public void luoKomponentit(Container container) {
        
        
        NimiPanel nimiPanel = new NimiPanel();
        PelaajanLisaysKuuntelija pKuuntelija = new PelaajanLisaysKuuntelija(pelaajaVarasto, nimiPanel.getNimi(), nimiPanel);
        nimiPanel.getNimi().addActionListener(pKuuntelija);
        
        KoordinaattiPanel koordinaattiPanel = new KoordinaattiPanel();
        
        Ruksi ruksi = new Ruksi(koordinaattiPanel.getKoordinaattiX(), koordinaattiPanel.getKoordinaattiY());
        Piirtoalusta piirtoalusta = new Piirtoalusta(koordinaattiPanel.getKoordinaattiX(), koordinaattiPanel.getKoordinaattiY(), ruksi);
        
        KlikkaustenKuuntelija kKuuntelija = new KlikkaustenKuuntelija(laskuri, koordinaattiPanel.getLuku());
        koordinaattiPanel.getNappi().addActionListener(kKuuntelija);
        koordinaattiPanel.getKoordinaattiX().addActionListener(kKuuntelija);
        koordinaattiPanel.getKoordinaattiY().addActionListener(kKuuntelija);
        
        
        container.add(piirtoalusta, BorderLayout.CENTER);
        container.add(nimiPanel, BorderLayout.NORTH);
        container.add(koordinaattiPanel, BorderLayout.SOUTH);
        
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
}
