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
import javax.swing.table.DefaultTableModel;
import view.ViewConfig;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelDaftarHadir extends JPanel implements ActionListener, ViewConfig{
    private final JPanel Header;
    private final JLabel Judul, Matkul, Tahun, Semester;
    private final JComboBox ViewMatkul, ViewSemester;
    private final String MatkulValue[] = {"", "A", "B", "C"};
    private final String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    private final JTextField ViewTahun;
    private final JButton Find;
    private final JTable daftarHadir;
    JScrollPane jScrollPane1;
    public JPanelDaftarHadir(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,700,50);
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
        ViewMatkul.setBounds(100,90,200,25);
        add(ViewMatkul);
        Tahun = new JLabel("Tahun");
        Tahun.setBounds(320,50,100,100);
        add(Tahun);
        ViewTahun = new JTextField();
        ViewTahun.setBounds(380,90,80,25);
        add(ViewTahun);
        Semester = new JLabel("Semester");
        Semester.setBounds(480,50,100,100);
        add(Semester);
        ViewSemester = new JComboBox(SemesterValue);
        ViewSemester.setBounds(555,90,100,25);
        add(ViewSemester);
        //Button Lihat Daftar Hadir
        Find = new JButton("Lihat Daftar Hadir");
        Find.setBounds(15,130,640,30);
        Find.setContentAreaFilled(true);
        Find.setBackground(Color.WHITE);
        Find.setForeground(BGCOLOR_DEFAULT);
        Find.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Find.setFocusPainted(false);
        Find.setFont(FONT_DEFAULT_PLAIN);
        Find.addActionListener(this);
        add(Find);
        //Table Daftar Hadir
        daftarHadir = new JTable();
        jScrollPane1 = new JScrollPane();
        daftarHadir.setModel(new DefaultTableModel(
            new Object[][] {
                {"1.", "101", "Algoritma", "A","12"}, 
                {"2.", "102", "Kalkulus", "A","11"}, 
                {"3.", "103", "Web Programming", "B","13"}, 
                {"4.", "103", "Web Design", "B","13"}
            }, 
            new String[] {
                "No", "Kode MK", "Nama Matakuliah", "Kelas", "Jumlah Kehadiran"
            }
        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(daftarHadir);
        if (daftarHadir.getColumnModel().getColumnCount() > 0) {
            daftarHadir.getColumnModel().getColumn(0).setPreferredWidth(30);
            daftarHadir.getColumnModel().getColumn(1).setPreferredWidth(100);
            daftarHadir.getColumnModel().getColumn(2).setPreferredWidth(150);
            daftarHadir.getColumnModel().getColumn(3).setPreferredWidth(30);
            daftarHadir.getColumnModel().getColumn(4).setPreferredWidth(60);
            
        }
        jScrollPane1.setBounds(15,180,640,420);
        jScrollPane1.setVisible(false);
        add(jScrollPane1);
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
                Find.setBackground(BGCOLOR_DEFAULT);
                Find.setForeground(COLOR_WHITE);
                jScrollPane1.setVisible(true);
                String printMatkul = ViewMatkul.getSelectedItem().toString();
                String printTahun = ViewTahun.getText();
                String printSemester = ViewSemester.getSelectedItem().toString();
            }
        }
    }
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
