/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 */
public class Transaksi {
    private int idtransaksi;
    private String tgltransaksi;
    private int jmlbayar;
    private int ta;
    private char smt;
    private Mahasiswa mhs;
    private RencanaStudi rsm;
    public ArrayList <KategoriTransaksi> ktgTsk;    

    public Transaksi(int idtransaksi, String tgltransaksi, int jmlbayar, int ta, char smt, Mahasiswa mhs, RencanaStudi rsm, ArrayList<KategoriTransaksi> ktgTsk) {
        this.idtransaksi = idtransaksi;
        this.tgltransaksi = tgltransaksi;
        this.jmlbayar = jmlbayar;
        this.ta = ta;
        this.smt = smt;
        this.mhs = mhs;
        this.rsm = rsm;
        this.ktgTsk = ktgTsk;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getTgltransaksi() {
        return tgltransaksi;
    }

    public void setTgltransaksi(String tgltransaksi) {
        this.tgltransaksi = tgltransaksi;
    }

    public int getJmlbayar() {
        return jmlbayar;
    }

    public void setJmlbayar(int jmlbayar) {
        this.jmlbayar = jmlbayar;
    }

    public int getTa() {
        return ta;
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public char getSmt() {
        return smt;
    }

    public void setSmt(char smt) {
        this.smt = smt;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public RencanaStudi getRsm() {
        return rsm;
    }

    public void setRsm(RencanaStudi rsm) {
        this.rsm = rsm;
    }

}
