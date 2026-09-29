import java.util.Scanner;
public class Latihan_6_MengurutkanASC {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen Array : ");
        int n = input.nextInt();
        int[] angka = new int[n];

        System.out.println(" masukkan " + n + " angka : ");
        for(int i = 0; i < n; i++){
            System.out.print("input ke " + (i+1) + " = ");
            angka[i] = input.nextInt();
        }
        System.out.print("sebelum diurutkan : ");
        for (int i = 0; i < n; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if(angka[j] > angka[j+1]){
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }
        System.out.print("sesudah diurutkan : ");
        for (int i = 0; i < n; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}
