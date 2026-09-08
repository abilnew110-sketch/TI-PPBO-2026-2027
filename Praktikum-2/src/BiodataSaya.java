import java.util.Scanner;

public class BiodataSaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka2: ");
        int angka2 = sc.nextInt();

        System.out.println("Jumlah : " + (angka1 + angka2));
        System.out.println("Selisih : " + (angka1 - angka2));
        System.out.println("kali : " + (angka1 * angka2));
        System.out.println("bagi : " + (angka1 / angka2));
        System.out.println("sisa bagi : " + (angka1 % angka2));

        System.out.println(angka1 + " > " + angka2 + " : " + (angka1 > angka2));
        System.out.println(angka1 + " < " + angka2 + " : " + (angka1 < angka2));
        System.out.println(angka1 + " == " + angka2 + " : " + (angka1 == angka2));
    }
}
