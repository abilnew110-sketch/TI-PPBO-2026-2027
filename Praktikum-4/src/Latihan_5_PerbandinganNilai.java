import java.util.Scanner;

public class Latihan_5_PerbandinganNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen yang diinginkan (minimal 2) : ");
        int n = input.nextInt();
        if (n < 2) {
            System.out.println("Jumlah elemen minimal 2");
            return;
        }
        int[] angka = new int[n];
        System.out.println("masukkan " + n + " angka: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Input ke - " + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }
        int terbesar = angka[0];
        int terbesarKedua = angka[0];
        for (int i = 0; i < n; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (angka[i] != terbesar) {
                if (!ditemukan || angka[i] > terbesarKedua) {
                    terbesarKedua = angka[i];
                    ditemukan = true;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada terbesar kedua (keduanya sama)");
        } else {
            System.out.println("nilai terbesar kedua : " + terbesarKedua);
        }
    }
}
