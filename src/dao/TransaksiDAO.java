package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;
import model.Lapangan;
import model.PeminjamanLapangan;
import model.Transaksi;
import model.Penyewa;

public class TransaksiDAO {

    private DbConnection dbCon = new DbConnection();
    private Connection con;

    public void insertTransaksi(Transaksi t) {
        con = dbCon.makeConnection();
        String sql = "insert into transaksi(id, idPeminjaman, statusPembayaran, tanggal, totalHarga) values ('"
                + t.getId() + "','" + t.getPeminjamanLapangan().getIdPeminjaman() + "','" + t.getStatusPembayaran() + "','"
                + t.getTanggal() + "','" + t.getTotalHarga() + "')";
        System.out.println("Adding transaksi");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Transaksi");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding transaksi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public List<Transaksi> showTransaksi(String query) {
        con = dbCon.makeConnection();
        String sql = "SELECT t.*, pl.*, py.*, k.*, l.*\n"
                + "FROM transaksi t\n"
                + "JOIN peminjamanlapangan pl ON t.idpeminjamanLapangan = pl.id\n"
                + "JOIN penyewa py ON pl.idPenyewa = py.id\n"
                + "JOIN lapangan l ON pl.idLapangan = l.id\n"
                + "JOIN karyawan k ON pl.idKaryawan = k.id\n";

        System.out.println("Mengambil transaksi...");
        List<Transaksi> list = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Karyawan k = new Karyawan(
                            rs.getString("k.nama"),
                            rs.getString("k.alamat"),
                            rs.getString("k.jenis"),
                            rs.getString("k.notelp"),
                            Integer.parseInt(rs.getString("k.id")),
                            Integer.parseInt(rs.getString("k.usia"))
                    );
                    
                    Lapangan l = new Lapangan(Integer.parseInt(rs.getString("l.id")),
                            rs.getString("l.nama"), Integer.parseInt(rs.getString("l.luas")),
                            rs.getString("l.jenis"), rs.getString("l.fasilitas"),
                            rs.getString("l.statuslapangan")
                    );
                    
                    Penyewa p = new Penyewa(
                            rs.getString("py.nama"),
                            rs.getString("py.alamat"),
                            rs.getString("py.notelp"),
                            Integer.parseInt(rs.getString("py.id")),
                            Integer.parseInt(rs.getString("py.usia"))                            
                    );
                    
                    PeminjamanLapangan pl = new PeminjamanLapangan(
                            rs.getInt("pl.id"), 
                            rs.getString("pl.tanggal"), 
                            rs.getString("pl.lamaPeminjaman"), 
                            k, l, p
                    );
                    
                    Transaksi t = new Transaksi(
                            Integer.parseInt(rs.getString("t.id")), pl,
                            rs.getString("t.statusPembayaran"),
                            rs.getString("t.tanggal"),
                            rs.getString("t.totalHarga")
                    );
                    list.add(t);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error while reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    } 

    public void updateTransaksi(Transaksi t) {
        con = dbCon.makeConnection();

        String sql = "update transaksi"
                + "set tanggal = " + t.getTanggal() + "', "
                + "statuspembayaran = " + t.getStatusPembayaran() + "', "
                + "idPeminjaman = " + t.getPeminjamanLapangan().getIdPeminjaman() + "', "
                + "where id = " + t.getId() + "'";
        System.out.println("Editing transaksi...");

    }

    public void deleteTransaksi(int id) {
        con = dbCon.makeConnection();

        String sql = "DELETE FROM transaksi where id = '" + id + "'";
        System.out.println("Deleting Transaksi...");
        try {
            Statement s = con.createStatement();
            int result = s.executeUpdate(sql);
            System.out.println("Delete " + result + " Transaksi " + id);
            s.close();
        } catch (Exception e) {
            System.out.println("Error deleting Transaksi..");
            System.out.println(e);
        }
        dbCon.closeConnection();

    }

}