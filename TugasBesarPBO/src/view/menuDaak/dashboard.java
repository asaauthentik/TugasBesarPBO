/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak;

//testgit
import view.menuDaak.Helper.JPanelTable;
import view.menuDaak.Helper.JPanelHelperMahasiswa;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
    JPanelProfile profile;
    JPanelRencanaStudi rencanaStudi;
    JPanelMatakuliah matakuliah;
    JPanelKeuangan keuangan;
    JPanelUser user;
    JPanelTable dosen;
    JPanelHelperMahasiswa mahasiswa;
    JPanelJadwalPerkuliahan jadwalPerkuliahan;
      
    //List Button
    JButton showProfile ;
    JButton showRencanaStudi ;
    JButton showMatakuliah ;
    JButton showKeuangan ;
    JButton showJadwalPerkuliahan;
    JButton showUser;
      
    public dashboard(){
        card = new CardLayout();
        cardPanel = new JPanel(card);
        sideBar = new JPanel(new GridLayout(10, 1, 10, 5));
        
        //--Action Menu
        showProfile = new JButton("Profile");
        showRencanaStudi = new JButton("Rencana Studi");
        showMatakuliah = new JButton("Matakuliah");
        showKeuangan = new JButton("Keuangan");
        showJadwalPerkuliahan = new JButton("Jadwal Perkuliahan");
        showUser = new JButton("User");
      
        sideBar.add(showProfile);
        sideBar.add(showRencanaStudi);
        sideBar.add(showMatakuliah);
        sideBar.add(showKeuangan);
        sideBar.add(showJadwalPerkuliahan);
        sideBar.add(showUser);
        
        
        //--Styling
        
        sideBar.setBackground(BGCOLOR_DEFAULT);
        sideBar.setBorder(new EmptyBorder(130, 0, 15, 0));
        
        showProfile.setBackground(BGCOLOR_DEFAULT);
        showRencanaStudi.setBackground(BGCOLOR_DEFAULT);
        showMatakuliah.setBackground(BGCOLOR_DEFAULT);
        showKeuangan.setBackground(BGCOLOR_DEFAULT);
        showJadwalPerkuliahan.setBackground(BGCOLOR_DEFAULT);
        showUser.setBackground(BGCOLOR_DEFAULT);
        
        showProfile.setForeground(COLOR_WHITE );
        showRencanaStudi.setForeground(COLOR_GRAY);
        showMatakuliah.setForeground(COLOR_GRAY);
        showKeuangan.setForeground(COLOR_GRAY);
        showJadwalPerkuliahan.setForeground(COLOR_GRAY);
        showUser.setForeground(COLOR_GRAY);
        
        showProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showRencanaStudi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showMatakuliah.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showKeuangan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showJadwalPerkuliahan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
        showUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, COLOR_WHITE));
       
        showProfile.setPreferredSize(new Dimension(200, 20));
        showRencanaStudi.setPreferredSize(new Dimension(200, 20));
        showMatakuliah.setPreferredSize(new Dimension(200, 20));
        showKeuangan.setPreferredSize(new Dimension(200, 20));
        showJadwalPerkuliahan.setPreferredSize(new Dimension(200, 20));
        showUser.setPreferredSize(new Dimension(200, 20));
      
        showProfile.setBorderPainted(true);
        showRencanaStudi.setBorderPainted(false);
        showMatakuliah.setBorderPainted(false);
        showKeuangan.setBorderPainted(false);
        showJadwalPerkuliahan.setBorderPainted(false);
        showUser.setBorderPainted(false);
       
        showProfile.setContentAreaFilled(false);
        showRencanaStudi.setContentAreaFilled(false);
        showMatakuliah.setContentAreaFilled(false);
        showKeuangan.setContentAreaFilled(false);
        showJadwalPerkuliahan.setContentAreaFilled(false);
        showUser.setContentAreaFilled(false);
        
        showProfile.setFocusPainted(false);
        showRencanaStudi.setFocusPainted(false);
        showMatakuliah.setFocusPainted(false);
        showKeuangan.setFocusPainted(false);
        showJadwalPerkuliahan.setFocusPainted(false);
        showUser.setFocusPainted(false);
       
             
        //End of styling
        
        showProfile.addActionListener(this);
        showRencanaStudi.addActionListener(this);
        showMatakuliah.addActionListener(this);
        showKeuangan.addActionListener(this);
        showJadwalPerkuliahan.addActionListener(this);
        showUser.addActionListener(this);
        
        
        //--List Menu
        profile = new JPanelProfile();
        rencanaStudi = new JPanelRencanaStudi();
        matakuliah = new JPanelMatakuliah();
        keuangan = new JPanelKeuangan();
        jadwalPerkuliahan = new JPanelJadwalPerkuliahan();
        user = new JPanelUser();
        
        cardPanel.add(profile,"ProfilePanel");
        cardPanel.add(rencanaStudi,"RencanaStudiPanel");
        cardPanel.add(matakuliah,"MatakuliahPanel");
        cardPanel.add(keuangan,"KeuanganPanel");
        cardPanel.add(jadwalPerkuliahan,"JadwalPerkuliahanPanel");
        cardPanel.add(user,"UserPanel");
      
        
        //End of List Menu
        
        //-- Inisialisasi Frame
        JFrame frame = new JFrame("Sistem Informasi Akademik");
        frame.add(cardPanel);
        frame.add(sideBar, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLocationRelativeTo(null);
        //End of Inisialisasi Frame
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String option = e.getActionCommand();
        
        showProfile.setForeground(COLOR_GRAY);
        showRencanaStudi.setForeground(COLOR_GRAY);
        showMatakuliah.setForeground(COLOR_GRAY);
        showKeuangan.setForeground(COLOR_GRAY);
        showJadwalPerkuliahan.setForeground(COLOR_GRAY);
        showUser.setForeground(COLOR_GRAY);
        
        showProfile.setBorderPainted(false);
        showRencanaStudi.setBorderPainted(false);
        showMatakuliah.setBorderPainted(false);
        showKeuangan.setBorderPainted(false);
        showJadwalPerkuliahan.setBorderPainted(false);
        showUser.setBorderPainted(false);
        
        if(null != option)switch (option) {
            case "Profile":
                card.show(cardPanel,"ProfilePanel");
                showProfile.setBorderPainted(true);
                showProfile.setForeground(COLOR_WHITE);
                break;
            case "Rencana Studi":
                card.show(cardPanel,"RencanaStudiPanel");
                showRencanaStudi.setBorderPainted(true);
                showRencanaStudi.setForeground(COLOR_WHITE);
                break;
            case "Matakuliah":
                card.show(cardPanel,"MatakuliahPanel");
                showMatakuliah.setBorderPainted(true);
                showMatakuliah.setForeground(COLOR_WHITE);
                break;
            case "Keuangan":
                card.show(cardPanel,"KeuanganPanel");
                showKeuangan.setBorderPainted(true);
                showKeuangan.setForeground(COLOR_WHITE);
                break;
            case "Jadwal Perkuliahan":
                card.show(cardPanel,"JadwalPerkuliahanPanel");
                showJadwalPerkuliahan.setBorderPainted(true);
                showJadwalPerkuliahan.setForeground(COLOR_WHITE);
                break;
            case "User":
                card.show(cardPanel,"UserPanel");
                showUser.setBorderPainted(true);
                showUser.setForeground(COLOR_WHITE);
                break;
            default:
                break;
        }
        System.out.println(option);
    }
    public static void main(String[] args) {
        new dashboard();
        
        //new view.menuMahasiswa.dashboard();
    }
}
