/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday test
 * @author 1119038 Elangel Neilea Shaday
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
