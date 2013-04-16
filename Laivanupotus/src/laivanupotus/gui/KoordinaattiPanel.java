/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mohman
 */
public class KoordinaattiPanel extends JPanel {
    private JLabel luku;
    private JButton ammu;
    private JTextField x;
    private JTextField y;
    
    public KoordinaattiPanel() {
        super(new GridLayout(3, 3));
        luoKomponentit();
    }
    
    private void luoKomponentit() {
        add(new JLabel(""));
        add(new JLabel("Koordinaatti X: "));
        this.x = new JTextField();
        add(x);
        
        add(new JLabel(""));
        add(new JLabel("Koordinaatti Y: "));
        this.y = new JTextField();
        add(y);
        
        add(new JLabel("      Yritetty: "));
        this.luku = new JLabel("0");
        add(luku);
        this.ammu = new JButton("Ammu!");
        add(ammu);
    }
    
    public JLabel getLuku() {
        return this.luku;
    }
    
    public JButton getNappi() {
        return this.ammu;
    }
    
    public JTextField getKoordinaattiX() {
        return this.x;
    }
    
    public JTextField getKoordinaattiY() {
        return this.y;
    }
}
