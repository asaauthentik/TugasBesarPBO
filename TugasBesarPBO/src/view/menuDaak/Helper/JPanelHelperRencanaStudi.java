/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.matakuliah.DetailMatakuliah;
import model.matakuliah.RencanaStudi;
import view.ViewConfig;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.COLOR_WHITE;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;

/**
 *
 * @author S W I F T 3
 */
public class JPanelHelperRencanaStudi extends JPanel implements ActionListener, ViewConfig  {
    private  JLabel labelJumlahMK;
    private  JLabel labelKodeMK;
    private  JLabel labelNamaMK;
    private  JLabel labelSKS;
    
    private JTextField fieldJumlahMK;
    private ArrayList<JTextField> fieldMK;
    private ArrayList<JLabel> fieldNamaMK;
    private ArrayList<JLabel> fieldSKS;
           
    private JButton cekMK;
    private JButton btnJumlahMK;
    private JButton Save;
    private JButton Delete;
    
    private String type;
    private int jmlMK;
    private String idrsm = "";
    private String nim = "";
    private String semester = "" ;
    private int tahun = 0;
    
    public JPanelHelperRencanaStudi(String type,String idrsm,String nim, String semester, int tahun){
        this.idrsm = idrsm;
        this.nim = nim;
        this.semester = semester;
        this.tahun = tahun;
        setLayout(null);
       
        cekMK = new JButton("Cek Data");
        cekMK.setBounds(260,445, 100, 30);
        cekMK.setContentAreaFilled(true);
        cekMK.setBackground(BGCOLOR_DEFAULT);
        cekMK.setForeground(COLOR_WHITE);
        cekMK.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        cekMK.setFocusPainted(false);
        cekMK.setFont(FONT_DEFAULT_PLAIN);
        cekMK.addActionListener(this);
        cekMK.setVisible(false);
        add(cekMK);
            
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
            generateNumberMK();
            cekMK.setVisible(true);
            Delete.setVisible(false);
            Save.setVisible(true);
        }else if(type.equals("Delete")){
            generateShowForm();
            cekMK.setVisible(false);
            Delete.setVisible(true);
            Save.setVisible(false);
        }else if(type.equals("Edit")){
            generateEditForm();
            cekMK.setVisible(true);
            Delete.setVisible(false);
            Save.setVisible(true);
        }
        this.type = type;
    }    
    private void generateNumberMK(){
        labelJumlahMK = new JLabel("Jumlah Matakuliah");
        labelJumlahMK.setBounds(0,5, 120, 30);
        labelJumlahMK.setFont(FONT_DEFAULT_PLAIN );
        add(labelJumlahMK);
        
        fieldJumlahMK = new JTextField();
        fieldJumlahMK.setBounds(140,5, 200, 30);
        fieldJumlahMK.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJumlahMK);
        
        btnJumlahMK = new JButton("Ok");
        btnJumlahMK.setBounds(360,5, 100, 30);
        btnJumlahMK.setContentAreaFilled(true);
        btnJumlahMK.setBackground(BGCOLOR_DEFAULT);
        btnJumlahMK.setForeground(COLOR_WHITE);
        btnJumlahMK.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        btnJumlahMK.setFocusPainted(false);
        btnJumlahMK.setFont(FONT_DEFAULT_PLAIN);
        btnJumlahMK.addActionListener(this);
        add(btnJumlahMK);
        
        
    }
    private void generateLabel(){
        int marginTop = 45;
        
        labelKodeMK = new JLabel("Kode MK");
        labelKodeMK.setFont(FONT_DEFAULT_PLAIN);
        labelKodeMK.setBounds(0,marginTop, 70, 30);
        labelKodeMK.setVisible(false);
        add(labelKodeMK);
        labelKodeMK.setVisible(true);
        
        labelNamaMK = new JLabel("Nama MK");
        labelNamaMK.setFont(FONT_DEFAULT_PLAIN);
        labelNamaMK.setBounds(90,marginTop, 200, 30);
        labelNamaMK.setVisible(false);
        add(labelNamaMK);
        labelNamaMK.setVisible(true);
        
        labelSKS = new JLabel("SKS");
        labelSKS.setFont(FONT_DEFAULT_PLAIN);
        labelSKS.setBounds(310,marginTop, 70, 30);
        labelSKS.setVisible(false);
        add(labelSKS);
        labelSKS.setVisible(true);
        
    }
    
    private void generateInputForm(){
        
        generateLabel();
        
        fieldMK = new ArrayList<JTextField>();
        fieldNamaMK = new ArrayList<JLabel>();
        fieldSKS = new ArrayList<JLabel>();
        
        int marginTop = 85;
        for(int i=0; i<jmlMK; i++){
            JTextField temp = new JTextField();
            temp.setBounds(0,marginTop, 70, 30);
            temp.setFont(FONT_DEFAULT_PLAIN);
            temp.setVisible(false);
            add(temp);
            temp.setVisible(true);
            fieldMK.add(temp);
            
            JLabel temp1 = new JLabel("-");
            temp1.setBounds(90,marginTop, 200, 30);
            temp1.setFont(FONT_DEFAULT_PLAIN);
            temp1.setVisible(false);
            add(temp1);
            temp1.setVisible(true);
            fieldNamaMK.add(temp1);
            
            JLabel temp2 = new JLabel("-");
            temp2.setBounds(310,marginTop, 70, 30);
            temp2.setFont(FONT_DEFAULT_PLAIN);
            temp2.setVisible(false);
            add(temp2);
            temp2.setVisible(true);
            fieldSKS.add(temp2);
                       
            marginTop += 40;
        }
      
    }
    
    private void generateEditForm(){
        //Check Database 
        jmlMK = 6;
        generateNumberMK();
        fieldJumlahMK.setText(String.valueOf(jmlMK));
        generateInputForm();
        
    }
    
    private void generateShowForm(){
        
        generateEditForm();
        btnJumlahMK.setEnabled(false);
        for(int i=0; i< fieldMK.size(); i++){
            fieldMK.get(i).setEditable(false);
        }
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Rencana Studi : " + action);
        if(action.equals("Ok") && type.equals("Input")){
            jmlMK = Integer.valueOf(fieldJumlahMK.getText());
            if(fieldMK != null){
                for(int i=0; i<fieldMK.size(); i++){
                    fieldMK.get(i).setVisible(false);
                    fieldNamaMK.get(i).setVisible(false);
                    fieldSKS.get(i).setVisible(false);
                }
                fieldMK.clear();
                fieldNamaMK.clear();
                fieldSKS.clear();
            }
            generateInputForm();
        }
        if(action.equals("Simpan")){
            ArrayList<String> idMK = new ArrayList<>();
            for(int i=0; i<fieldMK.size(); i++){
                String kodeMKCheck = fieldMK.get(i).getText();
                if(false){
                    JOptionPane.showMessageDialog(labelKodeMK, "Kode MK " + kodeMKCheck + " tidak ditemukan !");
                    return;
                }
                idMK.add(kodeMKCheck);
                System.out.println( i + " : " + kodeMKCheck);
            }
            RencanaStudi newRS = new RencanaStudi(idrsm,semester,tahun,idMK);
            //Masukan ke db newRs
            if(true){
                JOptionPane.showMessageDialog(labelKodeMK, "Data berhasil dimasukan ke database");
            }else{
                JOptionPane.showMessageDialog(labelKodeMK, "Data tidak berhasil dimasukan ke database");
            }
        }
        if(action.equals("Cek Data")){
            //Lakukan pengecehkan ke database nama matakuliahnya
            for(int i=0; i<fieldMK.size(); i++){
                fieldNamaMK.get(i).setText("Matakuliah ke-" + i);
            }
        }
    }
}
