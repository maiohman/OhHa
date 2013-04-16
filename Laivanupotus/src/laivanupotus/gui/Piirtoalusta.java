/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mohman
 */
public class Piirtoalusta extends JPanel{
    private JTextField x;
    private JTextField y;
    private Ruksi ruksi;
        
    
    public Piirtoalusta(JTextField x, JTextField y, Ruksi ruksi) {
        super.setBackground(Color.WHITE);
        this.x = x;
        this.y = y;
        this.ruksi = ruksi;
    }

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
    }
}
