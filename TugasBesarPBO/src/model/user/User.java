/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

/**
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 * @author 1119038 Elangel Neilea Shaday
 */
public abstract class User {
    private String idUser;
    private String namaLengkap;
    private String email;
    private String password;
    private String tanggalLahir;
    private String jenisKelamin;
    private String nomorTelepon;
    private int jenisUser;
    private String pathFoto;
    public User(){
        
    }
    public User(String idUser, String namaLengkap, String email, String password, String tanggalLahir, String jenisKelamin, String nomorTelepon) {
        this.idUser = idUser;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.password = password;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelepon = nomorTelepon;
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

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", namaLengkap=" + namaLengkap + ", email=" + email + ", password=" + password + ", tanggalLahir=" + tanggalLahir + ", jenisKelamin=" + jenisKelamin + ", nomorTelepon=" + nomorTelepon + '}';
    }
}
