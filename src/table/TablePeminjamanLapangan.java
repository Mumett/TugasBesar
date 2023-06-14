package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.PeminjamanLapangan;

public class TablePeminjamanLapangan extends AbstractTableModel{
    private List<PeminjamanLapangan> list;

    public TablePeminjamanLapangan(List<PeminjamanLapangan> list) {
        this.list = list;
    }

    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 7;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getIdPeminjaman();
            case 1:
                return list.get(rowIndex).getTanggal();
            case 2:
                return list.get(rowIndex).getLamaPeminjaman();
            case 3:
                return list.get(rowIndex).getKaryawan().getNama();
            case 4:
                return list.get(rowIndex).getLapangan().getNama1();
            case 5:
                return list.get(rowIndex).getLapangan().getStatusLapangan();
            case 6:
                return list.get(rowIndex).getPenyewa().getNama();
            case 7:
                return list.get(rowIndex).getKaryawan().getId();
            case 8:
                return list.get(rowIndex).getLapangan().getId();
            case 9:
                return list.get(rowIndex).getPenyewa().getId();
            default:
                return null;
        }
    }
    
     public String getColumnName(int column){
         switch(column){
             case 0:
                 return "ID Peminjaman";
             case 1:
                 return "Tanggal";
             case 2:
                 return "Waktu";
             case 3:
                 return "Karyawan yang Bertanggung Jawab";
             case 4:
                 return "Nama Lapangan";
             case 5:
                 return "Status Lapangan";
             case 6:
                 return "Nama Penyewa";
             default:
                return null;
         }
     }
}
