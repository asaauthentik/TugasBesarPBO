/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */

public class Kehadiran extends Roster{
    private Mahasiswa mhs;
    private String keterangan;

    public Kehadiran(Mahasiswa mhs, String keterangan, String tanggal, int jamMulai, int jamSelesai, String ruangan) {
        super(tanggal, jamMulai, jamSelesai, ruangan);
        this.mhs = mhs;
        this.keterangan = keterangan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return "Kehadiran{" + "mhs=" + mhs + ", keterangan=" + keterangan + '}';
    }
}
