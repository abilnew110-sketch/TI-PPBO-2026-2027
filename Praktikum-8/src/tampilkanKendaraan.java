public class tampilkanKendaraan {
    public static void main(String[] args) {
        Mobil M1 = new Mobil("avanza", 150, 4);
        Motor M2 = new Motor("beat", 100, "Manual");
        System.out.println();
        M1.tampilkanInfo();
    }
}
