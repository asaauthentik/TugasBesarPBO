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
import javax.swing.*;
import static view.ViewConfig.*;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119038 Elangel Neilea Shaday
 */
public class JPanelProfile extends JPanel{
    private final JPanel Header;
    private final JLabel Judul;
    private final JLabel NIM, Nama, Jurusan, Angkatan, TanggalLahir, JenisKelamin, NomorHP, Email, Alamat, IPK, Predikat;
    private final JLabel ViewNIM, ViewNama, ViewJurusan, ViewAngkatan, ViewTanggalLahir, ViewJenisKelamin, ViewNomorHP, ViewEmail, ViewAlamat, ViewIPK, ViewPredikat;
    private final JButton Keluar;
    public JPanelProfile(){
        Header = new JPanel();
        Header.setBackground(Color.DARK_GRAY);
        Header.setBounds(0,20,600,50);
        Judul = new JLabel("INSTITUTE TEKNOLOGI HARAPAN BANGSA");
        Judul.setForeground(Color.WHITE);
        Judul.setFont(FONT_TITLE);
        Header.add(Judul);
        add(Header);
        setLayout(null);
        //Foto
        String pathFileFoto = "C:\\Users\\Rog\\Pictures\\Foto\\Elangel.jpg";
        JLabel ViewFoto;
        ImageIcon pathFoto = new ImageIcon(pathFileFoto);
        Image pathPictureFoto = pathFoto.getImage();
        Image newPicture1 = pathPictureFoto.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(newPicture1);
        ViewFoto = new JLabel(image1);
        ViewFoto.setBounds(20,100,270,300);
        add(ViewFoto);
        //NIM
        NIM = new JLabel("NIM");
        NIM.setBounds(320,50,100,100);
        add(NIM);
        ViewNIM = new JLabel(": 1119038");
        ViewNIM.setBounds(420,50,100,100);
        add(ViewNIM);
        //Nama
        Nama = new JLabel("Nama");
        Nama.setBounds(320,80,100,100);
        add(Nama);
        ViewNama = new JLabel(": Elangel");
        ViewNama.setBounds(420,80,100,100);
        add(ViewNama);
        //Jurusan
        Jurusan = new JLabel("Jurusan");
        Jurusan.setBounds(320,110,100,100);
        add(Jurusan);
        ViewJurusan = new JLabel(": Informatika");
        ViewJurusan.setBounds(420,110,100,100);
        add(ViewJurusan);
        //Angkatan
        Angkatan = new JLabel("Angkatan");
        Angkatan.setBounds(320,140,100,100);
        add(Angkatan);
        ViewAngkatan = new JLabel(": 2019");
        ViewAngkatan.setBounds(420,140,100,100);
        add(ViewAngkatan);
        //Tanggal Lahir
        TanggalLahir = new JLabel("Tanggal Lahir");
        TanggalLahir.setBounds(320,170,100,100);
        add(TanggalLahir);
        ViewTanggalLahir = new JLabel(": 17 Agustus 2001");
        ViewTanggalLahir.setBounds(420,170,100,100);
        add(ViewTanggalLahir);
        //Jenis Kelamin
        JenisKelamin = new JLabel("Jenis Kelamin");
        JenisKelamin.setBounds(320,200,100,100);
        add(JenisKelamin);
        ViewJenisKelamin = new JLabel(": Perempuan");
        ViewJenisKelamin.setBounds(420,200,100,100);
        add(ViewJenisKelamin);
        //Nomor HP
        NomorHP = new JLabel("Nomor HP");
        NomorHP.setBounds(320,230,100,100);
        add(NomorHP);
        ViewNomorHP = new JLabel(": 08123456789");
        ViewNomorHP.setBounds(420,230,100,100);
        add(ViewNomorHP);
        //Email
        Email = new JLabel("Email");
        Email.setBounds(320,260,100,100);
        add(Email);
        ViewEmail = new JLabel(": elangel@gmail.com");
        ViewEmail.setBounds(420,260,200,100);
        add(ViewEmail);
        //Alamat 
        Alamat = new JLabel("Alamat");
        Alamat.setBounds(320,290,100,100);
        add(Alamat);
        ViewAlamat = new JLabel(": Bandung");
        ViewAlamat.setBounds(420,290,100,100);
        add(ViewAlamat);
        //IPK
        IPK = new JLabel("IPK");
        IPK.setBounds(320,320,100,100);
        add(IPK);
        ViewIPK= new JLabel(": 4.00");
        ViewIPK.setBounds(420,320,100,100);
        add(ViewIPK);
        //Predikat
        Predikat = new JLabel("Predikat");
        Predikat.setBounds(320,350,100,100);
        add(Predikat);
        ViewPredikat = new JLabel(": Cumlaude");
        ViewPredikat.setBounds(420,350,100,100);
        add(ViewPredikat);
        //Button keluar
        Keluar = new JButton("Keluar");
        Keluar.setBounds(30,440,500,30);
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
        return new Dimension(568, 520);
    }
}
