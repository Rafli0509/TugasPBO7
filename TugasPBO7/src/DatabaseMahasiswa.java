import java.util.ArrayList;

public class DatabaseMahasiswa<T extends Mahasiswa> {
    private ArrayList<T> data = new ArrayList<>();

    public void tambah(T mhs) {
        data.add(mhs);
    }

    public void tampilkanSemua() {
        for (T m : data) {
            m.tampilkanInfo();
        }
    }
}
