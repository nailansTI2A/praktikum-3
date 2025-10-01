import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();

        // Menambah data
        nama.add("Naila");
        nama.add("Linggar");
        nama.add("Julita");

        // Mengakses data
        System.out.println("Nama pertama: " + nama.get(0));

        // Looping
        for (String n : nama) {
            System.out.println("Nama: " + n);
        }
    }
}
