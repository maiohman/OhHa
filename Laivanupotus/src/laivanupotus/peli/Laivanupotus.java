package laivanupotus.peli;

import java.util.Random;
import laivanupotus.domain.Kentta;
import laivanupotus.domain.Laiva;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maiohman
 */
public class Laivanupotus {
    private int leveys;
    private int korkeus;
    private Kentta kentta;
    private Laiva laiva2;
    private Laiva laiva3a;
    private Laiva laiva3b;
    private Laiva laiva4;
    private Laiva laiva5;
    
    public Laivanupotus(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.kentta = new Kentta(leveys, korkeus);
        this.laiva2 = new Laiva(2);
        this.laiva3a = new Laiva(3);
        this.laiva3b = new Laiva(3);
        this.laiva4 = new Laiva(4);
        this.laiva5 = new Laiva(5);
    }
    
    /**
     * Asettaa laivat.
     * Asettaa kaikki laivat paikoilleen kentälle arpomalla.
     */
    public void asetaLaivat() {
        laivanAsetus(laiva2);
        System.out.println(laiva2.getLaivanEkaKoordinaattiX());
        System.out.println(laiva2.getLaivanEkaKoordinaattiY());
        laivanAsetus(laiva3a);
        System.out.println(laiva3a.getLaivanEkaKoordinaattiX());
        System.out.println(laiva3a.getLaivanEkaKoordinaattiY());
        laivanAsetus(laiva3b);
        System.out.println(laiva3b.getLaivanEkaKoordinaattiX());
        System.out.println(laiva3b.getLaivanEkaKoordinaattiY());
        laivanAsetus(laiva4);
        System.out.println(laiva4.getLaivanEkaKoordinaattiX());
        System.out.println(laiva4.getLaivanEkaKoordinaattiY());
        laivanAsetus(laiva5);
        System.out.println(laiva5.getLaivanEkaKoordinaattiX());
        System.out.println(laiva5.getLaivanEkaKoordinaattiY());
    }
    
