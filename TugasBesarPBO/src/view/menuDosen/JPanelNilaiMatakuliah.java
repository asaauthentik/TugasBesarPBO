/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDosen;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 */
public class JPanelNilaiMatakuliah  extends JPanel {
    public JPanelNilaiMatakuliah(){
        setBackground(Color.DARK_GRAY);
    }
    
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
