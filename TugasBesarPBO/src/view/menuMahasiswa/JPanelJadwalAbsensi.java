/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelJadwalAbsensi  extends JPanel {
    public JPanelJadwalAbsensi(){
        setBackground(Color.RED);
    }
    
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
