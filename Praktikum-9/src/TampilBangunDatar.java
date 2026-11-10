public class TampilBangunDatar {
    public static void main(String[]args){
        BangunDatar[] DaftarBangun = {
                new Persegi(82),
                new Lingkaran(5),
        };
        double total = 0;
        for(BangunDatar BD : DaftarBangun){
            total += BD.hitungLuas();
        }
        BangunDatar A = new BangunDatar();
        BangunDatar B = new Persegi(93);
        BangunDatar C = new Lingkaran(7);
        System.out.println("Bangun Datar: " + A.hitungLuas());
        System.out.println("Bangun Datar Persegi: " + B.hitungLuas());
        System.out.println("Bangun Datar Lingkaran: " + C.hitungLuas());
        System.out.println("TOTAL LUAS: " + total);
    }
}
