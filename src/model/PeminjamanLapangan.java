package model;

public class PeminjamanLapangan {
    private int idPeminjaman;
    private String tanggal;
    private String lamaPeminjaman;
    private Karyawan karyawan;
    private Lapangan lapangan;
    private Penyewa penyewa;

    public PeminjamanLapangan(int idPeminjaman, String tanggal, String lamaPeminjaman, Karyawan karyawan, Lapangan lapangan, Penyewa penyewa) {
        this.idPeminjaman = idPeminjaman;
        this.tanggal = tanggal;
        this.lamaPeminjaman = lamaPeminjaman;
        this.karyawan = karyawan;
        this.lapangan = lapangan;
        this.penyewa = penyewa;
    }

    public PeminjamanLapangan(String tanggal, String lamaPeminjaman, Karyawan karyawan, Lapangan lapangan, Penyewa penyewa) {
        this.tanggal = tanggal;
        this.lamaPeminjaman = lamaPeminjaman;
        this.karyawan = karyawan;
        this.lapangan = lapangan;
        this.penyewa = penyewa;
    }    
    
    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    public void setLamaPeminjaman(String lamaPeminjaman) {
        this.lamaPeminjaman = lamaPeminjaman;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public Lapangan getLapangan() {
        return lapangan;
    }

    public void setLapangan(Lapangan lapangan) {
        this.lapangan = lapangan;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    
    
}