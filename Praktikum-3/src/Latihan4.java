import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int umur;
        boolean mahasiswa;
        Scanner scan = new Scanner(System.in);

        System.out.println("apakah anda mahasiswa? (true/false) ");
        mahasiswa = scan.nextBoolean();

        if (mahasiswa) {
            System.out.print("Masukkan umur anda : ");
            umur = scan.nextInt();
        } else {
            System.out.print("Masukkan umur anda : ");
            umur = scan.nextInt();
        }
        if (mahasiswa && umur < 25) {
            System.out.println("anda mendapatkan harga khusus yaitu : Rp.50000");
        } else {
            System.out.println("anda mendapatkan harga standar yaitu : Rp.100000");
        }
    }
}