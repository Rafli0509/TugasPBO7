public class MahasiswaGeneric<T, U> {
    private T nim;
    private String name;
    private U clas;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClas(U clas) {
        this.clas = clas;
    }

    public T getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public U getClas() {
        return clas;
    }
}
