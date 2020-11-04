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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;
/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelRencanaStudi  extends JPanel implements ActionListener {
    private final JPanel Header;
    private final JLabel Judul, Tahun, Semester;
    private final JComboBox ViewSemester;
    private final String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    private final JTextField ViewTahun;
    private final JButton Find;
    private final JTable rencanaStudi;
    JScrollPane jScrollPane1;
    public JPanelRencanaStudi(){
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
        Find = new JButton("Lihat Daftar Matakuliah");
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
        rencanaStudi = new JTable();
        rencanaStudi.setBounds(15,130,540,500);
        add(rencanaStudi);
        rencanaStudi.setVisible(false);
        jScrollPane1 = new JScrollPane();
        rencanaStudi.setModel(new DefaultTableModel(
            new Object[][] {
                {"1.", "101", "Algoritma", "A", "Teori", "Wajib"}, 
                {"2.", "102", "Kalkulus", "A", "Teori", "Wajib"}, 
                {"3.", "103", "Web Programming", "B", "Praktikum", "Optional"}, 
                {"4.", "104", "Web Design", "B", "Parktikum", "Wajib"}
            }, 
            new String[] {
                "No", "Kode MK", "Nama Matakuliah", "Kelas", "Jenis MK","Sifat MK"
            }
        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }
//    public void table(){
//        JTable tabelContoh = new javax.swing.JTable();
//        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
//
//        //Buat model 
//        tabelContoh.setModel(new javax.swing.table.DefaultTableModel(
//            //Untuk Data
//            new Object [][] {
//                {1, "101", "Algo", "A", "Teori", "Wajib"},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//            },
//            //Untuk Header
//            new String [] {
//                "No", "Kode MK", "Nama MK", "Kelas", "Jenis MK", "Sifat MK"
//            }
//        ) {
//
//            //Untuk Tipe Data Yang Digunakan
//            Class[] types = new Class [] {
//                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
//            };
//
//            /*
//               Untuk Mengatur apakah kolom bisa diedit
//               Contohnya yang bisa tidak bisa edit itu kolom No , Kode MK
//            */
//            boolean[] canEdit = new boolean [] {
//                false, false, true, true, true, true
//            };
//
//            //Untuk mereturn setings colomn yang dibuat
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//
//            @Override
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//        });
//
//        //Tambahkan tabel ke ScrollPane
//        jScrollPane1.setViewportView(tabelContoh);
//        //Untuk menset size per colom !
//        if (tabelContoh.getColumnModel().getColumnCount() > 0) {
//            tabelContoh.getColumnModel().getColumn(0).setPreferredWidth(30);
//            tabelContoh.getColumnModel().getColumn(1).setPreferredWidth(100);
//            tabelContoh.getColumnModel().getColumn(2).setPreferredWidth(200);
//            tabelContoh.getColumnModel().getColumn(3).setPreferredWidth(30);
//            tabelContoh.getColumnModel().getColumn(4).setPreferredWidth(60);
//            tabelContoh.getColumnModel().getColumn(5).setPreferredWidth(60);
//        }
//        //Untuk bisa digunakan di panel
//        jScrollPane1.setBounds(0, 0, 400, 300);
//        //Tamabahin ke panel
//        add(jScrollPane1);
//    }
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
        System.out.println("Action Panel Rencana Studi: " + action);
        if(action.equals("Lihat Daftar Matakuliah")){
            if(checkAllData() == false){
                JOptionPane.showMessageDialog(null,"Silahkan Isi Semua Data!");
            }else{
                String printTahun = ViewTahun.getText();
                String printSemester = ViewSemester.getSelectedItem().toString();
                rencanaStudi.setVisible(true);
            }
        }
    }
    @Override
    public Dimension getPreferredSize() {
        
        return new Dimension(568, 520);
    }
}
