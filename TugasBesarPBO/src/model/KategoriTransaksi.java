/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class KategoriTransaksi {
    private int idKategori;
    private String namakategori;
    private int harga;
    private char kategoriSMT;
    private int kategoriAngkatan;
    private int taBerlaku;

    public KategoriTransaksi(int idKategori, String namakategori, int harga, char kategoriSMT, int kategoriAngkatan, int taBerlaku) {
        this.idKategori = idKategori;
        this.namakategori = namakategori;
        this.harga = harga;
        this.kategoriSMT = kategoriSMT;
        this.kategoriAngkatan = kategoriAngkatan;
        this.taBerlaku = taBerlaku;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamakategori() {
        return namakategori;
    }

    public void setNamakategori(String namakategori) {
        this.namakategori = namakategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public char getKategoriSMT() {
        return kategoriSMT;
    }

    public void setKategoriSMT(char kategoriSMT) {
        this.kategoriSMT = kategoriSMT;
    }

    public int getKategoriAngkatan() {
        return kategoriAngkatan;
    }

    public void setKategoriAngkatan(int kategoriAngkatan) {
        this.kategoriAngkatan = kategoriAngkatan;
    }

    public int getTaBerlaku() {
        return taBerlaku;
    }

    public void setTaBerlaku(int taBerlaku) {
        this.taBerlaku = taBerlaku;
    }
    
    
}
