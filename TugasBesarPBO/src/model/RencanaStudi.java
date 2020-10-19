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
}
