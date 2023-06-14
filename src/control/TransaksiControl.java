package control;

import java.util.List;
import dao.TransaksiDAO;
import model.Transaksi;

public class TransaksiControl {
    private TransaksiDAO tDao = new TransaksiDAO();
    
    public void insertDataTransaksi(Transaksi t){
        tDao.insertTransaksi(t);
    }
    
    public void updateDataT(Transaksi t){
        tDao.updateTransaksi(t);
    }
    
    public void deleteDataT(int id){
        tDao.deleteTransaksi(id);
    }
    
    public int getLastId(){
        List<Transaksi> listTransaksi = tDao.showTransaksi("");
        int index=-1,id=0;
        for(int i=0;i<listTransaksi.size();i++){
            index++;
        }        
        id = listTransaksi.get(index).getId();
        return id;
    }
}
