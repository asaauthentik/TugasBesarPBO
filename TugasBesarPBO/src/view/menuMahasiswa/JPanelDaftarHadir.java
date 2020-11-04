/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelDaftarHadir extends JPanel implements ActionListener{
    private final JPanel Header;
    private final JLabel Judul, Matkul, Tahun, Semester;
    private final JComboBox ViewMatkul, ViewSemester;
    private final String MatkulValue[] = {"", "A", "B", "C"};
    private final String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    private final JTextField ViewTahun;
    private final JButton Find;
    private final JTable daftarHadir;
    private final String data[][] = {
        {"1.", "101", "Algoritma", "A","12"}, 
        {"2.", "102", "Kalkulus", "A","11"}, 
        {"3.", "103", "Web Programming", "B","13"}, 
        {"4.", "103", "Web Design", "B","13"}}; 
    private final String column[] = {"No", "Kode MK", "Nama Matakuliah", "Kelas", "Jumlah Kehadiran"};
    public JPanelDaftarHadir(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,600,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
        
        Matkul = new JLabel("Matakuliah");
        Matkul.setBounds(15,50,90,100);
        add(Matkul);
        ViewMatkul = new JComboBox(MatkulValue);
        ViewMatkul.setBounds(90,90,170,25);
        add(ViewMatkul);
        Tahun = new JLabel("Tahun");
        Tahun.setBounds(275,50,100,100);
        add(Tahun);
        ViewTahun = new JTextField();
        ViewTahun.setBounds(325,90,50,25);
        add(ViewTahun);
        Semester = new JLabel("Semester");
        Semester.setBounds(385,50,100,100);
        add(Semester);
        ViewSemester = new JComboBox(SemesterValue);
        ViewSemester.setBounds(455,90,100,25);
        add(ViewSemester);
        //Button Lihat Daftar Hadir
        Find = new JButton("Lihat Daftar Hadir");
        Find.setBounds(15,130,540,30);
        Find.setContentAreaFilled(true);
        Find.setBackground(Color.WHITE);
        Find.setForeground(BGCOLOR_DEFAULT);
        Find.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Find.setFocusPainted(false);
        Find.setFont(FONT_DEFAULT_PLAIN);
        Find.addActionListener(this);
        add(Find);
        //Table Daftar Hadir
        daftarHadir = new JTable(data, column);
        daftarHadir.setBounds(15,180,540,500);
        add(daftarHadir);
        daftarHadir.setVisible(false);
        
//        JScrollPane table = new JScrollPane(daftarHadir);  
//        add(table);
//        setVisible(true);
    }
    private boolean checkAllData(){
        if(ViewMatkul.getSelectedItem().toString().equals("")){
            return false;
        }
        if(ViewTahun.getText().equals("")){
            return false;
        }
        if(ViewSemester.getSelectedItem().toString().equals("")){
            return false;
        }
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Daftar Hadir: " + action);
        if(action.equals("Lihat Daftar Hadir")){
            if(checkAllData() == false){
                JOptionPane.showMessageDialog(null,"Silahkan Isi Semua Data!");
            }else{
                String printMatkul = ViewMatkul.getSelectedItem().toString();
                String printTahun = ViewTahun.getText();
                String printSemester = ViewSemester.getSelectedItem().toString();
                daftarHadir.setVisible(true);
            }
        }
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(568, 520);
    }
}
