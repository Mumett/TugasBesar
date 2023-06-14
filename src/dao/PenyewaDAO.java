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
import model.Lapangan;
import model.Penyewa;
/**
 *
 * @author bayud
 */
public class PenyewaDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPenyewa(Penyewa p) {
        con = dbCon.makeConnection();

        String sql = "INSERT INTO penyewa(id, nama, usia, alamat, notelp)"
                + "VALUES ('" + p.getId() + "', '" + p.getNama() + "', '"
                + p.getUsia() + "', '" + p.getAlamat() + "', '" + p.getAlamat() + "')";    

        System.out.println("Adding Penyewa...");

        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Penyewa");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding Penyewa...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Penyewa> showPenyewa(){
        con = dbCon.makeConnection();

        String sql = "SELECT * FROM penyewa";
        System.out.println("Mengambil Data Penyewa...");
        
        List<Penyewa> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Penyewa p = new Penyewa(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("notelp"),
                            Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia"))                            
                    );
                    list.add(p);         
                }
            }
            rs.close();
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Reading Database...");
            System.out.println(e);
        }
        dbCon.closeConnection();       
        return list;
    }
    
    public Penyewa searchPenyewa(int id) {
        con = dbCon.makeConnection();
        String sql = "SELECT * FROM penyewa WHERE id = '" + id + "'";
        System.out.println("Please wait, searching penyewa...");
        Penyewa p = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    p = new Penyewa(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("notelp"),
                            Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia")) 
                        );
                }
            }

        } catch (Exception e) {
            System.out.println("Error while reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();      
        return p;  
    }
    
    public List<Penyewa> showPenyewaBySearch(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * penyewa "
                + "WHERE id = '%"+query+"%' "
                + "OR nama LIKE '%"+query+"%' "
                + "OR usia = '%"+query+"%' "
                + "OR alamat LIKE '%"+query+"%' "
                + "OR notelp LIKE '%"+query+"%' ";
        
        System.out.println("Mengambil Data Penyewa...");
        
        List<Penyewa> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Penyewa p = new Penyewa(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("notelp"),
                            Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia")) 
                        );
                }
            }
        }catch(Exception e){
            System.out.println("Error Reading Penyewa...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void updatePenyewa(Penyewa p, int id) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE penyewa SET nama = '" + p.getNama()+ "', "
                + "usia = '" + p.getUsia() + "', "
                + "alamat = '" + p.getAlamat() + "' "
                + "no telepon = '" + p.getNotelp() + "' "
                + "WHERE id = '" + id + "'";
        System.out.println("Editing Penyewa...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + "Penyewa" + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing penyewa...");
            System.out.println(e);
        }
        dbCon.closeConnection();   
    }
    
    public void deletePenyewa(int id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM penyewa where id = '" + id + "'";
        System.out.println("Deleting penyewa...");
        try {
            Statement s = con.createStatement();
            int result = s.executeUpdate(sql);
            System.out.println("Delete " + result + " Penyewa " + id);
            s.close();
        } catch (Exception e) {
            System.out.println("Error deleting penyewa...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Penyewa getPenyewa(String nama){
        con = dbCon.makeConnection();
        Penyewa dataPenyewa = null;
        String sql = "SELECT * FROM penyewa WHERE BINARY "
                + "nama = '"+nama+"'";
        System.out.println("Mencari data Penyewa ...");
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                dataPenyewa = new Penyewa(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("notelp"),
                            Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia")) 
                        );
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return dataPenyewa;
    }
}
