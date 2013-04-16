/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import laivanupotus.peli.Pelaaja;

/**
 *
 * @author mohman
 */
public class PelaajanLisaysKuuntelija implements ActionListener {
    private PelaajaVarasto pelaajaVarasto;
    private JTextField nikkiKentta;
    //private Component component;

    public PelaajanLisaysKuuntelija(PelaajaVarasto pelaajaVarasto, JTextField nikkiKentta, Component component) {
        this.pelaajaVarasto = pelaajaVarasto;
        this.nikkiKentta = nikkiKentta;
        //this.component = component;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Pelaaja pelaaja = new Pelaaja(nikkiKentta.getText());
        this.pelaajaVarasto.talleta(pelaaja);
        //component.repaint();
    }
    
}
