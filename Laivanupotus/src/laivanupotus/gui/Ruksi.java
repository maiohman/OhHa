/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.gui;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author mohman
 */
public class Ruksi {
    private String xString;
    private String yString;
    private int x;
    private int y;

    public Ruksi(JTextField x, JTextField y) {
        this.xString = x.getText();
        this.yString = y.getText();
        if(this.xString.contains("1")) {
            this.x = 1;
        }
        if(this.xString.contains("2")) {
            this.x = 2;
        }
        if(this.xString.contains("3")) {
            this.x = 3;
        }
        if(this.xString.contains("4")) {
            this.x = 4;
        }
        if(this.xString.contains("5")) {
            this.x = 5;
        }
        if(this.xString.contains("6")) {
            this.x = 6;
        }
        if(this.xString.contains("7")) {
            this.x = 7;
        }
        if(this.xString.contains("8")) {
            this.x = 8;
        }
        if(this.xString.contains("9")) {
            this.x = 9;
        }
        if(this.xString.contains("10")) {
            this.x = 10;
        }
        
        if(this.xString.contains("A")) {
            this.x = 1;
        }
        if(this.xString.contains("B")) {
            this.x = 2;
        }
        if(this.xString.contains("C")) {
            this.x = 3;
        }
        if(this.xString.contains("D")) {
            this.x = 4;
        }
        if(this.xString.contains("E")) {
            this.x = 5;
        }
        if(this.xString.contains("F")) {
            this.x = 6;
        }
        if(this.xString.contains("G")) {
            this.x = 7;
        }
        if(this.xString.contains("H")) {
            this.x = 8;
        }
        if(this.xString.contains("I")) {
            this.x = 9;
        }
        if(this.xString.contains("J")) {
            this.x = 10;
        }
    }

    public void piirra(Graphics graphics) {
        graphics.fillOval(x, y, 10, 10);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}
