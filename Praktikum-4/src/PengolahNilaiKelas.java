import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final int batas = 70;
        System.out.print("masukkan jumlah mahasiswa : ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        int totalnilai = 0;
        System.out.println("masukkan nilai masing masing mahasiswa : ");
        for (int i = 0; i < n; i++){
            System.out.print("nilai mahasiswa ke "+ (i+1) + " = ");
            nilai[i] = input.nextInt();
            totalnilai += nilai[i];
        }
        double rataRata = (double) totalnilai / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahlulus = 0;
        int jumlahtidaklulus = 0;

        for (int i = 0; i < n; i++){
            if (nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah){
                terendah = nilai[i];
            }
            if (nilai[i] >= batas) {
                jumlahlulus++;
            }
                else {
                    jumlahtidaklulus++;
                }
            }
        System.out.println("nilai rata-rata : " + rataRata);
        System.out.println("nilai tertinggi : " + tertinggi);
        System.out.println("nilai terendah : " + terendah);
        System.out.println("jumlah lulus : " + jumlahlulus);
        System.out.println("jumlah tidak lulus : " + jumlahtidaklulus);
    }
}