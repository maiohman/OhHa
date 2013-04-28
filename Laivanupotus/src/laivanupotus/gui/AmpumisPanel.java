
package laivanupotus.gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * AmpumisPanel.
 * 
 * 
 * @author mohman
 */
public class AmpumisPanel extends JPanel {
    private JLabel luku;
    private JButton ammu;
    private JTextField x;
    private JTextField y;
    private JLabel opas;
    
    public AmpumisPanel() {
        super(new GridLayout(4, 3));
        this.x = new JTextField();
        this.y = new JTextField();
        this.luku = new JLabel("0");
        this.ammu = new JButton("Ammu!");
        this.opas = new JLabel("   Aloita peli!");
        luoKomponentit();
    }
    
    private void luoKomponentit() {
        add(new JLabel(""));
        add(opas);
        add(new JLabel(""));
        
        add(new JLabel(""));
        add(new JLabel("Koordinaatti X: "));
        add(x);
        
        add(new JLabel(""));
        add(new JLabel("Koordinaatti Y: "));
        add(y);
        
        add(new JLabel("      Yritetty: "));
        add(luku);
        add(ammu);
    }
    
    /*
     * Palauttaa klikkausten lukumäätän.
     */
    public JLabel getKlikkaustenLuku() {
        return this.luku;
    }
    
    /*
     * Palauttaa ampumis-napin.
     */
    public JButton getAmpumisNappi() {
        return this.ammu;
    }
    
    /**
     * Muuttaa annetun koordinaatin x numeroksi ja palauttaa sen
     */
    public int getAnnettuX() {
        return Integer.parseInt(x.getText()) - 1;
    }
        
    /**
     * Muuttaa annetun koordinaatin y aakkosesta numeroksi ja palauttaa sen
     */
    public int getAnnettuY() {
        
        if(y.getText().equals("A")) {
            return 0;
        }
        if(y.getText().equals("B")) {
            return 1;
        }
        if(y.getText().equals("C")) {
            return 2;
        }
        if(y.getText().equals("D")) {
            return 3;
        }
        if(y.getText().equals("E")) {
            return 4;
        }
        if(y.getText().equals("F")) {
            return 5;
        }
        if(y.getText().equals("G")) {
            return 6;
        }
        if(y.getText().equals("H")) {
            return 7;
        }
        if(y.getText().equals("I")) {
            return 8;
        }
        if(y.getText().equals("J")) {
            return 9;
        }
        else {
            return -1;
        }
    }
    
    /*
     * 
     */
    public JTextField getKenttaX() {
        return this.x;
    }
    
    /*
     * 
     */
    public JTextField getKenttaY() {
        return this.y;
    }
    
    /*
     * 
     */
    public void setKenttaX(JTextField x) {
        this.x = x;
    }
    
    /*
     * 
     */
    public void setKenttaY(JTextField y) {
        this.y = y;
    }
    
    /*
     * Asettaa uuden tekstin oppaalle.
     */
    public void setOpasTeksti(String teksti) {
        this.opas.setText(teksti);
    }
}
