/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.ViewConfig;

/**
 *
 * @author S W I F T 3
 */
public class JPanelHelperMatakuliah extends JPanel implements ActionListener, ViewConfig {
    private  JLabel labelNim;
    private  JLabel labelNama;
    private  JLabel labelEmail;
    private  JLabel labelPassword;
    private  JLabel labelTanggal;
    private  JLabel labelJK;
    private  JLabel labelTelp;
    private  JLabel labelJurusan;
    public JPanelHelperMatakuliah(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
