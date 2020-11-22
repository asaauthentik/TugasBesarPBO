/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.matakuliah.DetailMatakuliah;
import model.matakuliah.Kehadiran;
import model.matakuliah.Nilai;
import model.matakuliah.Roster;
import view.ViewConfig;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;

/**
 *
 * @author S W I F T 3
 */
public class JPanelHelperDetailMatakuliah extends JPanel implements ActionListener, ViewConfig  {
    private  JLabel labelKodeMK;
    private  JLabel labelTahunAjaran;
    private  JLabel labelSemester;
    private  JLabel labelKelas;
    private  JLabel labelJumlahPertemuan;
    
    JTextField fieldKodeMK;
    JTextField fieldTahunAjaran;
    String[] listSemester = {"","Ganjil", "Genap","Pendek"};
    JComboBox fieldSemester;
    JTextField fieldKelas;
    JTextField fieldJumlahPertemuan;
        
    JButton Save;
    JButton Delete;
    
    String idMK;
    public JPanelHelperDetailMatakuliah(String type,String idMK){
        this(type);
        this.idMK = idMK;
    }
    public JPanelHelperDetailMatakuliah(String type){
        setLayout(null);
       
        Save = new JButton("Simpan");
        Save.setBounds(370,445, 100, 30);
        Save.setContentAreaFilled(true);
        Save.setBackground(BGCOLOR_DEFAULT);
        Save.setForeground(COLOR_WHITE);
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Save.setFocusPainted(false);
        Save.setFont(FONT_DEFAULT_PLAIN);
        Save.addActionListener(this);
        Save.setVisible(false);
        add(Save);
        
        Delete = new JButton("Hapus");
        Delete.setBounds(370,445, 100, 30);
        Delete.setContentAreaFilled(true);
        Delete.setBackground(BGCOLOR_DEFAULT);
        Delete.setForeground(COLOR_WHITE);
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Delete.setFocusPainted(false);
        Delete.setFont(FONT_DEFAULT_PLAIN);
        Delete.addActionListener(this);
        Delete.setVisible(false);
        add(Delete);
        
        if(type.equals("Input")){
            generateInputForm();
            Delete.setVisible(false);
            Save.setVisible(true);
        }else if(type.equals("Delete")){
            generateShowForm();
            Delete.setVisible(true);
            Save.setVisible(false);
        }else if(type.equals("Edit")){
            generateEditForm();
            Delete.setVisible(false);
            Save.setVisible(true);
        }
    }
    private void generateLabel(){
                
        labelKodeMK = new JLabel("Kode Matakuliah  :");
        labelKodeMK.setBounds(0,5, 120, 30);
        labelKodeMK.setFont(FONT_DEFAULT_PLAIN );
        add(labelKodeMK);
        
        labelTahunAjaran = new JLabel("Tahun Ajaran :");
        labelTahunAjaran.setBounds(0,45, 120, 30);
        labelTahunAjaran.setFont(FONT_DEFAULT_PLAIN );
        add(labelTahunAjaran);
        
        labelSemester = new JLabel("Semester :");
        labelSemester.setBounds(0,85, 120, 30);
        labelSemester.setFont(FONT_DEFAULT_PLAIN);
        add(labelSemester);
        
        labelKelas = new JLabel("Kelas :");
        labelKelas.setBounds(0,125, 120, 30);
        labelKelas.setFont(FONT_DEFAULT_PLAIN);
        add(labelKelas);
        
        labelJumlahPertemuan = new JLabel("Jumlah Pertemuan :");
        labelJumlahPertemuan.setBounds(0,165, 130, 30);
        labelJumlahPertemuan.setFont(FONT_DEFAULT_PLAIN);
        add(labelJumlahPertemuan);
       
    }
    
    private void generateInputForm(){
        
        generateLabel();
        
        fieldKodeMK = new JTextField();
        fieldKodeMK.setBounds(140,5, 100, 30);
        fieldKodeMK.setFont(FONT_DEFAULT_PLAIN);
        add(fieldKodeMK);
        
        fieldTahunAjaran = new JTextField();
        fieldTahunAjaran.setBounds(140,45, 100, 30);
        fieldTahunAjaran.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTahunAjaran);
        
        fieldSemester = new JComboBox(listSemester);
        fieldSemester.setBounds(140,85, 200, 30);
        fieldSemester.setFont(FONT_DEFAULT_PLAIN);
        add(fieldSemester);
        
        fieldKelas = new JTextField();
        fieldKelas.setBounds(140,125, 70, 30);
        fieldKelas.setFont(FONT_DEFAULT_PLAIN);
        add(fieldKelas);
        
        fieldJumlahPertemuan = new JTextField();
        fieldJumlahPertemuan.setBounds(140,165, 70, 30);
        fieldJumlahPertemuan.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJumlahPertemuan);
        
        
      
    }
    
    private void generateEditForm(){
    
        generateInputForm();
        
        fieldKodeMK.setText("IF-301");
        fieldTahunAjaran.setText("2020");
        fieldSemester.setSelectedIndex(1);
        fieldKelas.setText("A");
        fieldJumlahPertemuan.setText("14");
    
    }
    
    private void generateShowForm(){
        
        generateEditForm();
        
        fieldKodeMK.setEditable(false);
        fieldTahunAjaran.setEditable(false);
        fieldSemester.setEnabled(false);
        fieldKelas.setEnabled(false);
        fieldJumlahPertemuan.setEditable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Detail Matakuliah : " + action);
        if(action.equals("Simpan")){
            System.out.println("Hasil : ");
            String kodeMK = fieldKodeMK.getText();
            String tahunAjaran = fieldTahunAjaran.getText();
            String semester = (String) fieldSemester.getItemAt(fieldSemester.getSelectedIndex());
            String kelas = fieldKelas.getText();
            String jumlahPertemuan = fieldJumlahPertemuan.getText();
            DetailMatakuliah dtlMk = new DetailMatakuliah(idMK,Integer.valueOf(tahunAjaran), semester, kelas.charAt(0) , Integer.valueOf(jumlahPertemuan),kodeMK);
            System.out.println(dtlMk.toString());
            //Tambahakn ke controller database
        }else if(action.equals("Hapus")){
            System.out.println("Masuk Hapus ke database");
            //Hapus ke controller database
        }
        
    }
    
}
