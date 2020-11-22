/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuDaak;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import view.ViewConfig;
import static view.ViewConfig.BGCOLOR_DEFAULT;
import static view.ViewConfig.COLOR_WHITE;
import static view.ViewConfig.DIMENSION_PANEL_CARD;
import static view.ViewConfig.FONT_DEFAULT_PLAIN;
import static view.ViewConfig.FONT_TITLE;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class JPanelProfile extends JPanel implements ActionListener, ViewConfig{
    private final JPanel Header;
    private final JLabel Judul;
    private final JLabel NIK, Nama, Jabatan, StatusKontrak, TanggalLahir, JenisKelamin, NomorHP, Email, HAKeuangan, HAKemahasiswaan, HAPerkuliahaan;
    private final JLabel ViewNIK, ViewNama, ViewJabatan, ViewStatusKontrak, ViewTanggalLahir, ViewJenisKelamin, ViewNomorHP, ViewEmail, ViewHAKeuangan, ViewHAKemahasiswaan, ViewHAPerkuliahaan;
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
        String pathFileFoto = "C:\\Users\\Rog\\Pictures\\Foto\\Elangel.jpg";
        JLabel ViewFoto;
        ImageIcon pathFoto = new ImageIcon(pathFileFoto);
        Image pathPictureFoto = pathFoto.getImage();
        Image newPicture1 = pathPictureFoto.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(newPicture1);
        ViewFoto = new JLabel(image1);
        ViewFoto.setBounds(50,100,270,300);
        add(ViewFoto);
        //NIM
        NIK = new JLabel("NIK");
        NIK.setBounds(370,80,170,100);
        add(NIK);
        ViewNIK = new JLabel(": 1119038");
        ViewNIK.setBounds(540,80,200,100);
        add(ViewNIK);
        //Nama
        Nama = new JLabel("Nama");
        Nama.setBounds(370,110,170,100);
        add(Nama);
        ViewNama = new JLabel(": Albert");
        ViewNama.setBounds(540,110,200,100);
        add(ViewNama);
        //Jurusan
        Jabatan = new JLabel("Jabatan");
        Jabatan.setBounds(370,140,170,100);
        add(Jabatan);
        ViewJabatan = new JLabel(": Administrasi");
        ViewJabatan.setBounds(540,140,200,100);
        add(ViewJabatan);
        //Angkatan
        StatusKontrak = new JLabel("Status Kontrak");
        StatusKontrak.setBounds(370,170,170,100);
        add(StatusKontrak);
        ViewStatusKontrak = new JLabel(": Aktif");
        ViewStatusKontrak.setBounds(540,170,200,100);
        add(ViewStatusKontrak);
        //Tanggal Lahir
        TanggalLahir = new JLabel("Tanggal Lahir");
        TanggalLahir.setBounds(370,200,170,100);
        add(TanggalLahir);
        ViewTanggalLahir = new JLabel(": 17 September 2001");
        ViewTanggalLahir.setBounds(540,200,200,100);
        add(ViewTanggalLahir);
        //Jenis Kelamin
        JenisKelamin = new JLabel("Jenis Kelamin");
        JenisKelamin.setBounds(370,230,170,100);
        add(JenisKelamin);
        ViewJenisKelamin = new JLabel(": Pria");
        ViewJenisKelamin.setBounds(540,230,200,100);
        add(ViewJenisKelamin);
        //Nomor HP
        NomorHP = new JLabel("Nomor HP");
        NomorHP.setBounds(370,260,170,100);
        add(NomorHP);
        ViewNomorHP = new JLabel(": 08123456789");
        ViewNomorHP.setBounds(540,260,200,100);
        add(ViewNomorHP);
        //Email
        Email = new JLabel("Email");
        Email.setBounds(370,290,170,100);
        add(Email);
        ViewEmail = new JLabel(": albert@gmail.com");
        ViewEmail.setBounds(540,290,200,100);
        add(ViewEmail);
        //Alamat 
        HAKeuangan = new JLabel("Hak Akses Keuangan");
        HAKeuangan.setBounds(370,320,170,100);
        add(HAKeuangan);
        ViewHAKeuangan = new JLabel(": Boleh");
        ViewHAKeuangan.setBounds(540,320,200,100);
        add(ViewHAKeuangan);
        
        HAKemahasiswaan = new JLabel("Hak Akses Kemahasiswaan");
        HAKemahasiswaan.setBounds(370,350,170,100);
        add(HAKemahasiswaan);
        ViewHAKemahasiswaan = new JLabel(": Boleh");
        ViewHAKemahasiswaan.setBounds(540,350,200,100);
        add(ViewHAKemahasiswaan);
        
        HAPerkuliahaan = new JLabel("Hak Akses Perkuliahaan");
        HAPerkuliahaan.setBounds(370,380,170,100);
        add(HAPerkuliahaan);
        ViewHAPerkuliahaan = new JLabel(": Boleh");
        ViewHAPerkuliahaan.setBounds(540,380,200,100);
        add(ViewHAPerkuliahaan);
        
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
    
    
    @Override
    public Dimension getPreferredSize() {
        return DIMENSION_PANEL_CARD;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
