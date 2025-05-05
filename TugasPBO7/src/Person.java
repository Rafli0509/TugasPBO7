public abstract class Person {
    protected String nama;
    protected String nim;

    public Person(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public abstract void tampilkanInfo();
}
