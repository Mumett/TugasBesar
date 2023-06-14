package control;

import java.util.List;
import dao.PeminjamanLapanganDAO;
import model.PeminjamanLapangan;
import table.TablePeminjamanLapangan;

public class PeminjamanLapanganControl {
    private PeminjamanLapanganDAO plDAO = new PeminjamanLapanganDAO();

    public void inserDataPL(PeminjamanLapangan pl){
        plDAO.insertPeminjamanLapangan(pl);
    }
    
    public TablePeminjamanLapangan showDataPL(String query){
        List<PeminjamanLapangan> dataPL = plDAO.showPLBySearch(query);
        TablePeminjamanLapangan tablePL = new TablePeminjamanLapangan(dataPL);        
        return tablePL;
    }
    
    public void updateDataPL(PeminjamanLapangan pl){
        plDAO.update(pl);
    }
    
    public void deleteDataPL(int id){
        plDAO.delete(id);
    }
}




