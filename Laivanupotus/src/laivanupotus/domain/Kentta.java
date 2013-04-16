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
    int x;
    int y;
    
    public Kentta(int x, int y) {
        this.kentta = new boolean[x][y];
        this.x = x;
        this.y = y;
    }
    
    /*
     * Antaa kentän leveyden.
     */
    public int getLeveys() {
        return this.x;
    }
    
    /*
     * Antaa kentän korkeuden.
     */
    public int getKorkeus() {
        return this.y;
    }
    
    /*
     * Paljastaa koko kentän ja sen missä laivat sijaitsevat.
     */
    public void paljastaKentta() {
        for (int i = 0; i < this.x; i ++) {
            System.out.println("");
            for (int j = 0; j < this.y; j ++) {
                System.out.print(kentta[i][j] + " ");
            }
        }
        System.out.println("");
    }
    
    /*
     * Kertoo onko pala vapaa laivalle.
     */
    public boolean onkoVapaaPala(int x, int y) {
        if(x > 9) {
            System.out.println("Ulkona kentältä. x on " + x);
            return false;
        }
        if(y > 9) {
            System.out.println("Ulkona kentältä. y on " + y);
            return false;
        }
        if(x < 0) {
            System.out.println("Ulkona kentältä" + x);
            return false;
        }
        if(y < 0) {
            System.out.println("Ulkona kentältä" + y);
            return false;
        }
        if(kentta[x][y] == false) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*
     * Asettaa laivan palan kentälle.
     */
    public void setLaiva(int x, int y) {
        kentta[x][y] = true;
    }
}
