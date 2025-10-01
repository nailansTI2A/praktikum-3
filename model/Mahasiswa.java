package model;

public class Mahasiswa {
    public String nama;
    public float ipk;

    public Mahasiswa(String nama, float ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("Nama : " + nama + ", IPK : " + ipk);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Naila", 3.75f);
        mhs.tampil();
    }
}
