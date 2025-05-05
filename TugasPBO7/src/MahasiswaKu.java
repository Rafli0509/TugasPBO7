public class MahasiswaKu {
    public static void main(String[] args) {
        MahasiswaGeneric<String, Integer> m = new MahasiswaGeneric<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
