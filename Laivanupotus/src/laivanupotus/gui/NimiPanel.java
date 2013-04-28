
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
    private JLabel info1Label;
    private JLabel info2Label;
    private JLabel info3Label;
    private JButton ok;
    
    public NimiPanel() {
        super(new GridLayout(2, 3));
        this.nimiKentta = new JTextField("");
        this.info1Label = new JLabel("");
        this.info2Label = new JLabel("");
        this.info3Label = new JLabel("");
        this.ok = new JButton("OK");
        //luoKomponentit();
    }
    
    public void luoKomponentit() {
        add(new JLabel("      Nimi: "));
        add(nimiKentta);
        add(ok);
        
        add(info1Label);
        add(info2Label);
        add(info3Label);
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
     * Asettaa info tekstiä info 1 kohdalle.
     */
    public void setInfo1Label(String teksti) {
        info1Label.setText(teksti);
    }
    
    /*
     * Asettaa info tekstiä info 2 kohdalle.
     */
    public void setInfo2Label(String teksti) {
        info2Label.setText(teksti);
    }
    
    /*
     * Asettaa info tekstiä info 3 kohdalle.
     */
    public void setInfo3Label(String teksti) {
        info3Label.setText(teksti);
    }
    
    /*
     * Palauttaa OK-napin.
     */
    public JButton getOkNappi() {
        return this.ok;
    }
}
