import java.util.Scanner;
public class HitungTarifListrik {
    public static void main(String[]args){
        double tarif_450 = 415;
        double tarif_900 = 1325;
        double tarif_1300 = 1444.70;
        double tarif_2200 = 1444.70;
        double tarif_diatas_2200 = 1699.3;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan golongan listrik anda (450, 900, 1300, 2200, atau diatas 2200) : ");
        int golongan = input.nextInt();

        System.out.println("masukkan jumlah penggunaan listrik anda ");
        int jumlahPenggunaan = input.nextInt();
        if(jumlahPenggunaan < 0 || jumlahPenggunaan == 0){
            System.out.println("jumlah penggunaan harus lebih dari 0");
            input.close();
            return;
        }
        double tarifperkwh = 0;
        boolean golonganvalid = true;

        if(golongan == 450){
            tarifperkwh = tarif_450;
        } else if(golongan == 900){
            tarifperkwh = tarif_900;
        } else if(golongan == 1300){
            tarifperkwh = tarif_1300;
        } else if(golongan == 2200){
            tarifperkwh = tarif_2200;
        } else if(golongan > 2200){
            tarifperkwh = tarif_diatas_2200;
        } else {
            System.out.println("golongan tidak ada");
            golonganvalid = false;
        }
        double TotalTagihan = 0;
        if(golonganvalid){
            TotalTagihan = jumlahPenggunaan * tarifperkwh;
        }
        System.out.println("Golongan Daya " + golongan);
        System.out.println("Jumlah Pemakaian " + jumlahPenggunaan);
        System.out.println("Tarif Per Kwh : " + tarifperkwh);
        System.out.println("Total Tagihan : " + TotalTagihan);
    }
}