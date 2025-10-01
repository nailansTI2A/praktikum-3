package view;

import model.Mahasiswa;

public class MahasiswaView {

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa = new Mahasiswa(); // perbaikan
        mahasiswa.ipk = 3.7f;

        System.out.println("IPK Mahasiswa: " + mahasiswa.ipk);
    }

}
