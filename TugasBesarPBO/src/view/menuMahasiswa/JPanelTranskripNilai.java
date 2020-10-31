/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;
/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelTranskripNilai  extends JPanel {
    JPanel Header;
    JLabel Judul, Tahun, Semester;
    JComboBox ViewSemester;
    String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    JTextField ViewTahun;
    JButton Find;
    JTable daftarNilai;
    String data[][] = {
        {"1.", "101", "Algoritma", "77", "88", "99", "100", "86", "90", "96", "A"}, 
        {"2.", "102", "Kalkulus",  "77", "88", "99", "100", "86", "90", "96", "A"}, 
        {"3.", "103", "Web Programming",  "77", "88", "99", "100", "86", "90", "96", "A"}, 
        {"4.", "104", "Web Design",  "77", "88", "99", "100", "86", "90", "96", "A"}}; 
    String column[] = {"No", "Kode MK", "Nama Matakuliah", "N1", "N2", "N3", "N4", "N5", "UAS", "NA", "HM"};
    public JPanelTranskripNilai(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,600,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
        
        Tahun = new JLabel("Tahun");
        Tahun.setBounds(40,50,100,100);
        add(Tahun);
        ViewTahun = new JTextField();
        ViewTahun.setBounds(85,90,50,25);
        add(ViewTahun);
        Semester = new JLabel("Semester");
        Semester.setBounds(145,50,100,100);
        add(Semester);
        ViewSemester = new JComboBox(SemesterValue);
        ViewSemester.setBounds(210,90,100,25);
        add(ViewSemester);
        //Button Lihat Daftar Hadir
        Find = new JButton("Lihat Daftar Nilai");
        Find.setBounds(330,88,200,30);
        Find.setContentAreaFilled(true);
        Find.setBackground(Color.WHITE);
        Find.setForeground(BGCOLOR_DEFAULT);
        Find.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Find.setFocusPainted(false);
        Find.setFont(FONT_DEFAULT_PLAIN);
        add(Find);
        //Table Daftar Hadir
        daftarNilai = new JTable();
        daftarNilai.setBounds(15,130,540,500);
        daftarNilai.setBackground(Color.GRAY);
        add(daftarNilai);
//        JScrollPane table = new JScrollPane(daftarHadir);  
//        add(table);
//        setVisible(true);
    }
    
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
