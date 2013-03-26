package laivanupotus.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maiohman
 */
public class Kentta {
    boolean[][] kentta;
    
    public Kentta(int x, int y) {
        this.kentta = new boolean[x][y];
        System.out.println(kentta[3][1]);
    }
    
    //public void setVapaaPala() {
    //    
    //}
    
    public boolean onkoVapaaPala(int x, int y) {
        if(kentta[x][y] == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
