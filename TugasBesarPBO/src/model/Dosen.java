/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 */
public class Dosen extends User {
    private String NID;
    private String programStudi;
    private String bidangIlmu;
    private String gelarAkademik;
    private String statusPegawai; //PNS/nonpns
    private String statusIkatanKerja; //Dosen tetap, tidak tetap , dll
    private boolean statusDosen;
    public ArrayList<DetailMatakuliah> Matakuliah;

    public Dosen(String NID, String programStudi, String bidangIlmu, String gelarAkademik, String statusPegawai, String statusIkatanKerja, boolean statusDosen, ArrayList<DetailMatakuliah> Matakuliah, String idUser, String namaLengkap, String email, String password, String tglLahir, String jenisKelamin, String notelp) {
        super(idUser, namaLengkap, email, password, tglLahir, jenisKelamin, notelp);
        this.NID = NID;
        this.programStudi = programStudi;
        this.bidangIlmu = bidangIlmu;
        this.gelarAkademik = gelarAkademik;
        this.statusPegawai = statusPegawai;
        this.statusIkatanKerja = statusIkatanKerja;
        this.statusDosen = statusDosen;
        this.Matakuliah = Matakuliah;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getBidangIlmu() {
        return bidangIlmu;
    }

    public void setBidangIlmu(String bidangIlmu) {
        this.bidangIlmu = bidangIlmu;
    }

    public String getGelarAkademik() {
        return gelarAkademik;
    }

    public void setGelarAkademik(String gelarAkademik) {
        this.gelarAkademik = gelarAkademik;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    public String getStatusIkatanKerja() {
        return statusIkatanKerja;
    }

    public void setStatusIkatanKerja(String statusIkatanKerja) {
        this.statusIkatanKerja = statusIkatanKerja;
    }

    public boolean isStatusDosen() {
        return statusDosen;
    }

    public void setStatusDosen(boolean statusDosen) {
        this.statusDosen = statusDosen;
    }

    @Override
    public String toString() {
        return "Dosen{" + "NID=" + NID + ", programStudi=" + programStudi + ", bidangIlmu=" + bidangIlmu + ", gelarAkademik=" + gelarAkademik + ", statusPegawai=" + statusPegawai + ", statusIkatanKerja=" + statusIkatanKerja + ", statusDosen=" + statusDosen + ", Matakuliah=" + Matakuliah + '}';
    }
}