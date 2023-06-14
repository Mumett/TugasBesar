/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bayud
 */
public class Penyewa {
    private String nama, alamat, notelp;
    private int id, usia;

    public Penyewa(String nama, String alamat, String notelp, int id, int usia) {
        this.nama = nama;
        this.alamat = alamat;
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
    
    public String showPenyewa(){
        return
                this.id + " | "
                + this.nama + " | "
                + this.usia + " | "
                + this.alamat + " | "
                + this.notelp + " | ";               
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
