/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Karyawan;
/**
 *
 * @author Lenovo
 */
public class TableKaryawan extends AbstractTableModel{
    private List<Karyawan> list;

    public TableKaryawan(List<Karyawan> list) {
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
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getUsia();
            case 3:
                return list.get(rowIndex).getAlamat();
            case 4:
                return list.get(rowIndex).getJenis();
            case 5:
                return list.get(rowIndex).getNotelp();
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
                return "Usia";
            case 3:
                return "Alamat";
            case 4:
                return "Jenis";
            case 5:
                return "Nomor Telepon";
            default:
                return null;
        }
    }
}
