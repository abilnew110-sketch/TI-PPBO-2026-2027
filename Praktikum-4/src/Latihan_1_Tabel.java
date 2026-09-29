import java.util.Scanner;

public class Latihan_1_Tabel {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nilai;
        int angka;
        System.out.println("masukan angka yang ingin anda kali: ");
        angka = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int hasil = angka * i;
            System.out.println(" hasilnya = "+ i + " = "+ hasil);
        }
    }
}
