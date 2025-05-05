public class MahasiswaBeasiswa extends Mahasiswa {
    private double nilaiBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, int kelas, double nilaiBeasiswa) {
        super(nama, nim, kelas);
        this.nilaiBeasiswa = nilaiBeasiswa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nilai Beasiswa: " + nilaiBeasiswa);
    }
}
