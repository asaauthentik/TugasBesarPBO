/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import view.ViewConfig;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelKeuangan  extends JPanel implements ViewConfig {
    public JPanelKeuangan(){
        setBackground(Color.BLUE);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
