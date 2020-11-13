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
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;
/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelTranskripNilai  extends JPanel implements ActionListener, ViewConfig{
    private final JPanel Header;
    private final JLabel Judul, Tahun, Semester;
    private final JComboBox ViewSemester;
    private final String SemesterValue[] = {"", "Ganjil", "Genap", "Pendek"};
    private final JTextField ViewTahun;
    private final JButton Find;
    private final JTable daftarNilai;
    JScrollPane jScrollPane1;
    public JPanelTranskripNilai(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,700,50);
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
        Find.setBounds(330,88,300,30);
        Find.setContentAreaFilled(true);
        Find.setBackground(Color.WHITE);
        Find.setForeground(BGCOLOR_DEFAULT);
        Find.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Find.setFocusPainted(false);
        Find.setFont(FONT_DEFAULT_PLAIN);
        Find.addActionListener(this);
        add(Find);
        //Table Daftar Hadir
        daftarNilai = new JTable();
        jScrollPane1 = new JScrollPane();
        daftarNilai.setModel(new DefaultTableModel(
            new Object[][] {
                {"1.", "101", "Algoritma", "77", "88", "99", "100", "86", "90", "96", "A"}, 
                {"2.", "102", "Kalkulus",  "77", "88", "99", "100", "86", "90", "96", "A"}, 
                {"3.", "103", "Web Programming",  "77", "88", "99", "100", "86", "90", "96", "A"}, 
                {"4.", "104", "Web Design",  "77", "88", "99", "100", "86", "90", "96", "A"}
            }, 
            new String[] {
                "No", "Kode MK", "Nama Matakuliah", "N1", "N2", "N3", "N4", "N5", "UAS", "NA", "HM"
            }
        ){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(daftarNilai);
        if (daftarNilai.getColumnModel().getColumnCount() > 0) {
            daftarNilai.getColumnModel().getColumn(0).setPreferredWidth(30);
            daftarNilai.getColumnModel().getColumn(1).setPreferredWidth(60);
            daftarNilai.getColumnModel().getColumn(2).setPreferredWidth(200);
            daftarNilai.getColumnModel().getColumn(3).setPreferredWidth(30);
            daftarNilai.getColumnModel().getColumn(4).setPreferredWidth(60);
            daftarNilai.getColumnModel().getColumn(5).setPreferredWidth(60);
        }
        jScrollPane1.setBounds(15,140,640,460);
        jScrollPane1.setVisible(false);
        add(jScrollPane1);

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
            Find.setBackground(BGCOLOR_DEFAULT);
            Find.setForeground(COLOR_WHITE);
            jScrollPane1.setVisible(true);
            String printTahun = ViewTahun.getText();
            String printSemester = ViewSemester.getSelectedItem().toString();
        }
    }
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
