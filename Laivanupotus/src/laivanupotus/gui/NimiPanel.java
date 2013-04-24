
package laivanupotus.gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * NimiPanel.
 * Sisältää nimi-kyselyn (JLabel, JTextField, JButton)
 * Sijoittuu ohjelmassa ylänurkkaan.
 *
 * @author mohman
 */
public class NimiPanel extends JPanel {
    private JTextField nimiKentta;
    private JLabel nimiLabel;
    
    public NimiPanel() {
        super(new GridLayout(2, 3));
        this.nimiKentta = new JTextField("");
        this.nimiLabel = new JLabel("      Nimi: ");
        luoKomponentit();
    }
    
    private void luoKomponentit() {
        add(nimiLabel);
        add(nimiKentta);
        add(new JButton("OK"));
        
        add(new JLabel(""));
        add(new JLabel(""));
        add(new JLabel(""));
    }
    
    public void setNimi(String nimi) {
        this.nimiKentta = new JTextField(nimi);
    }
    
    public String getNimi() {
        return this.nimiKentta.toString();
    }
    
    public JTextField getNimiKentta() {
        return this.nimiKentta;
    }
    
    public void setNimiLabel() {
        this.nimiLabel = new JLabel("Hei " + getNimi());
    }
    
    public JLabel getNimiLabel() {
        return this.nimiLabel;
    }
}
