/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bayud
 */
public class Lapangan {
    private String nama, jenis, fasilitas, statusLapangan;
    private int id, luas;

    public Lapangan(int id, String nama, int luas, String jenis, String fasilitas, String statusLapangan) {
        this.id = id;
        this.nama = nama;
        this.luas = luas;
        this.jenis = jenis;
        this.fasilitas = fasilitas;
        this.statusLapangan = statusLapangan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama1() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getStatusLapangan() {
        return statusLapangan;
    }

    public void setStatusLapangan(String statusLapangan) {
        this.statusLapangan = statusLapangan;
    }
    
    @Override
    public String toString() {
        return nama;
    }
    
}
