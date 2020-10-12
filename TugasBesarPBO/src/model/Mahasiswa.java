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
 */
public class Mahasiswa extends User {
    int NIM;
    String jurusan;
    int tahunMasuk;
    int tahunLulus;
    float ipk;
    String predikat;
    RencanaStudi rencanastudi[];
    
    Mahasiswa(){
        super();
    }
    
    Mahasiswa(String status, String jurusan, int tahunMasuk, int tahunLulus, float ipk, String predikat){
        this.jurusan = jurusan;
        this.tahunMasuk = tahunMasuk;
        this.tahunLulus = tahunLulus;
        this.ipk = ipk;
        this.predikat = predikat;
        /*
        rencanastudi = new RencanaStudi[10];
        for(int i=0; i<rencanastudi.length; i++){
            rencanastudi[i] = new RencanaStudi();
        }*/
    }
    public void printData(){
        System.out.println("Nama: " + getNamaLengkap());
        System.out.println("Jurusan: ");
    }
}
