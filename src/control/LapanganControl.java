/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.LapanganDAO;
import java.util.List;
import javax.swing.table.TableModel;
import model.Lapangan;
import table.TableLapangan;

/**
 *
 * @author bayud
 */
public class LapanganControl {
    private LapanganDAO lDao = new LapanganDAO();
    
    public void insertDataLapangan(Lapangan l){
        lDao.insertLapangan(l);
    }
    
    public TableLapangan showDataLapangan(String query){
        List<Lapangan> dataLapangan = lDao.showLapBySearch(query);
        TableLapangan tableLapangan = new TableLapangan(dataLapangan);
        return tableLapangan;
    }
    
    public List<Lapangan> showListLap(){
        List<Lapangan> l = lDao.showLapangan();
        return l;
    } 
              
    public Lapangan searchDataLapangan(int id) {
        Lapangan l = null;
        l = lDao.searchLapangan(id);
        return l;
    }

    public void updateDataLapangan(Lapangan l, int id) {
        lDao.updateLapangan(l,id);
    }

    public void deleteDataLapangan(int id) {
        lDao.deleteLapangan(id);
    }
    
    public Lapangan getLapangan(String nama){
        return lDao.getLapangan(nama);
    }
    
}
