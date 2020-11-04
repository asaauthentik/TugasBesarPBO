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
public abstract class Matakuliah {
    private String kode_MK;
    private String nama_MK;
    private String jenis_MK;
    private String sifat_MK;
    private int sks;

    public Matakuliah(String kode_MK, String nama_MK, String jenis_MK, String sifat_MK, int sks) {
        this.kode_MK = kode_MK;
        this.nama_MK = nama_MK;
        this.jenis_MK = jenis_MK;
        this.sifat_MK = sifat_MK;
        this.sks = sks;
    }

    public String getKode_MK() {
        return kode_MK;
    }

    public void setKode_MK(String kode_MK) {
        this.kode_MK = kode_MK;
    }

    public String getNama_MK() {
        return nama_MK;
    }

    public void setNama_MK(String nama_MK) {
        this.nama_MK = nama_MK;
    }

    public String getJenis_MK() {
        return jenis_MK;
    }

    public void setJenis_MK(String jenis_MK) {
        this.jenis_MK = jenis_MK;
    }

    public String getSifat_MK() {
        return sifat_MK;
    }

    public void setSifat_MK(String sifat_MK) {
        this.sifat_MK = sifat_MK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "Matakuliah{" + "kode_MK=" + kode_MK + ", nama_MK=" + nama_MK + ", jenis_MK=" + jenis_MK + ", sifat_MK=" + sifat_MK + ", sks=" + sks + '}';
    }
}
