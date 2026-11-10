public class TampilBangunDatar {
    public static void main(String[]args){
        BangunDatar A = new BangunDatar();
        BangunDatar B = new Persegi(93);
        BangunDatar C = new Lingkaran(7);
        System.out.println("Bangun Datar: " + A.hitungLuas());
        System.out.println("Bangun Datar Persegi: " + B.hitungLuas());
        System.out.printf("Bangun Datar Lingkaran: " + C.hitungLuas());
    }
}
