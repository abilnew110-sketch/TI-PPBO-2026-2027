import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("masukkan menu yang anda inginkan(1-4) : ");
        int menu = scan.nextInt();
        switch(menu) {
            case 1:
                System.out.println("menu 1 yaitu nasi goreng");
                break;
            case 2:
                System.out.println("menu 2 yaitu mie ayam");
                break;
            case 3:
                System.out.println("menu 3 yaitu nasi pecal lele");
                break;
            case 4:
                System.out.println("menu 4 yaitu nasi briyani");
                break;
            default:
                System.out.println("makanan tidak ada di list");
        }
    }
}