    /**
     * Minkä tahanta pituisen laivan asetus.
     * Tulen muuttamaan koodihirmua.
     */
    public void laivanAsetus(Laiva laiva) {
        leveys = leveys - 1;
        korkeus = korkeus - 1;
        int pituus = laiva.getLaivanPituus();
        for (int onnistui = 0; onnistui < 1; onnistui++) {
            int suunta = 1 + new Random().nextInt(4);
            if(suunta == 1) { // vaakasuora
                int x = new Random().nextInt(leveys - pituus + 1);
                int y = new Random().nextInt(korkeus);
                if (pituus == 2) { // LaivaII
                    if (kentta.onkoVapaaPala(x, y) != true) {
                        onnistui = onnistui - 1;
                    }
                    else {
                        if (kentta.onkoVapaaPala(x + 1, y) == true) {
                            int laiva2x1 = x;
                            int laiva2y1 = y;
                            int laiva2x2 = x + 1;
                            int laiva2y2 = y;
                            kentta.setLaiva(laiva2x1, laiva2y1);
                            kentta.setLaiva(laiva2x2, laiva2y2);
                            laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                            System.out.println("Onnistui! LaivaII asetettu vaakasuoraan.");
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                }
                else if (pituus == 3) { // LaivaIII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y) == true) {
                                int laiva3x1 = x;
                                int laiva3y1 = y;
                                int laiva3x2 = x + 1;
                                int laiva3y2 = y;
                                int laiva3x3 = x + 2;
                                int laiva3y3 = y;
                                kentta.setLaiva(laiva3x1, laiva3y1);
                                kentta.setLaiva(laiva3x2, laiva3y2);
                                kentta.setLaiva(laiva3x3, laiva3y3);
                                laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                System.out.println("Onnistui! LaivaIII asetettu vaakasuoraan.");
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 4) {
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y) == true) {
                                    int laiva4x1 = x;
                                    int laiva4y1 = y;
                                    int laiva4x2 = x + 1;
                                    int laiva4y2 = y;
                                    int laiva4x3 = x + 2;
                                    int laiva4y3 = y;
                                    int laiva4x4 = x + 3;
                                    int laiva4y4 = y;
                                    kentta.setLaiva(laiva4x1, laiva4y1);
                                    kentta.setLaiva(laiva4x2, laiva4y2);
                                    kentta.setLaiva(laiva4x3, laiva4y3);
                                    kentta.setLaiva(laiva4x4, laiva4y4);
                                    laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                    System.out.println("Onnistui! LaivaIV asetettu vaakasuoraan.");
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 5) {
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y) == true) {
                                    if (kentta.onkoVapaaPala(x + 4, y) == true) {
                                        int laiva5x1 = x;
                                        int laiva5y1 = y;
                                        int laiva5x2 = x + 1;
                                        int laiva5y2 = y;
                                        int laiva5x3 = x + 2;
                                        int laiva5y3 = y;
                                        int laiva5x4 = x + 3;
                                        int laiva5y4 = y;
                                        int laiva5x5 = x + 4;
                                        int laiva5y5 = y;
                                        kentta.setLaiva(laiva5x1, laiva5y1);
                                        kentta.setLaiva(laiva5x2, laiva5y2);
                                        kentta.setLaiva(laiva5x3, laiva5y3);
                                        kentta.setLaiva(laiva5x4, laiva5y4);
                                        kentta.setLaiva(laiva5x5, laiva5y5);
                                        laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                        System.out.println("Onnistui! LaivaV asetettu vaakasuoraan.");
                                    }
                                    else {
                                        onnistui = onnistui - 1;
                                    }
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
            }
            else if (suunta == 2) { // pystysuora
                int x = new Random().nextInt(leveys);
                int y = new Random().nextInt(korkeus - pituus + 1);
                if (pituus == 2) { // LaivaII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x, y + 1) == true) {
                            int laiva2x1 = x;
                            int laiva2y1 = y;
                            int laiva2x2 = x;
                            int laiva2y2 = y + 1;
                            kentta.setLaiva(laiva2x1, laiva2y1);
                            kentta.setLaiva(laiva2x2, laiva2y2);
                            laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                            System.out.println("Onnistui! LaivaII asetettu pystysuoraan.");
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 3) { // LaivaIII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x, y + 2) == true) {
                                int laiva3x1 = x;
                                int laiva3y1 = y;
                                int laiva3x2 = x;
                                int laiva3y2 = y + 1;
                                int laiva3x3 = x;
                                int laiva3y3 = y + 2;
                                kentta.setLaiva(laiva3x1, laiva3y1);
                                kentta.setLaiva(laiva3x2, laiva3y2);
                                kentta.setLaiva(laiva3x3, laiva3y3);
                                laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                System.out.println("Onnistui! LaivaIII asetettu pystysuoraan.");
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 4) { // LaivaIV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x, y + 2) == true) {
                                if (kentta.onkoVapaaPala(x, y + 3) == true) {
                                    int laiva4x1 = x;
                                    int laiva4y1 = y;
                                    int laiva4x2 = x;
                                    int laiva4y2 = y + 1;
                                    int laiva4x3 = x;
                                    int laiva4y3 = y + 2;
                                    int laiva4x4 = x;
                                    int laiva4y4 = y + 3;
                                    kentta.setLaiva(laiva4x1, laiva4y1);
                                    kentta.setLaiva(laiva4x2, laiva4y2);
                                    kentta.setLaiva(laiva4x3, laiva4y3);
                                    kentta.setLaiva(laiva4x4, laiva4y4);
                                    laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                    System.out.println("Onnistui! LaivaIV asetettu pystysuoraan.");
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 5) { // LaivaV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x, y + 2) == true) {
                                if (kentta.onkoVapaaPala(x, y + 3) == true) {
                                    if (kentta.onkoVapaaPala(x, y + 4) == true) {
                                        int laiva5x1 = x;
                                        int laiva5y1 = y;
                                        int laiva5x2 = x;
                                        int laiva5y2 = y + 1;
                                        int laiva5x3 = x;
                                        int laiva5y3 = y + 2;
                                        int laiva5x4 = x;
                                        int laiva5y4 = y + 3;
                                        int laiva5x5 = x;
                                        int laiva5y5 = y + 4;
                                        kentta.setLaiva(laiva5x1, laiva5y1);
                                        kentta.setLaiva(laiva5x2, laiva5y2);
                                        kentta.setLaiva(laiva5x3, laiva5y3);
                                        kentta.setLaiva(laiva5x4, laiva5y4);
                                        kentta.setLaiva(laiva5x5, laiva5y5);
                                        laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                        System.out.println("Onnistui! LaivaV asetettu pystysuoraan.");
                                    }
                                    else {
                                        onnistui = onnistui - 1;
                                    }
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
            }
            else if (suunta == 3) { // vino nouseva
                int x = new Random().nextInt(leveys - pituus + 1);
                int y = pituus - 1 + new Random().nextInt(korkeus);
                if (pituus == 2) { // LaivaII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y - 1) == true) {
                            int laiva2x1 = x;
                            int laiva2y1 = y;
                            int laiva2x2 = x + 1;
                            int laiva2y2 = y - 1;
                            kentta.setLaiva(laiva2x1, laiva2y1);
                            kentta.setLaiva(laiva2x2, laiva2y2);
                            laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                            System.out.println("Onnistui! LaivaII asetettu vinosti nousevaksi.");
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 3) { // LaivaIII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y - 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y - 2) == true) {
                                int laiva3x1 = x;
                                int laiva3y1 = y;
                                int laiva3x2 = x + 1;
                                int laiva3y2 = y - 1;
                                int laiva3x3 = x + 2;
                                int laiva3y3 = y - 2;
                                kentta.setLaiva(laiva3x1, laiva3y1);
                                kentta.setLaiva(laiva3x2, laiva3y2);
                                kentta.setLaiva(laiva3x3, laiva3y3);
                                laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                System.out.println("Onnistui! LaivaIII asetettu vinosti nousevaksi.");
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 4) { // LaivaIV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y - 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y - 2) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y - 3) == true) {
                                    int laiva4x1 = x;
                                    int laiva4y1 = y;
                                    int laiva4x2 = x + 1;
                                    int laiva4y2 = y - 1;
                                    int laiva4x3 = x + 2;
                                    int laiva4y3 = y - 2;
                                    int laiva4x4 = x + 3;
                                    int laiva4y4 = y - 3;
                                    kentta.setLaiva(laiva4x1, laiva4y1);
                                    kentta.setLaiva(laiva4x2, laiva4y2);
                                    kentta.setLaiva(laiva4x3, laiva4y3);
                                    kentta.setLaiva(laiva4x4, laiva4y4);
                                    laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                    System.out.println("Onnistui! LaivaIV asetettu vinosti nousevaksi.");
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 5) { // LaivaV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y - 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y - 2) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y - 3) == true) {
                                    if (kentta.onkoVapaaPala(x + 4, y - 4) == true) {
                                        int laiva5x1 = x;
                                        int laiva5y1 = y;
                                        int laiva5x2 = x + 1;
                                        int laiva5y2 = y - 1;
                                        int laiva5x3 = x + 2;
                                        int laiva5y3 = y - 2;
                                        int laiva5x4 = x + 3;
                                        int laiva5y4 = y - 3;
                                        int laiva5x5 = x + 4;
                                        int laiva5y5 = y - 4;
                                        kentta.setLaiva(laiva5x1, laiva5y1);
                                        kentta.setLaiva(laiva5x2, laiva5y2);
                                        kentta.setLaiva(laiva5x3, laiva5y3);
                                        kentta.setLaiva(laiva5x4, laiva5y4);
                                        kentta.setLaiva(laiva5x5, laiva5y5);
                                        laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                        System.out.println("Onnistui! LaivaV asetettu vinosti nousevaksi.");
                                    }
                                    else {
                                        onnistui = onnistui - 1;
                                    }
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
            }
            else { // suunta == 4, vino laskeva
                int x = new Random().nextInt(leveys - pituus + 1);
                int y = new Random().nextInt(korkeus - pituus + 1);
                if (pituus == 2) { // LaivaII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y + 1) == true) {
                            int laiva2x1 = x;
                            int laiva2y1 = y;
                            int laiva2x2 = x + 1;
                            int laiva2y2 = y + 1;
                            kentta.setLaiva(laiva2x1, laiva2y1);
                            kentta.setLaiva(laiva2x2, laiva2y2);
                            laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                            System.out.println("Onnistui! LaivaII asetettu vinosti laskevaksi.");
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 3) { // LaivaIII
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y + 2) == true) {
                                int laiva3x1 = x;
                                int laiva3y1 = y;
                                int laiva3x2 = x + 1;
                                int laiva3y2 = y + 1;
                                int laiva3x3 = x + 2;
                                int laiva3y3 = y + 2;
                                kentta.setLaiva(laiva3x1, laiva3y1);
                                kentta.setLaiva(laiva3x2, laiva3y2);
                                kentta.setLaiva(laiva3x3, laiva3y3);
                                laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                System.out.println("Onnistui! LaivaIII asetettu vinosti laskevaksi.");
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 4) { // LaivaIV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y + 2) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y + 3) == true) {
                                    int laiva4x1 = x;
                                    int laiva4y1 = y;
                                    int laiva4x2 = x + 1;
                                    int laiva4y2 = y + 1;
                                    int laiva4x3 = x + 2;
                                    int laiva4y3 = y + 2;
                                    int laiva4x4 = x + 3;
                                    int laiva4y4 = y + 3;
                                    kentta.setLaiva(laiva4x1, laiva4y1);
                                    kentta.setLaiva(laiva4x2, laiva4y2);
                                    kentta.setLaiva(laiva4x3, laiva4y3);
                                    kentta.setLaiva(laiva4x4, laiva4y4);
                                    laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                    System.out.println("Onnistui! LaivaIV asetettu vinosti laskevaksi.");
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
                else if (pituus == 5) { // LaivaV
                    if (kentta.onkoVapaaPala(x, y) == true) {
                        if (kentta.onkoVapaaPala(x + 1, y + 1) == true) {
                            if (kentta.onkoVapaaPala(x + 2, y + 2) == true) {
                                if (kentta.onkoVapaaPala(x + 3, y + 3) == true) {
                                    if (kentta.onkoVapaaPala(x + 4, y + 4) == true) {
                                        int laiva5x1 = x;
                                        int laiva5y1 = y;
                                        int laiva5x2 = x + 1;
                                        int laiva5y2 = y + 1;
                                        int laiva5x3 = x + 2;
                                        int laiva5y3 = y + 2;
                                        int laiva5x4 = x + 3;
                                        int laiva5y4 = y + 3;
                                        int laiva5x5 = x + 4;
                                        int laiva5y5 = y + 4;
                                        kentta.setLaiva(laiva5x1, laiva5y1);
                                        kentta.setLaiva(laiva5x2, laiva5y2);
                                        kentta.setLaiva(laiva5x3, laiva5y3);
                                        kentta.setLaiva(laiva5x4, laiva5y4);
                                        kentta.setLaiva(laiva5x5, laiva5y5);
                                        laiva.setLaivanAlkuKoordinaatit(x, y, suunta);
                                        System.out.println("Onnistui! LaivaV asetettu vinosti laskevaksi.");
                                    }
                                    else {
                                        onnistui = onnistui - 1;
                                    }
                                }
                                else {
                                    onnistui = onnistui - 1;
                                }
                            }
                            else {
                                onnistui = onnistui - 1;
                            }
                        }
                        else {
                            onnistui = onnistui - 1;
                        }
                    }
                    else {
                        onnistui = onnistui - 1;
                    }
                }
            }
        }
    }
    
    /*
     * Paljastaa mitä kentällä on.
     */
    public void paljastaKentta() {
        kentta.paljastaKentta();
    }
    
    /*
     * Palauttaa kentän leveyden.
     */
    public int getLeveys() {
        return this.leveys;
    }
    
    /*
     * Palauttaa kentän Kkorkeuden.
     */
    public int getKorkeus() {
        return this.korkeus;
    }
}
