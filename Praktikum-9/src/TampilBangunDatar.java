public class TampilBangunDatar {
    public static void main(String[]args){
        BangunDatar[] DaftarBangun = {
                new Persegi(82),
                new Lingkaran(5),
                new PersegiPanjang(8,8),
                new Persegi(6),
                new Lingkaran(9),
        };
        double total = 0;
        BangunDatar terbesar = DaftarBangun[0];
        for(BangunDatar BD : DaftarBangun){
            BD.tampilkanInfo();
            System.out.println();
            total += BD.hitungLuas();
            if(BD.hitungLuas() > terbesar.hitungLuas()){
                terbesar = BD;
            }
        }
        System.out.println("Total Luas: " + total);
        System.out.println();
        System.out.println("Bangun dengan Luas terbesar: " + terbesar.namaBangun +  " (" + terbesar.hitungLuas()  + ")");
    }
}
