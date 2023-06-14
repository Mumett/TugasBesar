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
/**
 *
 * @author bayud
 */
public class KaryawanDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertKaryawan(Karyawan k) {
        con = dbCon.makeConnection();

        String sql = "INSERT INTO karyawan(id, nama, usia, alamat, jenis, notelp)"
                + "VALUES ('" + k.getId() + "', '" + k.getNama() + "', '"
                + k.getUsia() + "', '" + k.getAlamat() + "', '" + k.getJenis() + "', '" + k.getNotelp() + "')";    

        System.out.println("Adding Karyawan...");

        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Karyawan");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding Karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Karyawan> showKaryawan(){
        con = dbCon.makeConnection();

        String sql = "SELECT * FROM karyawan";
        System.out.println("Mengambil Data Karyawan...");
        
        List<Karyawan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Karyawan k = new Karyawan(rs.getString("nama"), 
                            rs.getString("alamat"), rs.getString("jenis"), 
                            rs.getString("notelp"), Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia"))
                    );
                    list.add(k);         
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
    
    public List<Karyawan> showKaryawanBySearch(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM karyawan "
                + "WHERE nama LIKE '%"+query+"%' "
                + "OR alamat LIKE '%"+query+"%' "
                + "OR jenis LIKE '%"+query+"%' "
                + "OR notelp LIKE '%"+query+"%' "
                + "OR id = '%"+query+"%' "
                + "OR usia = '%"+query+"%' ";
                        
        System.out.println("Mengambil Data Karyawan....");
        
        List<Karyawan> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Karyawan k = new Karyawan(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("jenis"),
                            rs.getString("notelp"),
                            Integer.parseInt(rs.getString("id")),
                            Integer.parseInt(rs.getString("usia"))
                    );
                    list.add(k);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Karyawan....");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void updateKaryawan(Karyawan k, int id) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE karyawan SET nama = '" + k.getNama()+ "', "
                + "usia = '" + k.getUsia() + "', "
                + "alamat = '" + k.getAlamat() + "' "
                + "jenis = '" + k.getJenis() + "' "
                + "no telepon = '" + k.getNotelp() + "' "
                + "WHERE id = '" + id + "'";
        System.out.println("Editing Karyawan...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + "Karyawan" + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();   
    }
    
    public void deleteKaryawan (int id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM karyawan where id = '" + id + "'";
        System.out.println("Deleting karyawan...");
        try {
            Statement s = con.createStatement();
            int result = s.executeUpdate(sql);
            System.out.println("Delete " + result + " Karyawan " + id);
            s.close();
        } catch (Exception e) {
            System.out.println("Error deleting karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Karyawan getKaryawan(String nama){
        con = dbCon.makeConnection();
        Karyawan dataKaryawan = null;
        String sql = "SELECT * FROM karyawan WHERE BINARY "
                + "nama = '"+nama+"'";
        System.out.println("Mencari data karyawan ...");
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                dataKaryawan = new Karyawan(
                            rs.getString("nama"),
                            rs.getString("alamat"),
                            rs.getString("jenis"),
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
        
        return dataKaryawan;
    }
    
}
