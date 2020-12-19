package rstudio.DAOImplement;

import java.util.List;
import rstudio.model.*;

public interface implementMahasiswa {
    
    public void insert(mahasiswa b);

    public void update(mahasiswa b);

    public void delete(int id);

    public List<mahasiswa> getALL();

    public List<mahasiswa> getCariNama(String nama);
}
