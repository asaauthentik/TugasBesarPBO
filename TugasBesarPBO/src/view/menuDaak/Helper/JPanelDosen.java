/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.Helper;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.user.Dosen;
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
    JTextField fieldProgramStudi;
    JTextField fieldBidangIlmu;
    JTextField fieldGelarAkademik;
    String listIkatanKerja[] = {"","Dosen Tetap", "Dosen Tidak Tetap","Dosen Honorer"};
    JComboBox fieldIkatanKerja;
    String listStatusPegawai[] = {"","PNS", "Bukan-PNS"};
    JComboBox fieldStatusPegawai;
    ButtonGroup grupStatus;
    JRadioButton fieldStatusDosenAktif;
    JRadioButton fieldStatusDosenTidakAktif;
    
    JButton Save;
    JButton Delete;
    
    Dosen data;
    
    public JPanelDosen(String type){
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
        
        labelNid = new JLabel("Nid :");
        labelNid.setBounds(0,5, 120, 30);
        labelNid.setFont(FONT_DEFAULT_PLAIN );
        add(labelNid);
        
        
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
                
        labelProgramStudi = new JLabel("Program Studi :");
        labelProgramStudi.setBounds(0,285, 120, 30);
        labelProgramStudi.setFont(FONT_DEFAULT_PLAIN);
        add(labelProgramStudi);
        
        labelBidangIlmu = new JLabel("Bidang Ilmu :");
        labelBidangIlmu.setBounds(0,325, 120, 30);
        labelBidangIlmu.setFont(FONT_DEFAULT_PLAIN);
        add(labelBidangIlmu);
        
        labelGelarAkademik = new JLabel("Gelar Akademik :");
        labelGelarAkademik.setBounds(0,365, 120, 30);
        labelGelarAkademik.setFont(FONT_DEFAULT_PLAIN);
        add(labelGelarAkademik);
        
        labelStatusPegawai = new JLabel("Status Pegawai :");
        labelStatusPegawai.setBounds(0,405, 120, 30);
        labelStatusPegawai.setFont(FONT_DEFAULT_PLAIN);
        add(labelStatusPegawai);
        
        labelStatusDosen = new JLabel("Status Dosen :");
        labelStatusDosen.setBounds(0,445, 120, 30);
        labelStatusDosen.setFont(FONT_DEFAULT_PLAIN);
        add(labelStatusDosen);
        //
        labelIkatanKerja = new JLabel("Ikatan Kerja :");
        labelIkatanKerja.setBounds(340,5, 120, 30);
        labelIkatanKerja.setFont(FONT_DEFAULT_PLAIN);
        add(labelIkatanKerja);
        
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
        
        fieldProgramStudi = new JTextField();
        fieldProgramStudi.setBounds(120,285, 200, 30);
        fieldProgramStudi.setFont(FONT_DEFAULT_PLAIN);
        add(fieldProgramStudi);
        
        fieldBidangIlmu = new JTextField();
        fieldBidangIlmu.setBounds(120,325, 200, 30);
        fieldBidangIlmu.setFont(FONT_DEFAULT_PLAIN);
        add(fieldBidangIlmu);
        
        fieldGelarAkademik = new JTextField();
        fieldGelarAkademik.setBounds(120,365, 200, 30);
        fieldGelarAkademik.setFont(FONT_DEFAULT_PLAIN);
        add(fieldGelarAkademik);
        
        fieldStatusPegawai = new JComboBox(listStatusPegawai);
        fieldStatusPegawai.setBounds(120,405, 200, 30);
        fieldStatusPegawai.setFont(FONT_DEFAULT_PLAIN);
        add(fieldStatusPegawai);
        
                
        fieldStatusDosenAktif = new JRadioButton("Aktif");
        fieldStatusDosenAktif.setBounds(120,445, 100, 30);
        fieldStatusDosenAktif.setFont(FONT_DEFAULT_PLAIN);
        add(fieldStatusDosenAktif);
        
        fieldStatusDosenTidakAktif = new JRadioButton("Tidak Aktif");
        fieldStatusDosenTidakAktif.setBounds(220,445, 100, 30);
        fieldStatusDosenTidakAktif.setFont(FONT_DEFAULT_PLAIN);
        add(fieldStatusDosenTidakAktif);
        
        grupStatus = new ButtonGroup();
        grupStatus.add(fieldStatusDosenAktif);
        grupStatus.add(fieldStatusDosenTidakAktif);
        
        fieldIkatanKerja = new JComboBox(listIkatanKerja);
        fieldIkatanKerja.setBounds(480,5, 150, 30);
        fieldIkatanKerja.setFont(FONT_DEFAULT_PLAIN);
        add(fieldIkatanKerja);
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
        fieldProgramStudi.setText("Informatika");
        fieldBidangIlmu.setText("Teknik");
        fieldGelarAkademik.setText("M.Tc");
        fieldStatusPegawai.setSelectedIndex(1);
        fieldIkatanKerja.setSelectedIndex(2);
        fieldStatusDosenAktif.setSelected(true);
        
        
        
        
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
        fieldProgramStudi.setEditable(false);
        fieldBidangIlmu.setEditable(false);
        fieldGelarAkademik.setEditable(false);
        fieldStatusPegawai.setEditable(false);
        Save.setVisible(false);
        fieldStatusPegawai.setEnabled(false);
        fieldIkatanKerja.setEnabled(false);
        fieldStatusDosenAktif.setEnabled(false);
        fieldStatusDosenTidakAktif.setEnabled(false);
        
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println("Action Panel Helper Dosen : " + action);
        if(action.equals("Simpan")){
            if(data != null){
                //data = new dosen();
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
            String programstudi =fieldProgramStudi.getText();
            String bidangIlmu = fieldBidangIlmu.getText();
            String gelarAkademik = fieldGelarAkademik.getText();
            String statusPegawai = (String) fieldStatusPegawai.getItemAt(fieldStatusPegawai.getSelectedIndex()) ;
            String statusIkatanKerja = (String) fieldIkatanKerja.getItemAt(fieldIkatanKerja.getSelectedIndex()) ;
            String statusDosen = "";
            if(fieldStatusDosenAktif.isSelected()){
                statusDosen = "Aktif";
            }else if(fieldStatusDosenTidakAktif.isSelected()){
                statusDosen = "Tidak Aktif";
            }
            
            System.out.println("Nid : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("Email : " + email);
            System.out.println("Password : " + password);
            System.out.println("Tanggal Lahir : " + tanggalLahir);
            System.out.println("JK : " + jk);
            System.out.println("Telepon : " + telepon);
            System.out.println("Program Studi : " + programstudi);
            System.out.println("Bidang Ilmu : " + bidangIlmu);
            System.out.println("Gelar Akademik : " + gelarAkademik);
            System.out.println("Status Pegawai : " + statusPegawai);
            System.out.println("Ikatan Pekerjaan : " + statusIkatanKerja);
            System.out.println("Status Dosen : " + statusDosen);
            
            //To Sql Controller !
        }else if(action.equals("Hapus")){
            System.out.println("Menggunakan controller unttuk delete");
        }
        
    }
        
}
