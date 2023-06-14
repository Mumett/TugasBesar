package dao;

import model.PeminjamanLapangan;
import model.Karyawan;
import model.Lapangan;
import model.Penyewa;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeminjamanLapanganDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    Karyawan karyawan;
    
    public void insertPeminjamanLapangan(PeminjamanLapangan pl) {
        con = dbCon.makeConnection();
        String sql = "INSERT INTO peminjamanlapangan (id, tanggal, lamaPeminjaman, idKaryawan, idLapangan, idPenyewa) "
                + "VALUES ('" +pl.getIdPeminjaman()+ "','" +pl.getTanggal()+ "','" +pl.getLamaPeminjaman()+ "','"
                + pl.getKaryawan().getId() + "','" +pl.getLapangan().getId()+ "','" +pl.getPenyewa().getId()+ "')";
        
        System.out.println("Adding Karyawan...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Peminjaman Lapangan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error inserting Peminjaman Lapangan");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<PeminjamanLapangan> showPLBySearch(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT k.*, pl.*, l.*, p.* FROM karyawan as k JOIN peminjamanlapangan as pl ON pl.idKaryawan = k.id JOIN "
                + "lapangan as l on pl.idLapangan = l.id JOIN "
                + "penyewa as p on pl.idPenyewa = p.id "
                + "WHERE (k.nama LIKE '%" +query+ "%' "
                + "OR l.nama LIKE '%" +query+ "%' "
                + "OR p.nama LIKE '%" +query+ "%' "
                + "OR p.usia LIKE '%" +query+ "%' "
                + "OR p.alamat LIKE '%" +query+ "%' "
                + "OR p.notelp LIKE '%" +query+ "%'"
                + "OR pl.id LIKE '%" +query+ "%' "
                + "OR pl.tanggal LIKE '%" +query+ "%' "
                + "OR pl.lamaPeminjaman LIKE '%" +query+ "%')";
        
        System.out.println("Mengambil Data Peminjaman Lapangan...");
        
        List<PeminjamanLapangan> list = new ArrayList<>();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Karyawan k = new Karyawan(
                            rs.getString("k.nama"),
                            rs.getString("k.alamat"),
                            rs.getString("k.jenis"),
                            rs.getString("k.notelp"),
                            Integer.parseInt(rs.getString("k.id")),
                            Integer.parseInt(rs.getString("k.usia"))
                    );
                    Lapangan l = new Lapangan(
                            Integer.parseInt(rs.getString("l.id")), 
                            rs.getString("l.nama"), 
                            Integer.parseInt(rs.getString("l.luas")), 
                            rs.getString("l.jenis"),
                            rs.getString("l.fasilitas"), 
                            rs.getString("l.statusLapangan")
                    );
                    Penyewa p = new Penyewa(
                            rs.getString("p.nama"),
                            rs.getString("p.alamat"),
                            rs.getString("p.notelp"),
                            Integer.parseInt(rs.getString("p.id")),
                            Integer.parseInt(rs.getString("p.usia"))                            
                    );
                    PeminjamanLapangan pl = new PeminjamanLapangan(
                            rs.getInt("pl.id"), 
                            rs.getString("pl.tanggal"), 
                            rs.getString("pl.lamaPeminjaman"), 
                            k, l, p
                    );
                    list.add(pl);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Database...");
            System.out.println(e);
        }
        return list;
    }
       
    public void update(PeminjamanLapangan pl){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE peminjamanlapangan SET id = " +pl.getIdPeminjaman()+ ","
                + "idKaryawan = '" +pl.getKaryawan().getId()+ "',"
                + "idLapangan = '" +pl.getLapangan().getId()+ "',"
                + "idPenyewa = '" +pl.getPenyewa().getId()+ "',"
                + "tanggal = '" +pl.getTanggal()+ "',"
                + "lamaPeminjaman = '" +pl.getLamaPeminjaman()+ "',"
                + "WHERE id = '" +pl.getIdPeminjaman()+ "' ";
        
        System.out.println("Updating Peminjaman Lapangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Editing " + result + " Data Peminjaman Lapangan " + pl.getIdPeminjaman());
            statement.close();
        }catch(Exception e){
            System.out.println("Error Editing Data Peminjaman Lapangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }   
    
    public void delete(int id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM peminjamanlapangan "
                + "WHERE (id LIKE '%" + id + "%')";
        
        System.out.println("Deleting Data Peminjaman Lapangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleting " + result + " Data Peminjaman Lapangan ");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Deleting Data Peminjaman Lapangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}