/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuMahasiswa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import view.ViewConfig;
import static view.ViewConfig.*;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelProfile extends JPanel implements ViewConfig{
    private final JPanel Header, IPKPanel, PredikatPanel, ViewIPKPanel, ViewPredikatPanel;
    private final JLabel Judul;
    private final JLabel NIM, Nama, Jurusan, Angkatan, TanggalLahir, JenisKelamin, NomorHP, Email, Alamat, IPK, Predikat;
    private final JLabel ViewNIM, ViewNama, ViewJurusan, ViewAngkatan, ViewTanggalLahir, ViewJenisKelamin, ViewNomorHP, ViewEmail, ViewAlamat, ViewIPK, ViewPredikat;
    private final JButton Keluar;
    public JPanelProfile(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,700,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
        //Foto
        //String pathFileFoto = "C:\\Users\\Rog\\Pictures\\Foto\\Elangel.jpg";
        JLabel ViewFoto;
        Image img = null;
        try {
            img = ImageIO.read(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBVtrw01AM9oJidFPKQbmigHhqll_3ScuACg&usqp=CAU"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(JPanelProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JPanelProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image newPicture1 = img.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(newPicture1);
        ViewFoto = new JLabel(image1);
        ViewFoto.setBounds(50,100,270,300);
        add(ViewFoto);
        //NIM
        NIM = new JLabel("NIM");
        NIM.setBounds(370,80,100,100);
        add(NIM);
        ViewNIM = new JLabel(": 1119038");
        ViewNIM.setBounds(470,80,100,100);
        add(ViewNIM);
        //Nama
        Nama = new JLabel("Nama");
        Nama.setBounds(370,110,100,100);
        add(Nama);
        ViewNama = new JLabel(": Elangel");
        ViewNama.setBounds(470,110,100,100);
        add(ViewNama);
        //Jurusan
        Jurusan = new JLabel("Jurusan");
        Jurusan.setBounds(370,140,100,100);
        add(Jurusan);
        ViewJurusan = new JLabel(": Informatika");
        ViewJurusan.setBounds(470,140,100,100);
        add(ViewJurusan);
        //Angkatan
        Angkatan = new JLabel("Angkatan");
        Angkatan.setBounds(370,170,100,100);
        add(Angkatan);
        ViewAngkatan = new JLabel(": 2019");
        ViewAngkatan.setBounds(470,170,100,100);
        add(ViewAngkatan);
        //Tanggal Lahir
        TanggalLahir = new JLabel("Tanggal Lahir");
        TanggalLahir.setBounds(370,200,100,100);
        add(TanggalLahir);
        ViewTanggalLahir = new JLabel(": 17 Agustus 2001");
        ViewTanggalLahir.setBounds(470,200,100,100);
        add(ViewTanggalLahir);
        //Jenis Kelamin
        JenisKelamin = new JLabel("Jenis Kelamin");
        JenisKelamin.setBounds(370,230,100,100);
        add(JenisKelamin);
        ViewJenisKelamin = new JLabel(": Perempuan");
        ViewJenisKelamin.setBounds(470,230,100,100);
        add(ViewJenisKelamin);
        //Nomor HP
        NomorHP = new JLabel("Nomor HP");
        NomorHP.setBounds(370,260,100,100);
        add(NomorHP);
        ViewNomorHP = new JLabel(": 08123456789");
        ViewNomorHP.setBounds(470,260,100,100);
        add(ViewNomorHP);
        //Email
        Email = new JLabel("Email");
        Email.setBounds(370,290,100,100);
        add(Email);
        ViewEmail = new JLabel(": elangel@gmail.com");
        ViewEmail.setBounds(470,290,200,100);
        add(ViewEmail);
        //Alamat 
        Alamat = new JLabel("Alamat");
        Alamat.setBounds(370,320,100,100);
        add(Alamat);
        ViewAlamat = new JLabel(": Bandung");
        ViewAlamat.setBounds(470,320,100,100);
        add(ViewAlamat);
        
        IPKPanel = new JPanel();
        IPKPanel.setBounds(50,450,100,40);
        IPKPanel.setBackground(BGCOLOR_DEFAULT);
        IPK = new JLabel("IPK");
        IPK.setBounds(0,320,100,100);
        IPK.setForeground(COLOR_WHITE);
        IPK.setFont(FONT_TITLE);
        IPKPanel.add(IPK);
        add(IPKPanel);
        
        ViewIPKPanel = new JPanel();
        ViewIPKPanel.setBounds(150,450,100,40);
        ViewIPKPanel.setBackground(Color.LIGHT_GRAY);
        ViewIPK= new JLabel("4.00");
        ViewIPK.setBounds(0,320,100,100);
        ViewIPK.setFont(FONT_TITLE);
        ViewIPKPanel.add(ViewIPK);
        add(ViewIPKPanel);
        
        PredikatPanel = new JPanel();
        PredikatPanel.setBounds(250,450,190,40);
        PredikatPanel.setBackground(BGCOLOR_DEFAULT);
        Predikat = new JLabel("Predikat");
        Predikat.setBounds(370,350,100,100);
        Predikat.setForeground(COLOR_WHITE);
        Predikat.setFont(FONT_TITLE);
        PredikatPanel.add(Predikat);
        add(PredikatPanel);
        
        ViewPredikatPanel = new JPanel();
        ViewPredikatPanel.setBounds(440,450,180,40);
        ViewPredikatPanel.setBackground(Color.LIGHT_GRAY);
        ViewPredikat = new JLabel("Cumlaude");
        ViewPredikat.setBounds(0,350,100,100);
        ViewPredikat.setFont(FONT_TITLE);
        ViewPredikatPanel.add(ViewPredikat);
        add(ViewPredikatPanel);
        
        //Button keluar
        Keluar = new JButton("Keluar");
        Keluar.setBounds(50,530,570,40);
        Keluar.setContentAreaFilled(true);
        Keluar.setBackground(Color.WHITE);
        Keluar.setForeground(BGCOLOR_DEFAULT);
        Keluar.setBorder(javax.swing.BorderFactory.createLineBorder(BGCOLOR_DEFAULT));
        Keluar.setFocusPainted(false);
        Keluar.setFont(FONT_DEFAULT_PLAIN);
        //Keluar.addActionListner(new CloseListener());
        add(Keluar);
    }
    private class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.exit(0);
        }
    }
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
