import java.util.Scanner;
public class KalkulatorMethod {
    static double tambah(double a, double b) {
        return a + b;
    }
    static double tambah(double a, double b, double c){
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("tidak valid bagi dengan 0");
            return Double.NaN;
        }
        return a / b;
    }

    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("akar tidak bisa bagi 0 = tak terbatas");
        }
        return Math.sqrt(angka);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahData) {
        if (jumlahData == 0) {
            return 0;
        }
        double maksimum = riwayatHasil[0];
        for (int i = 1; i < jumlahData; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        double[] riwayatHasil = new double[100];
        int jumlahData = 0;
        int pilihan;
        do {
            System.out.println(" masukkan angka 1 - 8 : ");
            System.out.println(" 1.) Tambah(2 angka) : ");
            System.out.println(" 2.) Tambah(3 angka) : ");
            System.out.println(" 3.) Kurang : ");
            System.out.println(" 4.) kali : ");
            System.out.println(" 5.) bagi : ");
            System.out.println(" 6.) pangkat : ");
            System.out.println(" 7.) akar kuadrat : ");
            System.out.println(" 8.) keluar : ");
            System.out.print(" apa pilihan anda : ");
            pilihan = nilai.nextInt();

            double a,b,c, hasil = 0;
            boolean simpanData = true;

            switch(pilihan){
                case 1:
                    System.out.print("Masukkan angka 1 : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan angka 2 : ");
                    b = nilai.nextDouble();
                    hasil = tambah(a,b);
                    System.out.println("Hasil : "+ hasil);
                    break;
                case 2:
                    System.out.print("Masukkan angka 1 : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan angka 2 : ");
                    b = nilai.nextDouble();
                    System.out.print("Masukkan angka 3 : ");
                    c = nilai.nextDouble();
                    hasil = tambah(a,b,c);
                    System.out.println("hasil : " + hasil);
                    break;
                case 3:
                    System.out.print("Masukkan angka 1 : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan angka 2 : ");
                    b = nilai.nextDouble();
                    hasil = kurang(a,b);
                    System.out.println("hasil : " + hasil);
                    break;
                case 4:
                    System.out.print("Masukkan angka 1 : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan angka 2 : ");
                    b = nilai.nextDouble();
                    hasil = kali(a,b);
                    System.out.println("hasil : " + hasil);
                    break;
                case 5:
                    System.out.print("Masukkan angka 1 : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan angka 2 : ");
                    b = nilai.nextDouble();
                    hasil = bagi(a,b);
                    if(Double.isNaN(hasil)) simpanData = false;
                    else System.out.println("Hasil : " + hasil);
                    break;
                case 6:
                    System.out.print("Masukkan angka basis : ");
                    a = nilai.nextDouble();
                    System.out.print("Masukkan pangkat : ");
                    b = nilai.nextDouble();
                    hasil = pangkat(a,b);
                    System.out.println("hasil : " + hasil);
                    break;
                case 7:
                    System.out.print("Masukkan angka : ");
                    a = nilai.nextDouble();
                    hasil = akarKuadrat(a);
                    if(Double.isNaN(hasil)) simpanData = false;
                    else System.out.println("hasil : " + hasil);
                    break;
                case 8:
                    simpanData = false;
                    System.out.println("keluar program");
                    break;
                default:
                    simpanData = false;
                    System.out.println("pilihan tidak ada bos");
            }
            if(simpanData && jumlahData < riwayatHasil.length){
                riwayatHasil[jumlahData] = hasil;
                jumlahData++;
            }
        }
        while (pilihan != 8);
        double maksimum = riwayatKeMaksimum(riwayatHasil, jumlahData);
        System.out.println(" ==Hasilnya== ");
        System.out.println("Jumlah perhitungan : " + jumlahData);
        System.out.println("Nilai riwayat terbesar : " + maksimum);

        nilai.close();
    }
}