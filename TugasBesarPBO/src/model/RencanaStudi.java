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

public class RencanaStudi {
    //Matakuliah diambil banyak
    String idRsm;
    String id_Mtk[];
    String semester;
    int tahun;
    
    public RencanaStudi(){}
    //Konstruktor
    public RencanaStudi(String semester, int tahun, float ips){
        this.semester = semester;
        this.tahun = tahun;
       
    }
    
    //Getter
    public String getSemester(){
        return semester; 
    }
    public int getTahun(){
        return tahun; 
    }
    
    
    //Setter
    public void setSemester(String data){
        semester = data; 
    }
    public void setTahun(int data){
        tahun = data; 
    }
   
}
