/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class Dosen extends User {
    private String NID;
    private String programStudi;
    private String bidangIlmu;
    private String gelarAkademik;
    private String statusPegawai; //PNS/nonpns
    private String statusIkatanKerja; //Dosen tetap, tidak tetap , dll
    private String id_MK_Diajar[];
    private boolean statusDosen;



    public Dosen(){}
    //Konstruktor
    public Dosen(String programStudi,String bidangIlmu, String gelarAkademik, String statusPegawai, String statusIkatanKerja, boolean statusDosen){
        this.programStudi = programStudi;
        this.bidangIlmu = bidangIlmu;
        this.gelarAkademik = gelarAkademik;
        this.statusPegawai = statusPegawai;
        this.statusIkatanKerja = statusIkatanKerja;
        this.statusDosen = statusDosen;
      
    }
    
    //Getter
    public String getprogramStudi(){
        return programStudi; 
    }
    public String getbidangIlmu(){
        return bidangIlmu; 
    }
    public String getgelarAkademik(){
        return gelarAkademik; 
    }
    public String getstatusPegawai(){
        return statusPegawai; 
    }
    public String getstatusIkatanKerja(){
        return statusIkatanKerja; 
    }
    public boolean getstatusDosen(){
        return statusDosen; 
    }
    
    //Setter
    public void setprogramStudi(String data){
        programStudi = data; 
    }
    public void setbidangIlmu(String data){
        bidangIlmu = data; 
    }
    public void setgelarAkademik(String data){
        gelarAkademik = data; 
    }
    public void setstatusPegawai(String data){
        statusPegawai = data; 
    }
    public void setstatusIkatanKerja(String data){
        statusIkatanKerja = data; 
    }
    public void setstatusDosen(boolean data){
        statusDosen = data; 
    }
   
}