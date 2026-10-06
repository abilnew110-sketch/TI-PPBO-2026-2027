import java.util.Scanner;
public class Latihan_NilaiMaksimum {
    static int cariMinimum(int[] data){
        int Min = data[0];
        for(int nilai : data){
            if(nilai < Min){
                Min = nilai;
            }
        }
        return Min;
    }
    static int cariMaksimum(int[] data){
        int max = data[0];
        for(int nilai : data){
            if(nilai > max){
                max = nilai;
            }
        }
        return max;
    }
    public static void main(String[]args) {
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan Total Data yang diinginkan : ");
        int total = nilai.nextInt();
        int[] data = new int[total];
        for(int i = 0; i < total; i++){
            System.out.println("nilai ke - " + (i + 1) + " : ");
            data[i] = nilai.nextInt();
        }
        System.out.println("Nilai minimum : " + cariMinimum(data));
        System.out.println("Nilai Maksimum : " + cariMaksimum(data));
    }
}
