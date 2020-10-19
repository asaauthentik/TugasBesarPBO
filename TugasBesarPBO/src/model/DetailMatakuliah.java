/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class DetailMatakuliah extends Matakuliah{
    private String id_MK;
    private int tahun;
    private String semester;
    private char kelas;
    private int jmlPertemuan;
    public ArrayList<Dosen> pengajar;
    public ArrayList<Roster> jadwal;
    public ArrayList<Nilai> nilaiMHS;
    public ArrayList<Kehadiran> kehadiranMHS;

    public DetailMatakuliah(String id_MK, int tahun, String semester, char kelas, int jmlPertemuan, ArrayList<Dosen> pengajar, ArrayList<Roster> jadwal, ArrayList<Nilai> nilaiMHS, ArrayList<Kehadiran> kehadiranMHS, String kode_MK, String nama_MK, String jenis_MK, String sifat_MK, int sks) {
        super(kode_MK, nama_MK, jenis_MK, sifat_MK, sks);
        this.id_MK = id_MK;
        this.tahun = tahun;
        this.semester = semester;
        this.kelas = kelas;
        this.jmlPertemuan = jmlPertemuan;
        this.pengajar = pengajar;
        this.jadwal = jadwal;
        this.nilaiMHS = nilaiMHS;
        this.kehadiranMHS = kehadiranMHS;
    }

    public String getId_MK() {
        return id_MK;
    }

    public void setId_MK(String id_MK) {
        this.id_MK = id_MK;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public char getKelas() {
        return kelas;
    }

    public void setKelas(char kelas) {
        this.kelas = kelas;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }

    @Override
    public String toString() {
        return "DetailMatakuliah{" + "id_MK=" + id_MK + ", tahun=" + tahun + ", semester=" + semester + ", kelas=" + kelas + ", jmlPertemuan=" + jmlPertemuan + ", pengajar=" + pengajar + ", jadwal=" + jadwal + ", nilaiMHS=" + nilaiMHS + ", kehadiranMHS=" + kehadiranMHS + '}';
    }
}
