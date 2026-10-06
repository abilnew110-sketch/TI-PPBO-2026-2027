import java.util.Arrays;
import java.util.Scanner;
public class Latihan_hitungTotal {
    static int hitungTotal(int[] data){
        int total = 0;
        for(int nilai : data){
            total += nilai;
        }
        return total;
    }
    static  int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) return new int[0];
        int total = hitungTotal(data);
        double RataRata = (double) total / data.length;
        int counter = 0;
        for (int nilai : data) {
            if (nilai > RataRata) {
                counter++;
            }
        }
        int[] hasilfilter = new int[counter];
        int index = 0;
        for (int nilai : data) {
            if (nilai > RataRata) {
                hasilfilter[index] = nilai;
                index++;
            }
        }
        return hasilfilter;
    }
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array : ");
        int n = a.nextInt();
        int[] data = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("masukkan Array ke - " + (i + 1) + " : ");
            data[i] = a.nextInt();
        }
        int total = hitungTotal(data);
        int[] dataLolos = filterDiAtasRataRata(data);
        System.out.println("Total Nilai Array : " + total);
        System.out.println("Elemen diatas Rata Rata : " + Arrays.toString(dataLolos));

        a.close();
    }
}
