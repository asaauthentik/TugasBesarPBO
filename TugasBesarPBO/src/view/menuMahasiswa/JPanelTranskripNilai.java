/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class JPanelTranskripNilai  extends JPanel implements ActionListener{
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
        Find.addActionListener(this);
        add(Find);
        //Table Daftar Hadir
        daftarNilai = new JTable(data,column);
        daftarNilai.setBounds(15,130,540,500);
        daftarNilai.setVisible(false);
        add(daftarNilai);
    }
    private boolean checkAllData(){
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
        System.out.println("Action Panel Transkrip Nilai: " + action);
        if(checkAllData() == false){
            JOptionPane.showMessageDialog(null,"Silahkan Isi Semua Data!");
        }else{
            String printTahun = ViewTahun.getText();
            String printSemester = ViewSemester.getSelectedItem().toString();
            daftarNilai.setVisible(true);
        }
    }
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
