/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.*;
import model.user.Mahasiswa;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import view.ViewConfig;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelMahasiswa extends JPanel implements ActionListener, ViewConfig {
    private  JLabel labelNim;
    private  JLabel labelNama;
    private  JLabel labelEmail;
    private  JLabel labelPassword;
    private  JLabel labelTanggal;
    private  JLabel labelJK;
    private  JLabel labelTelp;
    private  JLabel labelJurusan;
    private  JLabel labelTahunMasuk;
    private  JLabel labelTahunLulus;
    private  JLabel labelIpk;
    private  JLabel labelPredikat;
    
    private JTextField fieldNim;
    private JTextField fieldNama;
    private JTextField fieldEmail;
    private JPasswordField fieldPassword;
    
     
    private UtilDateModel modelTglLahir;
    private JDatePanelImpl datePanelTglLahir;
    private Properties  propertiesTglLahir;   
    private JDatePickerImpl fieldTanggalLahir;
        
    private ButtonGroup groupJk;
    private JRadioButton fieldPria;
    private JRadioButton fieldWanita;
    private JTextField fieldTelp;
    private JTextField fieldJurusan;
    private JTextField fieldTahunMasuk;
    private JTextField fieldTahunLulus;
    private JTextField fieldIpk;
    private JTextField fieldPredikat;
    
    private JButton Save;
    private JButton Delete;
    
    private Mahasiswa data;
    
    public JPanelMahasiswa(String type){
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
        //setBackground(Color.PINK);
    }
    
    private void generateLabel(){
        
        labelNim = new JLabel("Nim :");
        labelNim.setBounds(0,5, 120, 30);
        labelNim.setFont(FONT_DEFAULT_PLAIN );
        add(labelNim);
        
        
        labelNama = new JLabel("Nama :");
        labelNama.setBounds(0,45, 120, 30);
        labelNama.setFont(FONT_DEFAULT_PLAIN );
        add(labelNama);
        
        labelEmail = new JLabel("Email :");
        labelEmail.setBounds(0,85, 120, 30);
        labelEmail.setFont(FONT_DEFAULT_PLAIN);
        add(labelEmail);
        
        labelPassword = new JLabel("Password :");
        labelPassword.setBounds(0,125, 120, 30);
        labelPassword.setFont(FONT_DEFAULT_PLAIN);
        add(labelPassword);
        
        labelTanggal = new JLabel("Tanggal Lahir :");
        labelTanggal.setBounds(0,165, 120, 30);
        labelTanggal.setFont(FONT_DEFAULT_PLAIN);
        add(labelTanggal);
        
        labelJK = new JLabel("Jenis Kelamin :");
        labelJK.setBounds(0,205, 120, 30);
        labelJK.setFont(FONT_DEFAULT_PLAIN);
        add(labelJK);
        
        labelTelp = new JLabel("Nomor Telepon :");
        labelTelp.setBounds(0,245, 120, 30);
        labelTelp.setFont(FONT_DEFAULT_PLAIN);
        add(labelTelp);
                
        labelJurusan = new JLabel("Jurusan :");
        labelJurusan.setBounds(0,285, 120, 30);
        labelJurusan.setFont(FONT_DEFAULT_PLAIN);
        add(labelJurusan);
        
        labelTahunMasuk = new JLabel("Tahun Masuk :");
        labelTahunMasuk.setBounds(0,325, 120, 30);
        labelTahunMasuk.setFont(FONT_DEFAULT_PLAIN);
        add(labelTahunMasuk);
        
        labelTahunLulus = new JLabel("Tahun Lulus :");
        labelTahunLulus.setBounds(0,365, 120, 30);
        labelTahunLulus.setFont(FONT_DEFAULT_PLAIN);
        add(labelTahunLulus);
        
        labelIpk = new JLabel("IPK :");
        labelIpk.setBounds(0,405, 120, 30);
        labelIpk.setFont(FONT_DEFAULT_PLAIN);
        add(labelIpk);

        labelPredikat = new JLabel("Predikat :");
        labelPredikat.setBounds(0,445, 120, 30);
        labelPredikat.setFont(FONT_DEFAULT_PLAIN);
        add(labelPredikat);
        
    }
    
    private void generateInputForm(){
        
        generateLabel();
        
        fieldNim = new JTextField();
        fieldNim.setBounds(120,5, 200, 30);
        fieldNim.setFont(FONT_DEFAULT_PLAIN);
        add(fieldNim);
        
        fieldNama = new JTextField();
        fieldNama.setBounds(120,45, 200, 30);
        fieldNama.setFont(FONT_DEFAULT_PLAIN);
        add(fieldNama);
        
        fieldEmail = new JTextField();
        fieldEmail.setBounds(120,85, 200, 30);
        fieldEmail.setFont(FONT_DEFAULT_PLAIN);
        add(fieldEmail);
        
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(120,125, 200, 30);
        fieldPassword.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPassword);
        
        propertiesTglLahir = new Properties();
        propertiesTglLahir.put("text.today", "Today");
        propertiesTglLahir.put("text.month", "Month");
        propertiesTglLahir.put("text.year", "Year");
        modelTglLahir = new UtilDateModel();
        datePanelTglLahir = new JDatePanelImpl(modelTglLahir, propertiesTglLahir);
        fieldTanggalLahir = new JDatePickerImpl(datePanelTglLahir, new DateLabelFormatter());
        fieldTanggalLahir.setBounds(120,165, 200, 30);
        add(fieldTanggalLahir);
                
        fieldPria = new JRadioButton("Pria");
        fieldPria.setBounds(120,205, 100, 30);
        fieldPria.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPria);
        
        fieldWanita = new JRadioButton("Wanita");
        fieldWanita.setBounds(220,205, 100, 30);
        fieldWanita.setFont(FONT_DEFAULT_PLAIN);
        add(fieldWanita);
        
        groupJk = new ButtonGroup();
        groupJk.add(fieldPria);
        groupJk.add(fieldWanita);
        
        fieldTelp = new JTextField();
        fieldTelp.setBounds(120,245, 200, 30);
        fieldTelp.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTelp);
        
        fieldJurusan = new JTextField();
        fieldJurusan.setBounds(120,285, 200, 30);
        fieldJurusan.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJurusan);
        
        fieldTahunMasuk = new JTextField();
        fieldTahunMasuk.setBounds(120,325, 50, 30);
        fieldTahunMasuk.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTahunMasuk);
        
        fieldTahunLulus = new JTextField();
        fieldTahunLulus.setBounds(120,365, 50, 30);
        fieldTahunLulus.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTahunLulus);
        
        fieldIpk = new JTextField();
        fieldIpk.setBounds(120,405, 50, 30);
        fieldIpk.setFont(FONT_DEFAULT_PLAIN);
        add(fieldIpk);
        
        fieldPredikat = new JTextField();
        fieldPredikat.setBounds(120,445, 200, 30);
        fieldPredikat.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPredikat);
        
    }
    
    private void generateEditForm(){
        
        generateInputForm();
              
        fieldNim.setText("1119002");
        fieldNama.setText("Albertus Angkuw");
        fieldEmail.setText("angkuwjr@yahoo.com");
        fieldPassword.setText("hidei");
        modelTglLahir.setSelected(true);
        modelTglLahir.setDate(2001, 9, 17);
        if("P".equals("Pria")){
           fieldPria.setSelected(true);
        }else{
           fieldWanita.setSelected(true); 
        }
        fieldTelp.setText("087884825093");
        fieldJurusan.setText("Informatika");
        fieldTahunMasuk.setText("2019");
        fieldTahunLulus.setText("2022");
        fieldIpk.setText("3.9");
        fieldPredikat.setText("");
        
        
        
    }
    
    private void generateShowForm(){
        
        generateEditForm();
              
        fieldNim.setEditable(false);
        fieldNama.setEditable(false);
        fieldEmail.setEditable(false);
        fieldPassword.setEditable(false);
        modelTglLahir.setSelected(true);
        modelTglLahir.setDate(2001, 9, 17);
        fieldTanggalLahir.setEnabled(false);
        fieldTanggalLahir.getComponent(1).setEnabled(false);
        fieldPria.setEnabled(false);
        fieldWanita.setEnabled(false); 
        fieldTelp.setEditable(false);
        fieldJurusan.setEditable(false);
        fieldTahunMasuk.setEditable(false);
        fieldTahunLulus.setEditable(false);
        fieldIpk.setEditable(false);
        fieldPredikat.setEditable(false);
        Save.setVisible(false);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Mahasiswa : " + action);
        if(action.equals("Simpan")){
            if(data != null){
                data = new Mahasiswa();
            }
            String nim = fieldNim.getText();
            String nama = fieldNama.getText();
            String email = fieldEmail.getText();
            String password = new String(fieldPassword.getPassword());
            String tanggalLahir = fieldTanggalLahir.getModel().getValue().toString();
            String jk = "";
            if(fieldPria.isSelected()){
                jk = "Laki-Laki";
            }else if(fieldWanita.isSelected()){
                jk = "Perempuan";
            }
            String telepon =  fieldTelp.getText();
            String jurusan =fieldJurusan.getText();
            String tahunMasuk = fieldTahunMasuk.getText();
            String tahunLulus = fieldTahunLulus.getText();
            String ipk = fieldIpk.getText();
            String predikat = fieldPredikat.getText();
            
            System.out.println("Nim : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("Email : " + email);
            System.out.println("Password : " + password);
            System.out.println("Tanggal Lahir : " + tanggalLahir);
            System.out.println("JK : " + jk);
            System.out.println("Telepon : " + telepon);
            System.out.println("Jurusan : " + jurusan);
            System.out.println("Tahun Masuk : " + tahunMasuk);
            System.out.println("Tahun Luslus : " + tahunLulus);
            System.out.println("Ipk : " + ipk);
            System.out.println("Predikat : " + predikat);
            
//            System.out.println("Tanggal Awal : " + tanggalLahir);
//            fieldTanggalLahir.getModel().addDay(7);
//            String tglAkhir = fieldTanggalLahir.getModel().getValue().toString();
//            System.out.println("Tanggal Ending : " + tglAkhir);
//            
            //To Sql Controller !
        }else if(action.equals("Hapus")){
            System.out.println("Menggunakan controller unttuk delete");
        }
        
    }
    
   
   
}
