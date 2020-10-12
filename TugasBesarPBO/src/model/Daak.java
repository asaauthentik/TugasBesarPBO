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
 * @author 1119038 Elangel Neilea Shaday
 */
public class Daak extends User{
    String jabatan;
    boolean hakAksesKeuangan;
    boolean hakAksesKemahasiswaan;
    boolean hakAksesPerkuliahan;
    boolean hakAksesDosen;
    boolean hakAksesAdmin;
    boolean statusKontrak;

    public Daak(String jabatan, boolean hakAksesKeuangan, boolean hakAksesKemahasiswaan, boolean hakAksesPerkuliahan, boolean hakAksesDosen, boolean hakAksesAdmin, boolean statusKontrak, String nomorInduk, String password, String namaLengkap, String tglLahir, String tempatLahir, String jenisKelamin) {
        super(nomorInduk, password, namaLengkap, tglLahir, tempatLahir, jenisKelamin);
        this.jabatan = jabatan;
        this.hakAksesKeuangan = hakAksesKeuangan;
        this.hakAksesKemahasiswaan = hakAksesKemahasiswaan;
        this.hakAksesPerkuliahan = hakAksesPerkuliahan;
        this.hakAksesDosen = hakAksesDosen;
        this.hakAksesAdmin = hakAksesAdmin;
        this.statusKontrak = statusKontrak;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public boolean isHakAksesKeuangan() {
        return hakAksesKeuangan;
    }

    public void setHakAksesKeuangan(boolean hakAksesKeuangan) {
        this.hakAksesKeuangan = hakAksesKeuangan;
    }

    public boolean isHakAksesKemahasiswaan() {
        return hakAksesKemahasiswaan;
    }

    public void setHakAksesKemahasiswaan(boolean hakAksesKemahasiswaan) {
        this.hakAksesKemahasiswaan = hakAksesKemahasiswaan;
    }

    public boolean isHakAksesPerkuliahan() {
        return hakAksesPerkuliahan;
    }

    public void setHakAksesPerkuliahan(boolean hakAksesPerkuliahan) {
        this.hakAksesPerkuliahan = hakAksesPerkuliahan;
    }

    public boolean isHakAksesDosen() {
        return hakAksesDosen;
    }

    public void setHakAksesDosen(boolean hakAksesDosen) {
        this.hakAksesDosen = hakAksesDosen;
    }

    public boolean isHakAksesAdmin() {
        return hakAksesAdmin;
    }

    public void setHakAksesAdmin(boolean hakAksesAdmin) {
        this.hakAksesAdmin = hakAksesAdmin;
    }

    public boolean isStatusKontrak() {
        return statusKontrak;
    }

    public void setStatusKontrak(boolean statusKontrak) {
        this.statusKontrak = statusKontrak;
    }

    @Override
    public String toString() {
        return "Daak{" + "jabatan=" + jabatan + ", hakAksesKeuangan=" + hakAksesKeuangan + ", hakAksesKemahasiswaan=" + hakAksesKemahasiswaan + ", hakAksesPerkuliahan=" + hakAksesPerkuliahan + ", hakAksesDosen=" + hakAksesDosen + ", hakAksesAdmin=" + hakAksesAdmin + ", statusKontrak=" + statusKontrak + '}';
    }
    
}
