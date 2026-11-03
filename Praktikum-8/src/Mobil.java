public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String merk, double kecepatanMaks, int jumlahPintu){
        super(merk,kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
        System.out.println("Merek Mobil: " + merk);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
