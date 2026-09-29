import java.util.Scanner;

public class Latihan_3_UkuranArray {
    public static void main(String[]args){
        Scanner A = new Scanner(System.in);
        int[] angka = new int[10];
        System.out.println("Masukkan 10 angka : ");
        for (int i = 0; i <= 9; i++){
            angka[i] = A.nextInt();
        }
        System.out.println("Angka setelah dibalik : ");
        for (int i = 9; i >= 0; i--){
                System.out.println("angka = " + angka[i]);
        }
    }
}
