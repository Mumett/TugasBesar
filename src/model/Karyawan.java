/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bayud
 */
public class Karyawan {
    private String nama, alamat, jenis, notelp;
    private int id, usia;

    public Karyawan(String nama, String alamat, String jenis, String notelp, int id, int usia) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenis = jenis;
        this.notelp = notelp;
        this.id = id;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public String showKaryawan(){
        return
                this.id + " | "
                + this.nama + " | "
                + this.usia + " | "
                + this.jenis + " | "
                + this.alamat + " | "
                + this.notelp + " | ";               
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
}
