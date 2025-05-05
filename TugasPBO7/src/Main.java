public class Main {
    public static void main(String[] args) {
        DatabaseMahasiswa<Mahasiswa> db = new DatabaseMahasiswa<>();

        db.tambah(new Mahasiswa("Budi", "1101", 1));
        db.tambah(new MahasiswaBeasiswa("Sari", "1102", 2, 95.0));

        System.out.println("=== Data Mahasiswa ===");
        db.tampilkanSemua();
    }
}
