/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDosen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import view.ViewConfig;


/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 */
public class JPanelProfile extends JPanel implements ViewConfig{
    private final JPanel Header;
    private final JLabel Judul;
    private JLabel NID, Nama, JenisKelamin, TanggalLahir, Alamat, Email, BidangIlmu, ProgramStudi, GelarAkademik, StatusPegawai, StatusDosen;
    private JLabel ViewNID, ViewNama, ViewJenisKelamin, ViewTanggalLahir, ViewAlamat, ViewEmail, ViewBidangIlmu, ViewProgramStudi, ViewGelarAkademik, ViewStatusPegawai, ViewStatusDosen;
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
        String pathFileFoto = "C:\\Users\\Rog\\Pictures\\Foto\\Elangel.jpg";
        JLabel ViewFoto;
        ImageIcon pathFoto = new ImageIcon(pathFileFoto);
        Image pathPictureFoto = pathFoto.getImage();
        Image newPicture1 = pathPictureFoto.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(newPicture1);
        ViewFoto = new JLabel(image1);
        ViewFoto.setBounds(20,100,270,300);
        add(ViewFoto);
        //NID
        NID = new JLabel("NID");
        NID.setBounds(320,50,100,100);
        add(NID);
        ViewNID = new JLabel(": 00023");
        ViewNID.setBounds(420,50,200,100);
        add(ViewNID);
        //Nama
        Nama = new JLabel("Nama");
        Nama.setBounds(320,80,100,100);
        add(Nama);
        ViewNama = new JLabel(": Michael Wijaya Kusuma");
        ViewNama.setBounds(420,80,200,100);
        add(ViewNama);
        //Jenis Kelamin
        JenisKelamin = new JLabel("Jenis Kelamin");
        JenisKelamin.setBounds(320,110,100,100);
        add(JenisKelamin);
        JenisKelamin = new JLabel(": Laki-Laki");
        JenisKelamin.setBounds(420,110,100,100);
        add(JenisKelamin);
        //Tanggal Lahir
        TanggalLahir = new JLabel("Tanggal Lahir");
        TanggalLahir.setBounds(320,140,100,100);
        add(TanggalLahir);
        TanggalLahir = new JLabel(": 10 Juni 1988");
        TanggalLahir.setBounds(420,140,100,100);
        add(TanggalLahir);
        //Alamat
        Alamat = new JLabel("Alamat");
        Alamat.setBounds(320,170,100,100);
        add(Alamat);
        ViewAlamat = new JLabel(": Jalan Manuk No.112");
        ViewAlamat.setBounds(420,170,200,100);
        add(ViewAlamat);
        //E-Mail
        Email = new JLabel("E-Mail");
        Email.setBounds(320,200,100,100);
        add(Email);
        ViewEmail = new JLabel(": michaelwij10@gmail.com");
        ViewEmail.setBounds(420,200,200,100);
        add(ViewEmail);
        //Bidang Ilmu
        BidangIlmu = new JLabel("Bidang Ilmu");
        BidangIlmu.setBounds(320,230,100,100);
        add(BidangIlmu);
        BidangIlmu = new JLabel(": Teknik");
        BidangIlmu.setBounds(420,230,100,100);
        add(BidangIlmu);
        //Program Studi
        ProgramStudi = new JLabel("Program Studi");
        ProgramStudi.setBounds(320,260,100,100);
        add(ProgramStudi);
        ViewProgramStudi = new JLabel(": Teknik Informatika");
        ViewProgramStudi.setBounds(420,260,200,100);
        add(ViewProgramStudi);
        //Gelar Akademik
        GelarAkademik = new JLabel("Gelar Akademik");
        GelarAkademik.setBounds(320,290,100,100);
        add(GelarAkademik);
        ViewGelarAkademik = new JLabel(": Magister Komp");
        ViewGelarAkademik.setBounds(420,290,100,100);
        add(ViewGelarAkademik);
        //Status Pegawai
        StatusPegawai = new JLabel("Status Pegawai");
        StatusPegawai.setBounds(320,320,100,100);
        add(StatusPegawai);
        ViewStatusPegawai= new JLabel(": Dosen Tetap");
        ViewStatusPegawai.setBounds(420,320,100,100);
        add(ViewStatusPegawai);
        //Status Dosen
        StatusDosen = new JLabel("Status Dosen");
        StatusDosen.setBounds(320,350,100,100);
        add(StatusDosen);
        ViewStatusDosen = new JLabel(": Aktif");
        ViewStatusDosen.setBounds(420,350,100,100);
        add(ViewStatusDosen);
    }
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }
}
