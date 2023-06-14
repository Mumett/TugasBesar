/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;
import model.Lapangan;

/**
 *
 * @author bayud
 */
public class LapanganDAO {

    private DbConnection dbCon = new DbConnection();
    private Connection con;

    public void insertLapangan(Lapangan l) {
        con = dbCon.makeConnection();
        String sql = "insert into lapangan(id,nama,luas,jenis,fasilitas,statusLapangan)"
                + "values ('" + l.getId() + "','" + l.getNama1() + "','" + l.getLuas() + "','"
                + l.getJenis() + "','" + l.getFasilitas() + "','" + l.getStatusLapangan()
                + "')";

        System.out.println("Adding Lapangan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Lapangan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding Lapangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public List<Lapangan> showLapangan() {
        con = dbCon.makeConnection();

        String sql = "SELECT * FROM lapangan";
        System.out.println("Mengambil lapangan...");
        List<Lapangan> list = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Lapangan l = new Lapangan(Integer.parseInt(rs.getString("id")),
                            rs.getString("nama"), Integer.parseInt(rs.getString("luas")),
                            rs.getString("jenis"), rs.getString("fasilitas"),
                            rs.getString("statuslapangan"));
                    list.add(l);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error while reading database!");
            System.out.println(e);
        }
        return list;
    }
    
    public List<Lapangan> showLapBySearch(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM lapangan "
                + "WHERE id = '%"+query+"%' "
                + "OR nama LIKE '%"+query+"%' "
                + "OR luas = '%"+query+"%' "
                + "OR jenis LIKE '%"+query+"%' "
                + "OR fasilitas LIKE '%"+query+"%' "
                + "OR statusLapangan LIKE '%"+query+"%' ";
        
        System.out.println("Mengambil Data Lapangan....");
        
        List<Lapangan> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Lapangan l = new Lapangan(
                            Integer.parseInt(rs.getString("id")), 
                            rs.getString("nama"), 
                            Integer.parseInt(rs.getString("luas")), 
                            rs.getString("jenis"),
                            rs.getString("fasilitas"), 
                            rs.getString("statusLapangan")
                    );
                    list.add(l);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Lapangan....");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }

    public Lapangan searchLapangan(int id) {
        con = dbCon.makeConnection();
        String sql = "SELECT * FROM lapangan WHERE id = '" + id + "'";
        System.out.println("Please wait, searching lapangan...");
        Lapangan l = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    l = new Lapangan(Integer.parseInt(rs.getString("id")),
                            rs.getString("nama"), Integer.parseInt(rs.getString("luas")),
                            rs.getString("jenis"), rs.getString("fasilitas"),
                            rs.getString("statuslapangan"));
                }
            }

        } catch (Exception e) {
            System.out.println("Error while reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return l;
    }

    public void updateLapangan(Lapangan l, int id) {
        con = dbCon.makeConnection();
        
        String sql = "Update lapangan SET nama = '" + l.getNama1() + "',luas ='"
                + l.getLuas() + "', jenis = '" + l.getJenis() + "',fasilitas ='"
                + l.getFasilitas() + "',statusLapangan ='" + l.getStatusLapangan()
                + " WHERE id = '" + l.getId() + "'";
        System.out.println("Editing Lapangan...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + "Lapangan" + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing lapangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
    }

    public void deleteLapangan(int id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM lapangan where id = '" + id + "'";
        System.out.println("Deleting lapangan...");
        try {
            Statement s = con.createStatement();
            int result = s.executeUpdate(sql);
            System.out.println("Delete " + result + " Lapangan " + id);
            s.close();
        } catch (Exception e) {
            System.out.println("Error deleting Lapangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public Lapangan getLapangan(String nama){
        con = dbCon.makeConnection();
        Lapangan dataLapangan = null;
        String sql = "SELECT * FROM lapangan WHERE BINARY "
                + "nama = '"+nama+"'";
        System.out.println("Mencari data Lapangan ...");
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                dataLapangan = new Lapangan(
                            Integer.parseInt(rs.getString("id")), 
                            rs.getString("nama"), 
                            Integer.parseInt(rs.getString("luas")), 
                            rs.getString("jenis"),
                            rs.getString("fasilitas"), 
                            rs.getString("statusLapangan")
                    );
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return dataLapangan;
    }
}
