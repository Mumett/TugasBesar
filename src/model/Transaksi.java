package model;

public class Transaksi {
    private int id;
    private PeminjamanLapangan peminjamanLapangan;
    private String statusPembayaran, tanggal, totalHarga;

    public Transaksi(int id, PeminjamanLapangan peminjamanLapangan, String statusPembayaran, String tanggal, String totalHarga) {
        this.id = id;
        this.peminjamanLapangan = peminjamanLapangan;
        this.statusPembayaran = statusPembayaran;
        this.tanggal = tanggal;
        this.totalHarga = totalHarga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PeminjamanLapangan getPeminjamanLapangan() {
        return peminjamanLapangan;
    }

    public void setPeminjamanLapangan(PeminjamanLapangan peminjamanLapangan) {
        this.peminjamanLapangan = peminjamanLapangan;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    } 
}