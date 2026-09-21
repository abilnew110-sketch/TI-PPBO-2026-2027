import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("masukkan angka 1 : ");
        int angka1 = scan.nextInt();

        System.out.println("masukkan angka 2 : ");
        int angka2 = scan.nextInt();

        System.out.println("masukkan angka 3 : ");
        int angka3 = scan.nextInt();

        if(angka1 == angka2 && angka1 == angka3){
            System.out.println("semua angka setara");
        } else if (angka1 > angka2 && angka1 > angka3){
            System.out.println("angka 1 terbesar yaitu : " + angka1);
        } else if (angka2 > angka1 && angka2 > angka3){
            System.out.println("angka 2 terbesar yaitu : " + angka2);
        } else if (angka3 > angka1 && angka3 > angka2){
            System.out.println("angka 3 terbesar yaitu : " + angka3);
        } else {
            System.out.println("tidak bisa dihitung");
        }
    }
}