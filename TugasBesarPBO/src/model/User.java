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
public abstract class User {
    
    private String idUser;
    private String namaLengkap;
    private String email;
    private String password;
    private String tglLahir;
    private String jenisKelamin;
    private String notelp;
    
    
    public User(){}
    //Construktor

    public User(String idUser, String namaLengkap, String email, String password, String tglLahir, String jenisKelamin, String notelp) {
        this.idUser = idUser;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.password = password;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.notelp = notelp;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    
    
}
