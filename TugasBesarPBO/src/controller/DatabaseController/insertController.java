/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DatabaseController;

import controller.DatabaseHandler;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author S W I F T 3
 */
public class insertController {
    static DatabaseHandler conn = new DatabaseHandler();
    
    //Contohnya seperti ini , nanti bakal ada class deleteController, update, sama select, nah itu setiap tabel punya masing satu satu
    public static boolean insertNewUser(Object penduduk) {
        conn.connect();
        String query = "INSERT INTO penduduk VALUES(?,?,?,?,?,"
                                              + "?,?,?,?,?,"
                                              + "?,?,?,?,?,"
                                              + "?,?,?,?)";
                                  
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
//            java.sql.Date sqlDate;
//            stmt.setString(1, penduduk.getNik());
//            stmt.setString(2, penduduk.getNama());
//            stmt.setString(3, penduduk.getTempatLahir());
//            sqlDate = new java.sql.Date(penduduk.getTanggalLahir().getTime());
//            stmt.setDate(4, sqlDate);
//            stmt.setString(5, penduduk.getJenisKelamin().name());
//            stmt.setString(6, penduduk.getGolDar().name());
//            stmt.setString(7, penduduk.getAlamat());
//            stmt.setString(8, penduduk.getRtrw());
//            stmt.setString(9, penduduk.getKelurahan());
//            stmt.setString(10, penduduk.getKecamatan());
//            stmt.setString(11, penduduk.getAgama());
//            stmt.setString(12, penduduk.getStatusPerkawinan());
//            stmt.setString(13, penduduk.getPekerjaan());
//            stmt.setString(14, penduduk.getKewarganegaraan());
//            stmt.setString(15, penduduk.getBerlakuHingga());
//            stmt.setString(16, penduduk.getKotaPembuatan());
//            sqlDate = new java.sql.Date(penduduk.getTanggalPembuatan().getTime());
//            stmt.setDate(17, sqlDate);
//            stmt.setString(18, penduduk.getPathFoto());
//            stmt.setString(19, penduduk.getPathTandaTangan());
//            
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }
    
}
