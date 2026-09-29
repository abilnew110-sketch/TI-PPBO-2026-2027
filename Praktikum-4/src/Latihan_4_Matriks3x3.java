import java.util.Scanner;

public class Latihan_4_Matriks3x3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [][] matriks = new int[3][3];
        System.out.println("masukkan 9 angka untuk matriks 3x3 : ");
        for(int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print("Matriks [" + baris + "][" + kolom + "] : ");
                matriks[baris][kolom] = input.nextInt();
            }
        }
            for (int baris = 0; baris < matriks.length; baris++){
                for (int kolom = 0; kolom < matriks[baris].length; kolom++){
                    System.out.print(matriks[baris][kolom] + "\t");
                }
                System.out.println();
            }
        int totalMatriks = 0;
        for(int baris = 0; baris < matriks.length; baris++){
            for(int kolom = 0; kolom < matriks[baris].length; kolom++){
                totalMatriks += matriks[baris][kolom];
            }
        }
        System.out.print("Total Semua Elemen: " + totalMatriks);
    }
}
