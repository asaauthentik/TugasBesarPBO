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

public class RencanaStudi {
    private String id_RSM;
    private String semesterAjaran;
    private int tahunAjaran;
    public ArrayList<DetailMatakuliah> id_Matkul;

    public RencanaStudi(String id_RSM, String semesterAjaran, int tahunAjaran, ArrayList<DetailMatakuliah> id_Matkul) {
        this.id_RSM = id_RSM;
        this.semesterAjaran = semesterAjaran;
        this.tahunAjaran = tahunAjaran;
        this.id_Matkul = id_Matkul;
    }

    public String getId_RSM() {
        return id_RSM;
    }

    public void setId_RSM(String id_RSM) {
        this.id_RSM = id_RSM;
    }

    public String getSemesterAjaran() {
        return semesterAjaran;
    }

    public void setSemesterAjaran(String semesterAjaran) {
        this.semesterAjaran = semesterAjaran;
    }

    public int getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(int tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    @Override
    public String toString() {
        return "RencanaStudi{" + "id_RSM=" + id_RSM + ", semesterAjaran=" + semesterAjaran + ", tahunAjaran=" + tahunAjaran + ", id_Matkul=" + id_Matkul + '}';
    }
    //Matakuliah diambil banyak
    private String idRsm;
    public ArrayList<String> id_Mtk;
    private String semester;
    private int tahun;

    public RencanaStudi(String idRsm, ArrayList<String> id_Mtk, String semester, int tahun) {
        this.idRsm = idRsm;
        this.id_Mtk = id_Mtk;
        this.semester = semester;
        this.tahun = tahun;
    }

    public String getIdRsm() {
        return idRsm;
    }

    public void setIdRsm(String idRsm) {
        this.idRsm = idRsm;
    }

    public ArrayList<String> getId_Mtk() {
        return id_Mtk;
    }

    public void setId_Mtk(ArrayList<String> id_Mtk) {
        this.id_Mtk = id_Mtk;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
   
   

}
