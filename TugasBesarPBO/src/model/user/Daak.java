/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

/**
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 * 
 * 
*/
public class Daak extends User{

    private int NIK;
    private String jabatan;
    private boolean hakAksesKeuangan;
    private boolean hakAksesKemahasiswaan;
    private boolean hakAksesPerkuliahan;
    private boolean hakAksesDosen;
    private boolean hakAksesAdmin;
    private boolean statusKontrak;

    public Daak(int NIK, String jabatan, boolean hakAksesKeuangan, boolean hakAksesKemahasiswaan, boolean hakAksesPerkuliahan, boolean hakAksesDosen, boolean hakAksesAdmin, boolean statusKontrak, String idUser, String namaLengkap, String email, String password, String tanggalLahir, String jenisKelamin, String nomorTelepon) {
        super(idUser, namaLengkap, email, password, tanggalLahir, jenisKelamin, nomorTelepon);
        this.NIK = NIK;
    }
    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
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
        return "Daak{" + "NIK=" + NIK + ", jabatan=" + jabatan + ", hakAksesKeuangan=" + hakAksesKeuangan + ", hakAksesKemahasiswaan=" + hakAksesKemahasiswaan + ", hakAksesPerkuliahan=" + hakAksesPerkuliahan + ", hakAksesDosen=" + hakAksesDosen + ", hakAksesAdmin=" + hakAksesAdmin + ", statusKontrak=" + statusKontrak + '}';
    }
}
