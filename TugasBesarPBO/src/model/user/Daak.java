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

    private String NIK;
    private String jabatan;
    private boolean hakAksesKeuangan;
    private boolean hakAksesRencanaStudi;
    private boolean hakAksesMatakuliah;
    private boolean hakAksesUser;
    private boolean hakAksesJadwalPerkuliahaan;
    private boolean statusKontrak;

    public Daak(String NIK, String jabatan, boolean hakAksesKeuangan, boolean hakAksesRencanaStudi, boolean hakAksesMatakuliah, boolean hakAksesUser, boolean hakAksesJadwalPerkuliahaan, boolean statusKontrak, String idUser, String namaLengkap, String email, String password, String tanggalLahir, String jenisKelamin, String nomorTelepon) {
        super(idUser, namaLengkap, email, password, tanggalLahir, jenisKelamin, nomorTelepon);
        this.NIK = NIK;
        this.jabatan = jabatan;
        this.hakAksesKeuangan = hakAksesKeuangan;
        this.hakAksesRencanaStudi = hakAksesRencanaStudi;
        this.hakAksesMatakuliah = hakAksesMatakuliah;
        this.hakAksesUser = hakAksesUser;
        this.hakAksesJadwalPerkuliahaan = hakAksesJadwalPerkuliahaan;
        this.statusKontrak = statusKontrak;
    }

   
    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
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

    public boolean isHakAksesRencanaStudi() {
        return hakAksesRencanaStudi;
    }

    public void setHakAksesRencanaStudi(boolean hakAksesRencanaStudi) {
        this.hakAksesRencanaStudi = hakAksesRencanaStudi;
    }

    public boolean isHakAksesMatakuliah() {
        return hakAksesMatakuliah;
    }

    public void setHakAksesMatakuliah(boolean hakAksesMatakuliah) {
        this.hakAksesMatakuliah = hakAksesMatakuliah;
    }

    public boolean isHakAksesUser() {
        return hakAksesUser;
    }

    public void setHakAksesUser(boolean hakAksesUser) {
        this.hakAksesUser = hakAksesUser;
    }

    public boolean isHakAksesJadwalPerkuliahaan() {
        return hakAksesJadwalPerkuliahaan;
    }

    public void setHakAksesJadwalPerkuliahaan(boolean hakAksesJadwalPerkuliahaan) {
        this.hakAksesJadwalPerkuliahaan = hakAksesJadwalPerkuliahaan;
    }

    public boolean isStatusKontrak() {
        return statusKontrak;
    }

    public void setStatusKontrak(boolean statusKontrak) {
        this.statusKontrak = statusKontrak;
    }

    @Override
    public String toString() {
        return "Daak{" + "NIK=" + NIK + ", jabatan=" + jabatan + ", hakAksesKeuangan=" + hakAksesKeuangan + ", hakAksesKemahasiswaan=" + hakAksesRencanaStudi + ", hakAksesPerkuliahan=" + hakAksesMatakuliah + ", hakAksesDosen=" + hakAksesUser + ", hakAksesAdmin=" + hakAksesJadwalPerkuliahaan + ", statusKontrak=" + statusKontrak + '}';
    }
}
