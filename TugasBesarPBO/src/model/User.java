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
public class User {
    
    private String idUser;
    private String namaLengkap;
    private String email;
    private String password;
    private String tglLahir;
    private String jenisKelamin;
    private String notelp;
    
    
    public User(){}
    //Construktor
    public User(String nomorInduk,String password, String namaLengkap, String tglLahir, String tempatLahir, String jenisKelamin){
        this.idUser = nomorInduk;
        this.namaLengkap = namaLengkap;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.password = password;
        notelp = "";
        
    }
    
    //Getter
    public String getIdUser(){
        return idUser; 
    }
    
    public String getNamaLengkap(){
        return namaLengkap; 
    }
    
    public String getTglLahir(){
        return tglLahir; 
    }
    
    
    
    public String getJenisKelamin(){
        return jenisKelamin; 
    }
    
   
    public String getnotelp(){
        return notelp; 
    }
    
    public String getPassword(){
        return password; 
    }
    
    //Setter
    public void setIdUser(String data){
        idUser = data; 
    }
    
    public void setNamaLengkap(String data){
        namaLengkap = data;  
    }
    
    public void setTglLahir(String data){
        tglLahir = data; 
    }
    
  
    
    public void setJenisKelamin(String data){
        jenisKelamin = data; 
    }
    
  
    
    public void setnotelp(String data){
        notelp = data; 
    }
    
    public void setPassword(String data){
        password = data; 
    }
    
    
}
