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

/**
 *
 * @author mohman
 */
public class KlikkaustenKuuntelija implements ActionListener {
    private Laskuri laskuri;
    private JLabel luku;

    public KlikkaustenKuuntelija(Laskuri laskuri, JLabel luku) {
        this.laskuri = laskuri;
        this.luku = luku;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.laskuri.lisaaYksi();
        this.luku.setText("" + this.laskuri.getMaara());
    }
}
