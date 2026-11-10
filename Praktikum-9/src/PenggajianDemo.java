public class PenggajianDemo {
    public static void main(String[]args){
        Pegawai[] daftarPegawai = {
                new Manager("Budi","M001",1500000,20000),
                new Staff("Siti","S001",700000,15000),
                new Staff("Andi", "S002",900000,17000),
        };
        double totalGaji = 0;
        for (Pegawai pg : daftarPegawai){
            double gaji = pg.hitungGaji();
            System.out.println(pg.nama + ": " + gaji);
            totalGaji += gaji;
        }
        System.out.println("Total Gaji: " + totalGaji);

        Direktur d = new Direktur("Razak","2025",1500000,500000,250000);
        System.out.println("Gaji Direktur: " + d.hitungGaji());
    }
}
