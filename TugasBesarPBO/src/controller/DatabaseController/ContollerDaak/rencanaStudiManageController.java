/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DatabaseController.ContollerDaak;

import static controller.DatabaseController.ContollerDaak.matakuliahManageController.conn;
import controller.DatabaseHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.matakuliah.DetailMatakuliah;
import model.matakuliah.Matakuliah;
import model.matakuliah.RencanaStudi;

/**
 *
 * @author 1119002 Albertus Angkuw
 */
public class rencanaStudiManageController {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static boolean insertRencanaStudi(RencanaStudi data,String nim) {
        conn.connect();
        String query = "INSERT rencana_studi_mahasiswa INTO  VALUES(?,?,?,?)";
                             
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, data.getId_RSM());
            stmt.setString(2, nim);
            stmt.setString(3, data.getSemesterAjaran() );
            stmt.setInt(4, data.getTahunAjaran());
            stmt.executeUpdate();
            if(!insertDetailRencanaStudi(data)){
                return false;
            }
            System.out.println("Log DB Insert Rencana Studi : Success");
        } catch (SQLException e) {
            System.out.println("Error  Insert  Matakuliah : " + e.getMessage());
            return false;
        }
        return true;
    }
    
    private static boolean insertDetailRencanaStudi(RencanaStudi data) {
        conn.connect();
        String query = "INSERT detail_rencana_studi_mahasiswa(ID_MK,ID_RSM) INTO  VALUES(?,?)";
                             
        try {
            for(int i=0; i < data.getId_Mk().size(); i++){
                PreparedStatement stmt = conn.con.prepareStatement(query);
                stmt.setString(1, data.getId_Mk().get(i));
                stmt.setString(2, data.getId_RSM());
                stmt.executeUpdate();
            }
            System.out.println("Log DB Insert Detail Rencana Studi : Success");
        } catch (SQLException e) {
            System.out.println("Error  Insert  Matakuliah : " + e.getMessage());
            return false;
        }
        return true;
    }
    
    
    public static boolean updateRencanaStudi(RencanaStudi data,String nim) {
        conn.connect();
        String query = "UPDATE `rencana_studi_mahasiswa` SET `ID_RSM` = '" + data.getId_RSM() + "', "
                + "`NIM` = '" + nim + "', "
                + "`Semester` = '" + data.getSemesterAjaran() + "', "
                + "`Tahun` = '" + data.getTahunAjaran() + "' WHERE `rencana_studi_mahasiswa`.`ID_RSM` = '" + data.getId_RSM() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Log DB Update Rencana Studi : Success");
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error Update Matakuliah : " + e.getMessage());
            return (false);
        }     
    }
    private static boolean updateDetailRencanaStudi(RencanaStudi data) {
        conn.connect();
        String query = "UPDATE `detail_rencana_studi_mahasiswa` SET `ID_RSM` = '" + data.getId_RSM() + "', "
                + "`ID_MK` = '" + data.getTahunAjaran() + "' WHERE `rencana_studi_mahasiswa`.`ID_RSM` = '" + data.getId_RSM() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Log DB Update Rencana Studi : Success");
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error Update Matakuliah : " + e.getMessage());
            return (false);
        }     
    }
 
    
//    public static DetailMatakuliah getDetailMatakuliah(String kode,int tahun,String semester){
//        conn.connect();
//        String query = "SELECT * FROM detail_matakuliah WHERE Kode_MK='" + kode + "'"
//                + "&& Tahun='"+ tahun + "' && Semester='"+ semester + "'" ;
//        DetailMatakuliah detailMK = null;
//        try {
//            Statement stmt = conn.con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                detailMK = new DetailMatakuliah();
//                detailMK.setId_MK(rs.getString(1)); 
//                detailMK.setNid(rs.getString(2));
//                detailMK.setKode_MK(rs.getString(3));
//                detailMK.setKelas(rs.getString(4).charAt(0));
//                detailMK.setJumlahPertemuan(rs.getInt(5));
//                detailMK.setTahun(rs.getInt(6));
//                detailMK.setSemester(rs.getString(7));
//            }
//            System.out.println("Log DB Get Detail Matakuliah : Success");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return detailMK;
//    }
//    
//    public static boolean deleteMatakuliah(String kodeMK) {
//        conn.connect();
//        String query = "DELETE FROM matakuliah WHERE Kode='" + kodeMK + "'";
//        try {
//            Statement stmt = conn.con.createStatement();
//            stmt.executeUpdate(query);
//            System.out.println("Log DB Delete Matakuliah : Success");
//            return (true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return (false);
//        }
//    }
//    public static boolean deleteDetailMatakuliah(String kode,int tahun,String semester) {
//        conn.connect();
//        String query = "DELETE FROM detail_matakuliah WHERE Kode_MK='" + kode + "'"
//                + "&& Tahun='"+ tahun + "' && Semester='"+ semester + "'" ;
//        try {
//            Statement stmt = conn.con.createStatement();
//            stmt.executeUpdate(query);
//            System.out.println("Log DB Delete Detail Matakuliah : Success");
//            return (true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return (false);
//        }
//    }
}
