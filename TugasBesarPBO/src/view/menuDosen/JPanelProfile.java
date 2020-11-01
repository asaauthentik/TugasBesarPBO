/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDosen;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 */
public class JPanelProfile extends JPanel{
    JLabel dummy;
    public JPanelProfile(){
        dummy = new JLabel("Hi this is profile side");
        setBackground(Color.WHITE);
        add(dummy);
    }
    
    
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
