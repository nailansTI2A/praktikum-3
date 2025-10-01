import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContohThrows {
    public static void bacaFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile();
        } catch (IOException e) {
            System.out.println("Terjadi error saat membaca file: " + e.getMessage());
        }
    }
}
