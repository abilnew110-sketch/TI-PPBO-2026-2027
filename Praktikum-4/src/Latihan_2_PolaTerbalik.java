import java.util.Scanner;
public class Latihan_2_PolaTerbalik {
    public static void main(String[]args){
        Scanner Pola = new Scanner(System.in);
        int input;
        int tinggi = 5;
        for (int i = tinggi; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("masukkan angka yang ingin pola terbalik : ");
        input = Pola.nextInt();
        for(int i = input; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
