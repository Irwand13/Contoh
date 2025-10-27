public class Main {
    public static void main(String[] args) {
        System.out.println("=== Program Nota Restoran ===");
        double harga = 20000;
        double pajak = harga * 0.10;
        double total = harga + pajak;

        System.out.println("Pesanan: Nasi Goreng");
        System.out.println("Harga: Rp" + harga);
        System.out.println("Pajak (10%): Rp" + pajak);
        System.out.println("Total Bayar: Rp" + total);
    }
}
