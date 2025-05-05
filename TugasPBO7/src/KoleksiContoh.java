import java.util.ArrayList;
import java.util.ArrayDeque;

public class KoleksiContoh {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Budi");
        namaMahasiswa.add("Ani");
        namaMahasiswa.add("Siti");

        System.out.println("=== Daftar Mahasiswa (ArrayList) ===");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }

        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("Budi");
        antrian.add("Ani");
        antrian.add("Siti");

        System.out.println("\n=== Antrian Mahasiswa (ArrayDeque) ===");
        while (!antrian.isEmpty()) {
            System.out.println("Diproses: " + antrian.poll());
        }
    }
}
