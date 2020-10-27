/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

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
import view.ViewConfig;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class dashboard implements ActionListener,ViewConfig {
    CardLayout card;
    JPanel cardPanel;
    JPanel sideBar;
    //--List Card as Menu
    //Menu DAAK
    
    //Menu Dosen
    
    //Menu Mahasiswa
    JPanelProfile profile;
    JPanelRencanaStudi rencanaStudi;
    JPanelTranskripNilai transkripNilai;
    JPanelKeuangan keuangan;
    JPanelJadwalAbsensi absensi;
    
    //List Button
    JButton showProfile ;
    JButton showRencanaStudi ;
    JButton showTranskripNilai ;
    JButton showKeuangan ;
    JButton showJadwalAbsensi;
    
    public dashboard(){
        card = new CardLayout();
        cardPanel = new JPanel(card);
        sideBar = new JPanel(new GridLayout(10, 1, 10, 5));
        
        //--Action Menu
        showProfile = new JButton("Profile");
        showRencanaStudi = new JButton("Rencana Studi");
        showTranskripNilai = new JButton("Transkrip Nilai");
        showKeuangan = new JButton("Keuangan");
        showJadwalAbsensi = new JButton("Jadwal Absensi");
        sideBar.add(showProfile);
        sideBar.add(showRencanaStudi);
        sideBar.add(showTranskripNilai);
        sideBar.add(showKeuangan);
        sideBar.add(showJadwalAbsensi);
        
        //--Styling
        
        sideBar.setBackground(BGCOLOR_DEFAULT);
        sideBar.setBorder(new EmptyBorder(130, 0, 15, 0));
        
        showProfile.setBackground(BGCOLOR_DEFAULT);
        showRencanaStudi.setBackground(BGCOLOR_DEFAULT);
        showTranskripNilai.setBackground(BGCOLOR_DEFAULT);
        showKeuangan.setBackground(BGCOLOR_DEFAULT);
        showJadwalAbsensi.setBackground(BGCOLOR_DEFAULT);
        
        showProfile.setForeground(COLOR_WHITE );
        showRencanaStudi.setForeground(COLOR_GRAY);
        showTranskripNilai.setForeground(COLOR_GRAY);
        showKeuangan.setForeground(COLOR_GRAY);
        showJadwalAbsensi.setForeground(COLOR_GRAY);
        
        showProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showRencanaStudi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showTranskripNilai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showKeuangan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showJadwalAbsensi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        
        showProfile.setPreferredSize(new Dimension(200, 20));
        showRencanaStudi.setPreferredSize(new Dimension(200, 20));
        showTranskripNilai.setPreferredSize(new Dimension(200, 20));
        showKeuangan.setPreferredSize(new Dimension(200, 20));
        showJadwalAbsensi.setPreferredSize(new Dimension(200, 20));
        
        showProfile.setBorderPainted(true);
        showRencanaStudi.setBorderPainted(false);
        showTranskripNilai.setBorderPainted(false);
        showKeuangan.setBorderPainted(false);
        showJadwalAbsensi.setBorderPainted(false);
        
        showProfile.setContentAreaFilled(false);
        showRencanaStudi.setContentAreaFilled(false);
        showTranskripNilai.setContentAreaFilled(false);
        showKeuangan.setContentAreaFilled(false);
        showJadwalAbsensi.setContentAreaFilled(false);
        
        showProfile.setFocusPainted(false);
        showRencanaStudi.setFocusPainted(false);
        showTranskripNilai.setFocusPainted(false);
        showKeuangan.setFocusPainted(false);
        showJadwalAbsensi.setFocusPainted(false);
        
        //End of styling
        
        showProfile.addActionListener(this);
        showRencanaStudi.addActionListener(this);
        showTranskripNilai.addActionListener(this);
        showKeuangan.addActionListener(this);
        showJadwalAbsensi.addActionListener(this);
        
        
        //--List Menu
        profile = new JPanelProfile();
        rencanaStudi = new JPanelRencanaStudi();
        transkripNilai = new JPanelTranskripNilai();
        keuangan = new JPanelKeuangan();
        absensi = new JPanelJadwalAbsensi();
        
        cardPanel.add(profile,"ProfilePanel");
        cardPanel.add(rencanaStudi,"RencanaStudiPanel");
        cardPanel.add(transkripNilai,"TranskripNilaiPanel");
        cardPanel.add(keuangan,"KeuanganPanel");
        cardPanel.add(absensi,"AbsensiPanel");
        
        //End of List Menu
        
        //-- Inisialisasi Frame
        JFrame frame = new JFrame("Sistem Informasi Akademik");
        frame.add(cardPanel);
        frame.add(sideBar, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        //End of Inisialisasi Frame
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String option = e.getActionCommand();
        
        showProfile.setForeground(COLOR_GRAY);
        showRencanaStudi.setForeground(COLOR_GRAY);
        showTranskripNilai.setForeground(COLOR_GRAY);
        showKeuangan.setForeground(COLOR_GRAY);
        showJadwalAbsensi.setForeground(COLOR_GRAY);
        
        showProfile.setBorderPainted(false);
        showRencanaStudi.setBorderPainted(false);
        showTranskripNilai.setBorderPainted(false);
        showKeuangan.setBorderPainted(false);
        showJadwalAbsensi.setBorderPainted(false);
        if("Profile".equals(option)){
            card.show(cardPanel,"ProfilePanel");
            showProfile.setBorderPainted(true);
            showProfile.setForeground(COLOR_WHITE);
        }else if("Rencana Studi".equals(option)){
            card.show(cardPanel,"RencanaStudiPanel");
            showRencanaStudi.setBorderPainted(true);
             showRencanaStudi.setForeground(COLOR_WHITE);
        }else if("Transkrip Nilai".equals(option)){
            card.show(cardPanel,"TranskripNilaiPanel");
            showTranskripNilai.setBorderPainted(true);
            showTranskripNilai.setForeground(COLOR_WHITE);
        }else if("Keuangan".equals(option)){
            card.show(cardPanel,"KeuanganPanel");
            showKeuangan.setBorderPainted(true);
            showKeuangan.setForeground(COLOR_WHITE);
        }else if("Jadwal Absensi".equals(option)){
            card.show(cardPanel,"AbsensiPanel");
            showJadwalAbsensi.setBorderPainted(true);
            showJadwalAbsensi.setForeground(COLOR_WHITE);
        }
        //System.out.println(option);
    }
}
