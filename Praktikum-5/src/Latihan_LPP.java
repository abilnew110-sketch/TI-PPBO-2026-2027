public class Latihan_LPP {
    static double luasPersegiPanjang(double p, double l){
        return (p * l);
    }
    static double luasLingkaran(double r){
        return (Math.PI * r * r);
    }
    static void main(String[]args){
        double hasil = luasPersegiPanjang(27, 12);
        System.out.println("luas persegi panjang adalah : " + hasil);
        double hasilLingkaran = luasLingkaran(12);
        System.out.print("luas Lingkaran adalah : " + hasilLingkaran);
    }
}
