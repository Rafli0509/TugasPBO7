public class Mahasiswa extends Person {
    protected int kelas;

    public Mahasiswa(String nama, String nim, int kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Kelas: " + kelas);
    }
}
