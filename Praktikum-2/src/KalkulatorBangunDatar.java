/*
Nama Pembuat : AbdulRazak
Nama Program : KalkulatorBangunDatar
Deskripsi : Tugas dan membuat kodingan java
*/
import java.sql.SQLOutput;
import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*inputan untuk memasukkan panjang*/
        System.out.println("Masukkan Panjang");
        double panjang = input.nextDouble();

        /*inputan untuk memasukkan lebar*/
        System.out.println("Masukkan lebar");
        double lebar = input.nextDouble();

        //rumus untuk menghitung Luas
        double LuasPersegiPanjang = panjang * lebar;

        //rumus untuk menghitung Keliling
        double KelilingPersegiPanjang = 2 * (panjang+lebar);

        //Menmapilkan nilai Luas dan Keliling
        System.out.println("Luas Persegi Panjang : " + LuasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang : " + KelilingPersegiPanjang);

        /*Menerima Inputan untuk jari jari lingkaran*/
        System.out.println("Masukkan Jari-Jari Lingkaran");
        double JariJariLingkaran = input.nextDouble();

        //menggunakan rumus perhitungan dengan math.PI untuk luas dan keliling
        double LuasLingkaran = Math.PI * JariJariLingkaran * JariJariLingkaran;
        double KelilingLingkaran = 2 * Math.PI * JariJariLingkaran;

        //menampilkan nilai akhir dari luas dan keliling lingkaran
        System.out.println("Luas Lingkaran : " + LuasLingkaran);
        System.out.println("Keliling Lingkaran : " + KelilingLingkaran);

        /*Menampilkan nilai dari luasBesar yang sudah di deklarasi*/
        boolean luasBesar = LuasPersegiPanjang > 100;
        System.out.println("Luas Persegi Panjang : " + luasBesar);

        //Menutup semua inputan dari awal.
        input.close();

    }
}