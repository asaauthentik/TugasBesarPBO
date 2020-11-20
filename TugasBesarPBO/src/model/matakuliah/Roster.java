/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.matakuliah;

/**
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 */
public class Roster {
    private String ID_Roster;
    private String tanggal;
    private String jamMulai;
    private String jamSelesai;
    private String ruangan;
    private boolean statusDosen;
    //True  -> hadir , False -> tidak hadir
    public Roster(String tanggal, String jamMulai, String jamSelesai, String ruangan, boolean statusDosen) {
        this.statusDosen = statusDosen;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.ruangan = ruangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    @Override
    public String toString() {
        return "Roster{" + "tanggal=" + tanggal + ", jamMulai=" + jamMulai + ", jamSelesai=" + jamSelesai + ", ruangan=" + ruangan + '}';
    }
}
