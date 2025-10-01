public class ContohThrow {
    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        cekUmur(20);  // valid
        cekUmur(15);  // akan melempar exception
    }
}
