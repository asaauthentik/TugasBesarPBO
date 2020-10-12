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
class roster{
    String tanggal;
    int jamMulai;
    int jamSelesai;
    String ruangan;
}
class Kehadiran extends roster{
    Mahasiswa mhs;
    String keterangan;
}
class DetailMatakuliah extends Matakuliah{
    String id_MK;
    int tahun;
    String semester;
    char kelas;
    int jmlPertemuan;
    //
    Dosen pengajar;
    roster jadwal[];
    Nilai nilaiMHS[];
    Kehadiran kehadiranMHS[];
}
public abstract class Matakuliah {
    String kode_MK;
    String nama_MK;
    String jenis_MK;
    String sifat_MK;
    int sks;
  
}
