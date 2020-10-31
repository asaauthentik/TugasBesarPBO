/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
public class JPanelDaftarHadir extends JPanel{
    JPanel Header;
    JLabel Judul, Matkul, Tahun, Semester;
    JComboBox ViewMatkul, ViewSemester;
    String MatkulValue[] = {"", "A", "B", "C"};
    String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    JTextField ViewTahun;
    JButton Find;
    JTable daftarHadir;
    String data[][] = {
        {"1.", "101", "Algoritma", "12"}, 
        {"2.", "102", "Kalkulus", "11"}, 
        {"3.", "103", "Web Programming", "13"}, 
        {"4.", "103", "Web Design", "13"}}; 
    String column[] = {"No", "Kode MK", "Nama Matakuliah", "Jumlah Kehadiran"};
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
        add(Find);
        //Table Daftar Hadir
        daftarHadir = new JTable(data, column);
        daftarHadir.setBounds(15,180,540,500);
        add(daftarHadir);
//        JScrollPane table = new JScrollPane(daftarHadir);  
//        add(table);
//        setVisible(true);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(568, 520);
    }
}
