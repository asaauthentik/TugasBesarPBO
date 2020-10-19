/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 */
public class Transaksi {
    private int idtransaksi;
    private String tanggalTransaksi;
    private int jumlahBayar;
    private char semeterDiambil;
    private int tahunSemester;

    public Transaksi(int idtransaksi, String tanggalTransaksi, int jumlahBayar, char semeterDiambil, int tahunSemester) {
        this.idtransaksi = idtransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.jumlahBayar = jumlahBayar;
        this.semeterDiambil = semeterDiambil;
        this.tahunSemester = tahunSemester;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public int getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(int jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public char getSemeterDiambil() {
        return semeterDiambil;
    }

    public void setSemeterDiambil(char semeterDiambil) {
        this.semeterDiambil = semeterDiambil;
    }

    public int getTahunSemester() {
        return tahunSemester;
    }

    public void setTahunSemester(int tahunSemester) {
        this.tahunSemester = tahunSemester;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "idtransaksi=" + idtransaksi + ", tanggalTransaksi=" + tanggalTransaksi + ", jumlahBayar=" + jumlahBayar + ", semeterDiambil=" + semeterDiambil + ", tahunSemester=" + tahunSemester + '}';
    }
}

