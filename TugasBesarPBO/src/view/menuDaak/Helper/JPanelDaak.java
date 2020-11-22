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
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.matakuliah.DetailMatakuliah;
import model.user.Daak;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import view.ViewConfig;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.COLOR_WHITE;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelDaak extends JPanel implements ActionListener, ViewConfig {
 
    private  JLabel labelNik;
    private  JLabel labelNama;
    private  JLabel labelEmail;
    private  JLabel labelPassword;
    private  JLabel labelTanggal;
    private  JLabel labelJK;
    private  JLabel labelTelp;
    private  JLabel labelJabatan;
    private  JLabel labelHakAksesRencanaStudi;
    private  JLabel labelHakAksesMatakuliah;
    private  JLabel labelHakAksesKeuangan;
    private  JLabel labelHakAksesJadwalPerkuliahan;
    private  JLabel labelHakAksesUser;
    private  JLabel labelStatusKontrak;
    
    
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
    JTextField fieldJabatan;
    
    ButtonGroup groupHARencanaStudi;
    JRadioButton fieldHARencanaStudiYes;
    JRadioButton fieldHARencanaStudiNo;
    
    ButtonGroup groupHAMatakuliah;
    JRadioButton fieldHAMatakuliahYes;
    JRadioButton fieldHAMatakuliahNo;
    
    ButtonGroup groupHAKeuangan;
    JRadioButton fieldHAKeuanganYes;
    JRadioButton fieldHAKeuanganNo;
    
    ButtonGroup groupHAJadwalPerkuliahan;
    JRadioButton fieldHAJadwalPerkuliahanYes;
    JRadioButton fieldHAJadwalPerkuliahanNo;
    
    ButtonGroup groupHAUser;
    JRadioButton fieldHAUserYes;
    JRadioButton fieldHAUserNo;
    
    ButtonGroup groupStatusKontrak;
    JRadioButton fieldStatusKontrakAktif;
    JRadioButton fieldStatusKontrakNonAktif;
    
    JButton Save;
    JButton Delete;
    
    Daak data;
    
    public JPanelDaak(String type){
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
        
        labelNik = new JLabel("Nik :");
        labelNik.setBounds(0,5, 120, 30);
        labelNik.setFont(FONT_DEFAULT_PLAIN );
        add(labelNik);
        
        
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
                
        labelJabatan = new JLabel("Jabatan :");
        labelJabatan.setBounds(0,285, 120, 30);
        labelJabatan.setFont(FONT_DEFAULT_PLAIN);
        add(labelJabatan);
        
        labelHakAksesRencanaStudi = new JLabel("A. Rencana Studi :");
        labelHakAksesRencanaStudi.setBounds(0,325, 120, 30);
        labelHakAksesRencanaStudi.setFont(FONT_DEFAULT_PLAIN);
        add(labelHakAksesRencanaStudi);
        
        labelHakAksesMatakuliah = new JLabel("A. Matakuliah :");
        labelHakAksesMatakuliah.setBounds(0,365, 120, 30);
        labelHakAksesMatakuliah.setFont(FONT_DEFAULT_PLAIN);
        add(labelHakAksesMatakuliah);
        
        labelHakAksesKeuangan = new JLabel("A. Keuangan :");
        labelHakAksesKeuangan.setBounds(0,405, 120, 30);
        labelHakAksesKeuangan.setFont(FONT_DEFAULT_PLAIN);
        add(labelHakAksesKeuangan);
        
        labelHakAksesUser = new JLabel("A. User :");
        labelHakAksesUser.setBounds(0,445, 120, 30);
        labelHakAksesUser.setFont(FONT_DEFAULT_PLAIN);
        add(labelHakAksesUser);
        
        labelHakAksesJadwalPerkuliahan = new JLabel("A. Jadwal Kuliah :");
        labelHakAksesJadwalPerkuliahan.setBounds(340,5, 120, 30);
        labelHakAksesJadwalPerkuliahan.setFont(FONT_DEFAULT_PLAIN);
        add(labelHakAksesJadwalPerkuliahan);
        
        
        labelStatusKontrak = new JLabel("Status Kontrak :");
        labelStatusKontrak.setBounds(340,45, 120, 30);
        labelStatusKontrak.setFont(FONT_DEFAULT_PLAIN);
        add(labelStatusKontrak);
        
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
        
        fieldJabatan = new JTextField();
        fieldJabatan.setBounds(120,285, 200, 30);
        fieldJabatan.setFont(FONT_DEFAULT_PLAIN);
        add(fieldJabatan);
        
        // --
        fieldHARencanaStudiYes = new JRadioButton("Boleh");
        fieldHARencanaStudiYes.setBounds(120,325, 100, 30);
        fieldHARencanaStudiYes.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHARencanaStudiYes);
        
        fieldHARencanaStudiNo = new JRadioButton("Tidak Boleh");
        fieldHARencanaStudiNo.setBounds(220,325, 100, 30);
        fieldHARencanaStudiNo.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHARencanaStudiNo);
        
        groupHARencanaStudi = new ButtonGroup();
        groupHARencanaStudi.add(fieldHARencanaStudiYes);
        groupHARencanaStudi.add(fieldHARencanaStudiNo);
        
        fieldHAMatakuliahYes = new JRadioButton("Boleh");
        fieldHAMatakuliahYes.setBounds(120,365, 100, 30);
        fieldHAMatakuliahYes.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAMatakuliahYes);
        
        fieldHAMatakuliahNo = new JRadioButton("Tidak Boleh");
        fieldHAMatakuliahNo.setBounds(220,365, 100, 30);
        fieldHAMatakuliahNo.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAMatakuliahNo);
        
        groupHAMatakuliah = new ButtonGroup();
        groupHAMatakuliah.add(fieldHAMatakuliahYes);
        groupHAMatakuliah.add(fieldHAMatakuliahNo);
        
        fieldHAKeuanganYes = new JRadioButton("Boleh");
        fieldHAKeuanganYes.setBounds(120,405, 100, 30);
        fieldHAKeuanganYes.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAKeuanganYes);
        
        fieldHAKeuanganNo = new JRadioButton("Tidak Boleh");
        fieldHAKeuanganNo.setBounds(220,405, 100, 30);
        fieldHAKeuanganNo.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAKeuanganNo);
        
        groupHAKeuangan = new ButtonGroup();
        groupHAKeuangan.add(fieldHAKeuanganYes);
        groupHAKeuangan.add(fieldHAKeuanganNo);
        
        
        fieldHAUserYes = new JRadioButton("Boleh");
        fieldHAUserYes.setBounds(120,445, 100, 30);
        fieldHAUserYes.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAUserYes);
        
        fieldHAUserNo = new JRadioButton("Tidak Boleh");
        fieldHAUserNo.setBounds(220,445, 100, 30);
        fieldHAUserNo.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAUserNo);
        
        groupHAUser = new ButtonGroup();
        groupHAUser.add(fieldHAUserYes);
        groupHAUser.add(fieldHAUserNo);
 
        
        fieldHAJadwalPerkuliahanYes = new JRadioButton("Boleh");
        fieldHAJadwalPerkuliahanYes.setBounds(455,5, 75, 30);
        fieldHAJadwalPerkuliahanYes.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAJadwalPerkuliahanYes);
        
        fieldHAJadwalPerkuliahanNo = new JRadioButton("Tidak Boleh");
        fieldHAJadwalPerkuliahanNo.setBounds(535,5, 100, 30);
        fieldHAJadwalPerkuliahanNo.setFont(FONT_DEFAULT_PLAIN);
        add(fieldHAJadwalPerkuliahanNo);
        
        groupHAJadwalPerkuliahan = new ButtonGroup();
        groupHAJadwalPerkuliahan.add(fieldHAJadwalPerkuliahanYes);
        groupHAJadwalPerkuliahan.add(fieldHAJadwalPerkuliahanNo);
        
        fieldStatusKontrakAktif = new JRadioButton("Aktif");
        fieldStatusKontrakAktif.setBounds(455,45, 75, 30);
        fieldStatusKontrakAktif.setFont(FONT_DEFAULT_PLAIN);
        add(fieldStatusKontrakAktif);
        
        fieldStatusKontrakNonAktif = new JRadioButton("Tidak Aktif");
        fieldStatusKontrakNonAktif.setBounds(535,45, 100, 30);
        fieldStatusKontrakNonAktif.setFont(FONT_DEFAULT_PLAIN);
        add(fieldStatusKontrakNonAktif);
        
        groupStatusKontrak = new ButtonGroup();
        groupStatusKontrak.add(fieldStatusKontrakAktif);
        groupStatusKontrak.add(fieldStatusKontrakNonAktif);
               
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
        fieldJabatan.setText("Informatika");
                
        if(true){
           fieldHARencanaStudiYes.setSelected(true);
        }else{
           fieldHARencanaStudiNo.setSelected(true); 
        }
        
        if(false){
           fieldHAMatakuliahYes.setSelected(true);
        }else{
           fieldHAMatakuliahNo.setSelected(true); 
        }
        
        if(true){
           fieldHAKeuanganYes.setSelected(true);
        }else{
           fieldHAKeuanganNo.setSelected(true); 
        }
        
        if(false){
           fieldHAUserYes.setSelected(true);
        }else{
           fieldHAUserNo.setSelected(true); 
        }
        
        if(true){
           fieldHAJadwalPerkuliahanYes.setSelected(true);
        }else{
           fieldHAJadwalPerkuliahanNo.setSelected(true); 
        }
        
        if(false){
           fieldStatusKontrakAktif.setSelected(true);
        }else{
           fieldStatusKontrakNonAktif.setSelected(true); 
        }
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
        fieldJabatan.setEditable(false);

        fieldHARencanaStudiYes.setEnabled(false);
        fieldHARencanaStudiNo.setEnabled(false);
        fieldHAMatakuliahYes.setEnabled(false);
        fieldHAMatakuliahNo.setEnabled(false);
        fieldHAKeuanganYes.setEnabled(false);
        fieldHAKeuanganNo.setEnabled(false);
        fieldHAUserYes.setEnabled(false);
        fieldHAUserNo.setEnabled(false);
        fieldHAJadwalPerkuliahanYes.setEnabled(false);
        fieldHAJadwalPerkuliahanNo.setEnabled(false);
        fieldStatusKontrakAktif.setEnabled(false);
        fieldStatusKontrakNonAktif.setEnabled(false);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Dosen : " + action);
        if(action.equals("Simpan")){
            if(data != null){
                //data = new Daak();
            }
            String nik = fieldNim.getText();
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
            String jabatan =fieldJabatan.getText();
            
            boolean HARencanaStudi = false;
            if(fieldHARencanaStudiYes.isSelected()){
                HARencanaStudi = true;
            }
            
            boolean HAMatakuliah = false;
            if(fieldHAMatakuliahYes.isSelected()){
                HAMatakuliah = true;
            }
            
            boolean HAKeuangan = false;
            if(fieldHAKeuanganYes.isSelected()){
                HAKeuangan = true;
            }
            
            boolean HAUser = false;
            if(fieldHAUserYes.isSelected()){
                HAUser = true;
            }
            
            boolean HAJadwalPerkuliahan = false;
            if(fieldHAJadwalPerkuliahanYes.isSelected()){
                HAJadwalPerkuliahan = true;
            }
            
            boolean statusKontrak = false;
            if(fieldStatusKontrakAktif.isSelected()){
                statusKontrak = true;
            }
            System.out.println("Nik : " + nik);
            System.out.println("Nama : " + nama);
            System.out.println("Email : " + email);
            System.out.println("Password : " + password);
            System.out.println("Tanggal Lahir : " + tanggalLahir);
            System.out.println("JK : " + jk);
            System.out.println("Telepon : " + telepon);
            System.out.println("Program Studi : " + jabatan);
            System.out.println("A Rencana Studi : " + HARencanaStudi);
            System.out.println("A Matakuliah : " + HAMatakuliah);
            System.out.println("A Keuangan : " + HAKeuangan);
            System.out.println("A User : " + HAUser);
            System.out.println("A Jadwal Kuliah : " + HAJadwalPerkuliahan);
            System.out.println("A StatusKontrak : " + statusKontrak);
            
            Daak newDaak = new Daak(nik, jabatan, HAKeuangan,HARencanaStudi,HAMatakuliah, HAUser,  HAJadwalPerkuliahan, statusKontrak, "", nama, email, password, tanggalLahir, jk , telepon);
            //To Sql Controller !
        }else if(action.equals("Hapus")){
            System.out.println("Menggunakan controller unttuk delete");
        }
        
    }
        
}
