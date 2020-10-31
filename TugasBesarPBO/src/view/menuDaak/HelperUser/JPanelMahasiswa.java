/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak.HelperUser;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import org.jdatepicker.JDatePicker;
import view.ViewConfig;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelMahasiswa extends JPanel implements ViewConfig {
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
    
    int FIELD_HEIGHT = 10;
    int FIELD_WIDTH = 30;
    JDatePicker fieldTanggal;    

    JPasswordField fieldPassword;
    public JPanelMahasiswa(){
        setLayout(null);
        
        showInputForm();
        
        
        //setBackground(Color.PINK);
    }
    
    private void showInputForm(){
        labelNim = new JLabel("Nim :");
        labelNim.setBounds(0,5, 200, 30);
        labelNim.setFont(FONT_DEFAULT_PLAIN );
        add(labelNim);
        
        
        labelNama = new JLabel("Nama :");
        labelNama.setBounds(0,45, 200, 30);
        labelNama.setFont(FONT_DEFAULT_PLAIN );
        add(labelNama);
        
        labelEmail = new JLabel("Email \t:");
        labelEmail.setBounds(0,85, 200, 30);
        labelEmail.setFont(FONT_DEFAULT_PLAIN);
        add(labelEmail);
        
        labelPassword = new JLabel("Password \t:");
        labelPassword.setBounds(0,125, 200, 30);
        labelPassword.setFont(FONT_DEFAULT_PLAIN);
        add(labelPassword);
        
        labelTanggal = new JLabel("Tanggal Lahir \t:");
        labelTanggal.setBounds(0,165, 200, 30);
        labelTanggal.setFont(FONT_DEFAULT_PLAIN);
        add(labelTanggal);
        
        labelJK = new JLabel("Jenis Kelamin \t:");
        labelJK.setBounds(0,205, 200, 30);
        labelJK.setFont(FONT_DEFAULT_PLAIN);
        add(labelJK);
        
        labelTelp = new JLabel("Nomor Telepon \t:");
        labelTelp.setBounds(0,245, 200, 30);
        labelTelp.setFont(FONT_DEFAULT_PLAIN);
        add(labelTelp);
                
        labelJurusan = new JLabel("Jurusan \t:");
        labelJurusan.setBounds(0,285, 200, 30);
        labelJurusan.setFont(FONT_DEFAULT_PLAIN);
        add(labelJurusan);
        
        labelTahunMasuk = new JLabel("Tahun Masuk \t:");
        labelTahunMasuk.setBounds(0,325, 200, 30);
        labelTahunMasuk.setFont(FONT_DEFAULT_PLAIN);
        add(labelTahunMasuk);
        
        labelTahunLulus = new JLabel("Tahun Lulus");
        labelTahunLulus.setBounds(0,365, 200, 30);
        addColon(labelTahunLulus);
        labelTahunLulus.setFont(FONT_DEFAULT_PLAIN);
        add(labelTahunLulus);
        
        labelIpk = new JLabel("IPK");
        labelIpk.setBounds(0,405, 150, 30);
        addColon(labelIpk);
        labelIpk.setFont(FONT_DEFAULT_PLAIN);
        add(labelIpk);

        labelPredikat = new JLabel("1234567890ABCDEFGHI");
        labelPredikat.setBounds(0,445, 150, 30);
        labelPredikat.setFont(FONT_DEFAULT_PLAIN);
        add(labelPredikat);
        //17 Char / Label
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
    
   
   
}
