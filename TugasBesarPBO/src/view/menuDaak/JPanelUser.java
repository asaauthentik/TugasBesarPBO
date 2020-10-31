/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak;


import view.menuDaak.HelperUser.JPanelMahasiswa;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.*;
import view.ViewConfig;
import static view.ViewConfig.*;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelUser  extends JPanel implements ActionListener,ViewConfig  {
    JLabel title;
    JButton createUser;
    JButton editUser;
    JButton deleteUser;
    JTextField searchUser;
    
    JButton btnSearch;
    JButton btnTypeUser;
    
    String listUser[] = {"","DAAK", "Dosen","Mahasiswa"};
    JComboBox optionListUser;
    
    JPanelMahasiswa mahasiswa;
    public JPanelUser(){
        setLayout(null);
        title = new JLabel("User Management");
        title.setBounds(20, 0, 200, 60);
        title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        add(title);
        
        createUser = new JButton("Tambah User");
        createUser.setBounds(20, 60, 170 ,30);
        createUser.setContentAreaFilled(true);
        createUser.setBackground(COLOR_WHITE);
        createUser.setForeground(BGCOLOR_DEFAULT);
        createUser.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        createUser.setFocusPainted(false);
        createUser.setFont(FONT_DEFAULT_PLAIN );
        createUser.addActionListener(this);
        add(createUser);
        
        editUser = new JButton("Edit User");
        editUser.setBounds(200, 60, 170 ,30);
        editUser.setContentAreaFilled(true);
        editUser.setBackground(COLOR_WHITE);
        editUser.setForeground(BGCOLOR_DEFAULT);
        editUser.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        editUser.setFocusPainted(false);
        editUser.setFont(FONT_DEFAULT_PLAIN );
        editUser.addActionListener(this);
        add(editUser);
        
        deleteUser = new JButton("Hapus User");
        deleteUser.setBounds(380, 60, 170 ,30);
        deleteUser.setContentAreaFilled(true);
        deleteUser.setBackground(COLOR_WHITE);
        deleteUser.setForeground(BGCOLOR_DEFAULT);
        deleteUser.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        deleteUser.setFocusPainted(false);
        deleteUser.setFont(FONT_DEFAULT_PLAIN );
        deleteUser.addActionListener(this);
        add(deleteUser);
        
        searchUser = new JTextField(" Nama atau Nomor Induk");
        searchUser.setBounds(20, 100, 250 ,30);
        searchUser.setFont(FONT_DEFAULT_PLAIN );
        searchUser.setForeground(Color.GRAY);
        searchUser.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchUser.getText().equals(" Nama atau Nomor Induk")) {
                    searchUser.setText("");
                    searchUser.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (searchUser.getText().isEmpty()) {
                    searchUser.setForeground(Color.GRAY);
                    searchUser.setText(" Nama atau Nomor Induk");
                }
            }
        });
        searchUser.setVisible(false);
        add(searchUser);
        
        btnSearch = new JButton("Cari");
        btnSearch.setBounds(285, 100, 100 ,30);
        btnSearch.setContentAreaFilled(true);
        btnSearch.setBackground(BGCOLOR_DEFAULT);
        btnSearch.setForeground(COLOR_WHITE);
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        btnSearch.setFocusPainted(false);
        btnSearch.setFont(FONT_DEFAULT_PLAIN );
        btnSearch.setVisible(false);
        add(btnSearch);
        
        optionListUser = new JComboBox(listUser);
        optionListUser.setBounds(20, 100, 250 ,30);
        add(optionListUser);
        optionListUser.setVisible(false);
        
        btnTypeUser = new JButton("Process");
        btnTypeUser.setBounds(285, 100, 100 ,30);
        btnTypeUser.setContentAreaFilled(true);
        btnTypeUser.setBackground(BGCOLOR_DEFAULT);
        btnTypeUser.setForeground(COLOR_WHITE);
        btnTypeUser.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        btnTypeUser.setFocusPainted(false);
        btnTypeUser.setFont(FONT_DEFAULT_PLAIN );
        btnTypeUser.setVisible(false);
        add(btnTypeUser);
      
        mahasiswa = new JPanelMahasiswa();
        mahasiswa.setBounds(20,135,540,490);
        
        add(mahasiswa);
        //setBackground(Color.RED);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String option = e.getActionCommand();
         System.out.println("Action Panel User : " + option);
         
         createUser.setBackground(COLOR_WHITE);
         createUser.setForeground(BGCOLOR_DEFAULT);
         editUser.setBackground(COLOR_WHITE);
         editUser.setForeground(BGCOLOR_DEFAULT);
         deleteUser.setBackground(COLOR_WHITE);
         deleteUser.setForeground(BGCOLOR_DEFAULT);
         searchUser.setVisible(false);
         btnSearch.setVisible(false);
         btnTypeUser.setVisible(false);
         optionListUser.setVisible(false);
         
         if(option.equals("Tambah User")){
            createUser.setBackground(BGCOLOR_DEFAULT);
            createUser.setForeground(COLOR_WHITE);
            optionListUser.setVisible(true);
            btnTypeUser.setVisible(true);
         }else if(option.equals("Edit User")){
            editUser.setBackground(BGCOLOR_DEFAULT);
            editUser.setForeground(COLOR_WHITE);
            searchUser.setVisible(true);
            btnSearch.setVisible(true);
         }else if(option.equals("Hapus User")){
             revalidate();
             repaint();
            deleteUser.setBackground(BGCOLOR_DEFAULT);
            deleteUser.setForeground(COLOR_WHITE);
            searchUser.setVisible(true);
            btnSearch.setVisible(true);
         }
    }
    
     
   
}
