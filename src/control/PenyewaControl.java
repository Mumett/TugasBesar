/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PenyewaDAO;
import java.util.List;
import model.Penyewa;
/**
 *
 * @author bayud
 */
public class PenyewaControl {
    private PenyewaDAO pDao = new PenyewaDAO();
    
    public void insertPenyewa(Penyewa p){
        pDao.insertPenyewa(p);
    }
    
    public List<Penyewa> showPenyewa(){
        List<Penyewa> dataPenyewa = pDao.showPenyewa();
        return dataPenyewa;
    }
    
    public Penyewa searchPenyewa(int id) {
        Penyewa p = null;
        p = pDao.searchPenyewa(id);
        return p;
    }

    public void updatePenyewa(Penyewa p, int id) {
        pDao.updatePenyewa(p, id);
    }

    public void deletePenyewa(int id) {
        pDao.deletePenyewa(id);
    }
    
    public Penyewa getPenyewa(String nama){
        return pDao.getPenyewa(nama);
    }
}
