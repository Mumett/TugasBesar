/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.KaryawanDAO;
import java.util.List;
import model.Karyawan;
import table.TableKaryawan;
        
/**
 *
 * @author bayud
 */
public class KaryawanControl {
    private KaryawanDAO kDao = new KaryawanDAO();
    
    public void insertKaryawan(Karyawan k){
        kDao.insertKaryawan(k);
    }
    
    public List<Karyawan> showKaryawan(){
        List<Karyawan> dataKaryawan = kDao.showKaryawan();
        return dataKaryawan;
    }
    
    public TableKaryawan showKaryawan(String query){
        List<Karyawan> dataKaryawan = kDao.showKaryawanBySearch(query);
        TableKaryawan tableKaryawan = new TableKaryawan(dataKaryawan);
        
        return tableKaryawan;
    }

    public void updateKaryawan(Karyawan k, int id) {
        kDao.updateKaryawan(k, id);
    }

    public void deleteKaryawan(int id) {
        kDao.deleteKaryawan(id);
    }
    
    public Karyawan getKaryawan(String nama){
        return  kDao.getKaryawan(nama);
    }
    
}
