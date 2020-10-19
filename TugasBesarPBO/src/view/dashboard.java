/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class dashboard implements ActionListener,ViewConfig {
    CardLayout card;
    JPanelProfile profile;
    JPanel cardPanel ;
    JPanel sideBar;
    public dashboard(){
        card = new CardLayout();
        sideBar = new JPanel(new GridLayout(10, 1, 10, 5));
        //--Action Menu
        JButton showProfile = new JButton("Show Profile");
        JButton showRencanaStudi = new JButton("Show Rencana Studi");
        JButton showTranskripNilai = new JButton("Show Transkrip Nilai");
        JButton showKeuangan = new JButton("Show Keuangan");
        JButton showJadwalAbsensi = new JButton("Show Jadwal Absensi");
        sideBar.add(showProfile);
        sideBar.add(showRencanaStudi);
        sideBar.add(showTranskripNilai);
        sideBar.add(showKeuangan);
        sideBar.add(showJadwalAbsensi);
        sideBar.setBackground(BGCOLOR_DEFAULT);
        sideBar.setBorder(new EmptyBorder(40, 15, 5, 15));
        
        showProfile.addActionListener(this);
        showRencanaStudi.addActionListener(this);
        showTranskripNilai.addActionListener(this);
        showKeuangan.addActionListener(this);
        showJadwalAbsensi.addActionListener(this);
        
        
        //--List Menu
        profile = new JPanelProfile();
        cardPanel = new JPanel(card);
        
        cardPanel.add(profile,"Profile");
        
        
        
        //-- Inisialisasi Frame
        JFrame frame = new JFrame("Sistem Informasi Akademik");
        frame.add(cardPanel);
        frame.add(sideBar, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
