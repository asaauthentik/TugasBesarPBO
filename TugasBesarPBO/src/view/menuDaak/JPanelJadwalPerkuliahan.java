/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import view.ViewConfig;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelJadwalPerkuliahan extends JPanel implements ViewConfig{
    public JPanelJadwalPerkuliahan(){
        setBackground(Color.MAGENTA);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
