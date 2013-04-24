/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.util.HashMap;
import laivanupotus.peli.Pelaaja;

/**
 *
 * @author mohman
 */
public class PelaajaVarasto {
    private HashMap<Pelaaja, Integer> pelaajaVarasto;
    
    public PelaajaVarasto() {
        this.pelaajaVarasto = new HashMap<Pelaaja, Integer>();
    }

    void talleta(Pelaaja pelaaja) {
        this.pelaajaVarasto.put(pelaaja, pelaaja.getYritykset());
    }
    
}
