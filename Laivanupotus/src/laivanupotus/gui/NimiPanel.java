
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
    private JLabel tervehdysLabel;
    private JButton ok;
    
    public NimiPanel() {
        super(new GridLayout(2, 3));
        this.nimiKentta = new JTextField("");
        this.tervehdysLabel = new JLabel("");
        this.ok = new JButton("OK");
        //luoKomponentit();
    }
    
    public void luoKomponentit() {
        add(new JLabel("      Nimi: "));
        add(nimiKentta);
        add(ok);
        
        add(new JLabel(""));
        add(tervehdysLabel);
        add(new JLabel(""));
    }
    
    /*
     * Asettaa nimen nimi-kenttään.
     */
    public void setNimi(String nimi) {
        this.nimiKentta = new JTextField(nimi);
    }
    
    /*
     * Palauttaa nimi-kentässä olevan nimen Stringinä.
     */
    public String getNimi() {
        return this.nimiKentta.toString();
    }
    
    /*
     * Palauttaa nimi-kentän JTextField:inä.
     */
    public JTextField getNimiKentta() {
        return this.nimiKentta;
    }
    
    /*
     * Asettaa tervehdystekstin.
     */
    public void setTervehdysLabel(String teksti) {
        this.tervehdysLabel.setText(teksti);
    }
    
    /*
     * Palauttaa tervehdystekstin.
     */
    public JLabel getTervehdysLabel() {
        return this.tervehdysLabel;
    }
    
    /*
     * Palauttaa OK-napin.
     */
    public JButton getOkNappi() {
        return this.ok;
    }
}
