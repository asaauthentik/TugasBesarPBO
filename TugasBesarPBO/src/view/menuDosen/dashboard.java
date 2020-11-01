/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDosen;

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
 * @author 1119006 William Juniar
 */
public class dashboard implements ActionListener,ViewConfig {
    CardLayout card;
    JPanel cardPanel;
    JPanel sideBar;
    //--List Card as Menu
   
    //Menu Dosen
    JPanelProfile profile;
    JPanelJadwalMengajar jadwalmengajar;
    JPanelDaftarKehadiran daftarkehadiran;
    JPanelNilaiMatakuliah nilaimatakuliah;
    JPanelRekapDataMengajar rekapdatamengajar;
    
    
    //List Button
    JButton showProfile;
    JButton showJadwalMengajar;
    JButton showDaftarKehadiran;
    JButton showNilaiMatakuliah;
    JButton showRekapDataMengajar;
    
    public dashboard(){
        card = new CardLayout();
        cardPanel = new JPanel(card);
        sideBar = new JPanel(new GridLayout(10, 1, 10, 5));
        
        //--Action Menu
        showProfile = new JButton("Profile");
        showJadwalMengajar = new JButton("Jadwal Mengajar");
        showDaftarKehadiran = new JButton("Daftar Kehadiran");
        showNilaiMatakuliah = new JButton("Nilai Matakuliah");
        showRekapDataMengajar = new JButton("Rekap Data Mengajar");
        sideBar.add(showProfile);
        sideBar.add(showJadwalMengajar);
        sideBar.add(showDaftarKehadiran);
        sideBar.add(showNilaiMatakuliah);
        sideBar.add(showRekapDataMengajar);
        
        //--Styling
        
        sideBar.setBackground(BGCOLOR_DEFAULT);
        sideBar.setBorder(new EmptyBorder(130, 0, 15, 0));
        
        showProfile.setBackground(BGCOLOR_DEFAULT);
        showJadwalMengajar.setBackground(BGCOLOR_DEFAULT);
        showDaftarKehadiran.setBackground(BGCOLOR_DEFAULT);
        showNilaiMatakuliah.setBackground(BGCOLOR_DEFAULT);
        showRekapDataMengajar.setBackground(BGCOLOR_DEFAULT);
        
        showProfile.setForeground(COLOR_WHITE );
        showJadwalMengajar.setForeground(COLOR_GRAY);
        showDaftarKehadiran.setForeground(COLOR_GRAY);
        showNilaiMatakuliah.setForeground(COLOR_GRAY);
        showRekapDataMengajar.setForeground(COLOR_GRAY);
        
        showProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showJadwalMengajar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showDaftarKehadiran.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showNilaiMatakuliah.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showRekapDataMengajar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        
        showProfile.setPreferredSize(new Dimension(200, 20));
        showJadwalMengajar.setPreferredSize(new Dimension(200, 20));
        showDaftarKehadiran.setPreferredSize(new Dimension(200, 20));
        showNilaiMatakuliah.setPreferredSize(new Dimension(200, 20));
        showRekapDataMengajar.setPreferredSize(new Dimension(200, 20));
        
        showProfile.setBorderPainted(true);
        showJadwalMengajar.setBorderPainted(false);
        showDaftarKehadiran.setBorderPainted(false);
        showNilaiMatakuliah.setBorderPainted(false);
        showRekapDataMengajar.setBorderPainted(false);
        
        showProfile.setContentAreaFilled(false);
        showJadwalMengajar.setContentAreaFilled(false);
        showDaftarKehadiran.setContentAreaFilled(false);
        showNilaiMatakuliah.setContentAreaFilled(false);
        showRekapDataMengajar.setContentAreaFilled(false);
        
        showProfile.setFocusPainted(false);
        showJadwalMengajar.setFocusPainted(false);
        showDaftarKehadiran.setFocusPainted(false);
        showNilaiMatakuliah.setFocusPainted(false);
        showRekapDataMengajar.setFocusPainted(false);
        
        //End of styling
        
        showProfile.addActionListener(this);
        showJadwalMengajar.addActionListener(this);
        showDaftarKehadiran.addActionListener(this);
        showNilaiMatakuliah.addActionListener(this);
        showRekapDataMengajar.addActionListener(this);
        
        
        //--List Menu
        profile = new JPanelProfile();
        jadwalmengajar = new JPanelJadwalMengajar();
        daftarkehadiran = new JPanelDaftarKehadiran();
        nilaimatakuliah = new JPanelNilaiMatakuliah();
        rekapdatamengajar = new JPanelRekapDataMengajar();
        
        cardPanel.add(profile,"ProfilePanel");
        cardPanel.add(jadwalmengajar,"JadwalMengajarPanel");
        cardPanel.add(daftarkehadiran,"DaftarKehadiranPanel");
        cardPanel.add(nilaimatakuliah,"NilaiMatakuliahPanel");
        cardPanel.add(rekapdatamengajar,"RekapDataMengajarPanel");
        
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
        showJadwalMengajar.setForeground(COLOR_GRAY);
        showDaftarKehadiran.setForeground(COLOR_GRAY);
        showNilaiMatakuliah.setForeground(COLOR_GRAY);
        showRekapDataMengajar.setForeground(COLOR_GRAY);
        
        showProfile.setBorderPainted(false);
        showJadwalMengajar.setBorderPainted(false);
        showDaftarKehadiran.setBorderPainted(false);
        showNilaiMatakuliah.setBorderPainted(false);
        showRekapDataMengajar.setBorderPainted(false);
        if("Profile".equals(option)){
            card.show(cardPanel,"ProfilePanel");
            showProfile.setBorderPainted(true);
            showProfile.setForeground(COLOR_WHITE);
        }else if("Jadwal Mengajar".equals(option)){
            card.show(cardPanel,"JadwalMengajarPanel");
            showJadwalMengajar.setBorderPainted(true);
             showJadwalMengajar.setForeground(COLOR_WHITE);
        }else if("Daftar Kehadiran".equals(option)){
            card.show(cardPanel,"DaftarKehadiranPanel");
            showDaftarKehadiran.setBorderPainted(true);
            showDaftarKehadiran.setForeground(COLOR_WHITE);
        }else if("Nilai Matakuliah".equals(option)){
            card.show(cardPanel,"NilaiMatakuliahPanel");
            showNilaiMatakuliah.setBorderPainted(true);
            showNilaiMatakuliah.setForeground(COLOR_WHITE);
        }else if("Rekap Data Mengajar".equals(option)){
            card.show(cardPanel,"RekapDataMengajarPanel");
            showRekapDataMengajar.setBorderPainted(true);
            showRekapDataMengajar.setForeground(COLOR_WHITE);
        }
        //System.out.println(option);
    }
    public static void main(String[] args) {
        new dashboard();
    }
}
