import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data
        mahasiswa.put("123", "Naila");
        mahasiswa.put("124", "Iman");
        mahasiswa.put("125", "Tita");

        // Mengakses data
        System.out.println("NIM 123: " + mahasiswa.get("123"));

        // Menampilkan semua data
        for (String key : mahasiswa.keySet()) {
            System.out.println("NIM: " + key + ", Nama: " + mahasiswa.get(key));
        }
    }
}
