public class ContohException {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // error: pembagian dengan nol
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }
    }
}
