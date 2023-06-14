/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Lapangan;

/**
 *
 * @author bayud
 */
public class TableLapangan extends AbstractTableModel {

    private List<Lapangan> list;

    public TableLapangan(List<Lapangan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama1();
            case 2:
                return list.get(rowIndex).getLuas();
            case 3:
                return list.get(rowIndex).getJenis();
            case 4:
                return list.get(rowIndex).getFasilitas();
            case 5:
                return list.get(rowIndex).getStatusLapangan();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Luas";
            case 3:
                return "Jenis";
            case 4:
                return "Fasilitas";
            case 5:
                return "Status Lapangan";
            default:
                return null;
        }
    }

}
