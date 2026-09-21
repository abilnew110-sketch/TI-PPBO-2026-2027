import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan angka");
        int angka = input.nextInt();

        if (angka % 2 != 0){
            System.out.println("ganjil");
        } else {
            System.out.println("genap");
        }
    }
}
