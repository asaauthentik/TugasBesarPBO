/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.HelperUser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.*;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import view.ViewConfig;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelDosen extends JPanel implements ActionListener, ViewConfig {
    private  JLabel labelNid;
    private  JLabel labelNama;
    private  JLabel labelEmail;
    private  JLabel labelPassword;
    private  JLabel labelTanggal;
    private  JLabel labelJK;
    private  JLabel labelTelp;
    private  JLabel labelProgramStudi;
    private  JLabel labelBidangIlmu;
    private  JLabel labelGelarAkademik;
    private  JLabel labelStatusPegawai;
    private  JLabel labelIkatanKerja;
    private  JLabel labelStatusDosen;
    
    JTextField fieldNim;
    JTextField fieldNama;
    JTextField fieldEmail;
    JPasswordField fieldPassword;
    
     
    UtilDateModel modelTglLahir;
    JDatePanelImpl datePanelTglLahir;
    Properties  propertiesTglLahir;   
    JDatePickerImpl fieldTanggalLahir;
        
    ButtonGroup groupJk;
    JRadioButton fieldPria;
    JRadioButton fieldWanita;
    JTextField fieldTelp;
    JTextField fieldJurusan;
    JTextField fieldTahunMasuk;
    JTextField fieldTahunLulus;
    JTextField fieldIpk;
    JTextField fieldPredikat;
    
    JButton Save;
    
    
    public JPanelDosen(){
        setLayout(null);
        generateInputForm();
        
        Save = new JButton("Save");
        Save.setBounds(370,445, 100, 30);
        Save.setContentAreaFilled(true);
        Save.setBackground(BGCOLOR_DEFAULT);
        Save.setForeground(COLOR_WHITE);
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Save.setFocusPainted(false);
        Save.setFont(FONT_DEFAULT_PLAIN);
        add(Save);
               
        //setBackground(Color.PINK);
    }
    
    private void generateLabel(){
        
        labelNid = new JLabel("Nim :");
        labelNid.setBounds(0,5, 150, 30);
        labelNid.setFont(FONT_DEFAULT_PLAIN );
        add(labelNid);
        
        
        labelNama = new JLabel("Nama :");
        labelNama.setBounds(0,45, 150, 30);
        labelNama.setFont(FONT_DEFAULT_PLAIN );
        add(labelNama);
        
        labelEmail = new JLabel("Email \t:");
        labelEmail.setBounds(0,85, 150, 30);
        labelEmail.setFont(FONT_DEFAULT_PLAIN);
        add(labelEmail);
        
        labelPassword = new JLabel("Password \t:");
        labelPassword.setBounds(0,125, 150, 30);
        labelPassword.setFont(FONT_DEFAULT_PLAIN);
        add(labelPassword);
        
        labelTanggal = new JLabel("Tanggal Lahir \t:");
        labelTanggal.setBounds(0,165, 150, 30);
        labelTanggal.setFont(FONT_DEFAULT_PLAIN);
        add(labelTanggal);
        
        labelJK = new JLabel("Jenis Kelamin :");
        labelJK.setBounds(0,205, 150, 30);
        labelJK.setFont(FONT_DEFAULT_PLAIN);
        add(labelJK);
        
        labelTelp = new JLabel("Nomor Telepon :");
        labelTelp.setBounds(0,245, 150, 30);
        labelTelp.setFont(FONT_DEFAULT_PLAIN);
        add(labelTelp);
                
        labelProgramStudi = new JLabel("Jurusan :");
        labelProgramStudi.setBounds(0,285, 150, 30);
        labelProgramStudi.setFont(FONT_DEFAULT_PLAIN);
        add(labelProgramStudi);
        
        labelBidangIlmu = new JLabel("Tahun Masuk :");
        labelBidangIlmu.setBounds(0,325, 150, 30);
        labelBidangIlmu.setFont(FONT_DEFAULT_PLAIN);
        add(labelBidangIlmu);
        
        labelGelarAkademik = new JLabel("Tahun Lulus");
        labelGelarAkademik.setBounds(0,365, 150, 30);
        labelGelarAkademik.setFont(FONT_DEFAULT_PLAIN);
        add(labelGelarAkademik);
        
        labelStatusPegawai = new JLabel("IPK");
        labelStatusPegawai.setBounds(0,405, 150, 30);
        labelStatusPegawai.setFont(FONT_DEFAULT_PLAIN);
        add(labelStatusPegawai);

        labelIkatanKerja = new JLabel("Predikat :");
        labelIkatanKerja.setBounds(0,445, 150, 30);
        labelIkatanKerja.setFont(FONT_DEFAULT_PLAIN);
        add(labelIkatanKerja);
        
    }
    
    private void generateInputForm(){
        
        generateLabel();
        
        fieldNim = new JTextField();
        fieldNim.setBounds(150,5, 200, 30);
        fieldNim.setFont(FONT_DEFAULT_PLAIN);
        add(fieldNim);
        
        fieldNama = new JTextField();
        fieldNama.setBounds(150,45, 200, 30);
        fieldNama.setFont(FONT_DEFAULT_PLAIN);
        add(fieldNama);
        
        fieldEmail = new JTextField();
        fieldEmail.setBounds(150,85, 200, 30);
        fieldEmail.setFont(FONT_DEFAULT_PLAIN);
        add(fieldEmail);
        
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(150,125, 200, 30);
        fieldPassword.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPassword);
        
        propertiesTglLahir = new Properties();
        propertiesTglLahir.put("text.today", "Today");
        propertiesTglLahir.put("text.month", "Month");
        propertiesTglLahir.put("text.year", "Year");
        modelTglLahir = new UtilDateModel();
        datePanelTglLahir = new JDatePanelImpl(modelTglLahir, propertiesTglLahir);
        fieldTanggalLahir = new JDatePickerImpl(datePanelTglLahir, new DateLabelFormatter());
        fieldTanggalLahir.setBounds(150,165, 200, 30);
        add(fieldTanggalLahir);
                
        fieldPria = new JRadioButton("Pria");
        fieldPria.setBounds(150,205, 100, 30);
        fieldPria.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPria);
        
        fieldWanita = new JRadioButton("Wanita");
        fieldWanita.setBounds(250,205, 100, 30);
        fieldWanita.setFont(FONT_DEFAULT_PLAIN);
        add(fieldWanita);
        
        groupJk = new ButtonGroup();
        groupJk.add(fieldPria);
        groupJk.add(fieldWanita);
        
        fieldTelp = new JTextField();
        fieldTelp.setBounds(150,245, 200, 30);
        fieldTelp.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTelp);
        
        fieldJurusan = new JTextField();
        fieldJurusan.setBounds(150,285, 200, 30);
        fieldJurusan.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJurusan);
        
        fieldTahunMasuk = new JTextField();
        fieldTahunMasuk.setBounds(150,325, 50, 30);
        fieldTahunMasuk.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTahunMasuk);
        
        fieldTahunLulus = new JTextField();
        fieldTahunLulus.setBounds(150,365, 50, 30);
        fieldTahunLulus.setFont(FONT_DEFAULT_PLAIN);
        add(fieldTahunLulus);
        
        fieldIpk = new JTextField();
        fieldIpk.setBounds(150,405, 50, 30);
        fieldIpk.setFont(FONT_DEFAULT_PLAIN);
        add(fieldIpk);
        
        fieldPredikat = new JTextField();
        fieldPredikat.setBounds(150,445, 200, 30);
        fieldPredikat.setFont(FONT_DEFAULT_PLAIN);
        add(fieldPredikat);
        
    }
    
    private void generateShowForm(){
        
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
    private void addColon(JLabel label){
        int space = 17;
        String text = label.getText();
        int empty = space - text.length();
        if(empty <= 0){
            return;
        }
        String emptyStr = "";
        for(int i=0; i< empty - 1; i++ ){
            emptyStr += "  ";
        }
        text = text + emptyStr + ":";
        //System.out.println("Size" + empty);
        label.setText(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Mahasiswa : " + action);
        
    }
    
   
   
}
