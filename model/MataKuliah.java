package model;

public class MataKuliah {
    public String namaMataKuliah;
    public int sks;

    public MataKuliah(String nama, int sks) {
        this.namaMataKuliah = nama;
        this.sks = sks;
    }

    public void tampil() {
        System.out.println(namaMataKuliah + " - " + sks + " SKS");
    }

    public static void main(String[] args) {
        MataKuliah mk = new MataKuliah("Pemrograman Java", 3);
        mk.tampil();
    }
}
