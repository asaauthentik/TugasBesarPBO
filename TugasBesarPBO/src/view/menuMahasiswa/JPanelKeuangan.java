/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import view.ViewConfig;
import static view.ViewConfig.FONT_TITLE;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelKeuangan  extends JPanel implements ViewConfig{
    private final JPanel Header;
    private final JLabel Judul;
    public JPanelKeuangan(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,700,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
