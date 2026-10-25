public class Tampil_Persegi {
    public static void main(String[]args){
        Persegi persegi1 = new Persegi(95);

        cetakInfoPersegi(persegi1, "Pertama");
    }
    public static void cetakInfoPersegi(Persegi p, String nama){
        System.out.println("Panjang sisi: " + p.getSisi());
        System.out.println("Luas: " + p.hitungLuas());
        System.out.println("Keliling: " + p.hitungKeliling());
    }
}
