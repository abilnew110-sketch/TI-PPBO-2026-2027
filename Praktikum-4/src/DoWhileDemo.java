import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int angka;

        do{
            System.out.println("Masukkan angka (0 untuk keluar)");
            angka = sc.nextInt();
            System.out.println("Anda Memasukkan Angka " + angka);
        } while(angka != 0);
        System.out.println("Program berhenti");
    }
}