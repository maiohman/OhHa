/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mohman
 */
public class NimiPanel extends JPanel {
    private JTextField nimi;
    //private Scanner lukija;
    
    public NimiPanel() {
        super(new GridLayout(1, 3));
        this.nimi = new JTextField();
        //this.lukija = new Scanner(System.in);
        luoKomponentit();
    }
    
    private void luoKomponentit() {
        add(new JLabel("      Nimi: "));
        add(nimi);
        add(new JButton("OK"));
    }
    
    public JTextField getNimi() {
        return this.nimi;
    }
}
