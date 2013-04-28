
package laivanupotus.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import laivanupotus.domain.Kentta;

/**
 * Piirtoalusta edustaa pelin pelialustaa.
 * Piirtoalustalla on ruudukko sekä ruudukon sivuilla x ja y koordinaatit.
 * Pelatessa ruudukkoon ilmestyy rukseja kun ammus menee huti
 * ja palloja kun ammus osuu.
 * 
 * @author mohman
 */
public class Piirtoalusta extends JPanel{
    private ArrayList<Ruksi> ruksiLista;
    private ArrayList<Pallo> palloLista;
    private Kentta kentta;
        
    /*
     * Luo piirtoalustan jonka taustaväri on valkoinen.
     */
    public Piirtoalusta(Kentta kentta) {
        super.setBackground(Color.WHITE);
        this.ruksiLista = new ArrayList<Ruksi>();
        this.palloLista = new ArrayList<Pallo>();
        this.kentta = kentta;
    }

    /*
     * Piirtää alustalle kirjaimet, sitten numerot,
     * ruudukon ulkoreunat, vaakaviivat ja pystyviivat,
     * lopuksi ruksit ja pallot.
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawString("A", 15, 30);
        graphics.drawString("B", 15, 60);
        graphics.drawString("C", 15, 90);
        graphics.drawString("D", 15, 120);
        graphics.drawString("E", 15, 150);
        graphics.drawString("F", 15, 180);
        graphics.drawString("G", 15, 210);
        graphics.drawString("H", 15, 240);
        graphics.drawString("I", 15, 270);
        graphics.drawString("J", 15, 300);
        
        graphics.drawString("1", 40, 330);
        graphics.drawString("2", 70, 330);
        graphics.drawString("3", 100, 330);
        graphics.drawString("4", 130, 330);
        graphics.drawString("5", 160, 330);
        graphics.drawString("6", 190, 330);
        graphics.drawString("7", 220, 330);
        graphics.drawString("8", 250, 330);
        graphics.drawString("9", 280, 330);
        graphics.drawString("10", 310, 330);
        
        graphics.fillRect(30, 10, 2, 300);
        graphics.fillRect(30, 10, 300, 2);
        graphics.fillRect(330, 10, 2, 300);
        graphics.fillRect(30, 310, 302, 2);
        
        graphics.drawLine(30, 40, 330, 40);
        graphics.drawLine(30, 70, 330, 70);
        graphics.drawLine(30, 100, 330, 100);
        graphics.drawLine(30, 130, 330, 130);
        graphics.drawLine(30, 160, 330, 160);
        graphics.drawLine(30, 190, 330, 190);
        graphics.drawLine(30, 220, 330, 220);
        graphics.drawLine(30, 250, 330, 250);
        graphics.drawLine(30, 280, 330, 280);
        
        graphics.drawLine(60, 10, 60, 310);
        graphics.drawLine(90, 10, 90, 310);
        graphics.drawLine(120, 10, 120, 310);
        graphics.drawLine(150, 10, 150, 310);
        graphics.drawLine(180, 10, 180, 310);
        graphics.drawLine(210, 10, 210, 310);
        graphics.drawLine(240, 10, 240, 310);
        graphics.drawLine(270, 10, 270, 310);
        graphics.drawLine(300, 10, 300, 310);
        
        // 83 ruksia 10x10 pelialustassa
        for (int i = 0; i < kentta.getLeveys() * kentta.getKorkeus() - 17 ; i++) {
            ruksiLista.add(new Ruksi());
        }
        
        for (Ruksi ruksi : ruksiLista) {
            ruksi.piirra(graphics);
        }
        
        // 17 palloa kun laivoja on 1x5, 1x4, 2x3, 1x2 sijoitettuna pelialustalle
        for (int i = 0; i < 17 ; i++) {
            palloLista.add(new Pallo());
        }
        
        for (Pallo pallo : palloLista) {
            pallo.piirra(graphics);
        }
        
    }
    
    /*
     * Palauttaa tietyn ruksin ruksilistalta.
     */
    public Ruksi getRuksi(int i) {
        return ruksiLista.get(i);
    }
    
    /*
     * Palauttaa tietyn pallon pallolistalta.
     */
    public Pallo getPallo(int i) {
        return palloLista.get(i);
    }
}
