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
import view.ViewConfig;
import static view.ViewConfig.FONT_TITLE;
/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelJadwal  extends JPanel implements ActionListener, ViewConfig {
    private final JPanel Header;
    private final JLabel Judul, Semester, Tahun, Matakuliah, Kelas;
    private final JComboBox ViewSemester, ViewMatkul, ViewKelas;
    private final String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    private final String MatkulValue[] = {"", "ABC", "BCA", "CBA"};
    private final String KelasValue[] = {"", "A", "B"};
    private final JTextField ViewTahun;
    private final JButton Find;
    private final JTable daftarJadwal;
    JScrollPane jScrollPane1;
    public JPanelJadwal(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,700,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
        
        Semester = new JLabel("Semester");
        Semester.setBounds(15,50,100,100);
        add(Semester);
        ViewSemester = new JComboBox(SemesterValue);
        ViewSemester.setBounds(85,90,100,25);
        add(ViewSemester);
        
        Tahun = new JLabel("Tahun");
        Tahun.setBounds(200,50,100,100);
        add(Tahun);
        ViewTahun = new JTextField();
        ViewTahun.setBounds(250,90,50,25);
        add(ViewTahun);
        
        Matakuliah = new JLabel("Matakuliah");
        Matakuliah.setBounds(315,50,100,100);
        add(Matakuliah);
        ViewMatkul = new JComboBox(MatkulValue);
        ViewMatkul.setBounds(390,90,150,25);
        add(ViewMatkul);
        
        Kelas = new JLabel("Kelas");
        Kelas.setBounds(555,50,100,100);
        add(Kelas);
        ViewKelas = new JComboBox(KelasValue);
        ViewKelas.setBounds(605,90,50,25);
        add(ViewKelas);
        
        Find = new JButton("Lihat Jadwal Matakuliah");
        Find.setBounds(15,135,640,30);
        Find.setContentAreaFilled(true);
        Find.setBackground(Color.WHITE);
        Find.setForeground(BGCOLOR_DEFAULT);
        Find.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Find.setFocusPainted(false);
        Find.setFont(FONT_DEFAULT_PLAIN);
        Find.addActionListener(this);
        add(Find);
        
        //Table Jadwal
        daftarJadwal = new JTable();
        jScrollPane1 = new JScrollPane();
        daftarJadwal.setModel(new DefaultTableModel(
            new Object[][] {
                {"1.", "17 Agustus 2020", "07:00", "09:00","IF-101"}, 
                {"2.", "17 September 2020", "10:00", "12:00","IF-203"}, 
                {"3.", "17 Oktober 2020", "13:00", "15:00","MG-302"}, 
                {"4.", "25 Desember 2020", "09:00", "11:00","AK-401"}
            }, 
            new String[] {
                "No", "Tanggal", "Jam Mulai", "Jam Selesai", "Ruangan"
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
        jScrollPane1.setViewportView(daftarJadwal);
        if (daftarJadwal.getColumnModel().getColumnCount() > 0) {
            daftarJadwal.getColumnModel().getColumn(0).setPreferredWidth(30);
            daftarJadwal.getColumnModel().getColumn(1).setPreferredWidth(100);
            daftarJadwal.getColumnModel().getColumn(2).setPreferredWidth(150);
            daftarJadwal.getColumnModel().getColumn(3).setPreferredWidth(30);
            daftarJadwal.getColumnModel().getColumn(4).setPreferredWidth(60);
            
        }
        jScrollPane1.setBounds(15,180,640,420);
        jScrollPane1.setVisible(false);
        add(jScrollPane1);
    }
    public boolean checkAllData(){
        if(ViewSemester.getSelectedItem().toString().equals("")){
            return false;
        }
        if(ViewTahun.getText().equals("")){
            return false;
        }
        if(ViewMatkul.getSelectedItem().toString().equals("")){
            return false;
        }
        if(ViewKelas.getSelectedItem().toString().equals("")){
            return false;
        }
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Daftar Hadir: " + action);
        if(action.equals("Lihat Jadwal Matakuliah")){
            if(checkAllData() == false){
                JOptionPane.showMessageDialog(null,"Silahkan Isi Semua Data!");
            }else{
                Find.setBackground(BGCOLOR_DEFAULT);
                Find.setForeground(COLOR_WHITE);
                jScrollPane1.setVisible(true);
                String printSemester = ViewSemester.getSelectedItem().toString();
                String printTahun = ViewTahun.getText();
                String printMatkul = ViewMatkul.getSelectedItem().toString();
                String printKelas = ViewKelas.getSelectedItem().toString();
            }
        }
    }
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
