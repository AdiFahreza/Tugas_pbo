
package rstudio.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelMahasiswa  extends AbstractTableModel{
    
    List<mahasiswa> lb;

    public tableModelMahasiswa(List<mahasiswa> lb) {
        this.lb = lb;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }


    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "Nim";
            case 2 -> "Nama";
            case 3 -> "Kelamin";
            case 4 -> "Alamat";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> lb.get(row).getId();
            case 1 -> lb.get(row).getNim();
            case 2 -> lb.get(row).getNama();
            case 3 -> lb.get(row).getJk();
            case 4 -> lb.get(row).getAlamat();
            default -> null;
        };
    }
}

