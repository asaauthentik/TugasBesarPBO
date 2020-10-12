/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author S W I F T 3
 */
public class Transaksi {
    int idtransaksi;
    String tgltransaksi;
    int jmlbayar;
    int ta;
    char smt;
    // out class
    Mahasiswa mhs;
    RencanaStudi rsm;
    KategoriTransaksi ktgTsk[];    
}
class KategoriTransaksi{
    int idKategori;
    String namakategori;
    int harga;
    char kategoriSMT;
    int kategoriAngkatan;
    int taBerlaku;
}
