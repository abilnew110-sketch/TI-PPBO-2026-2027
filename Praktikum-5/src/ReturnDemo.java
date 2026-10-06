public class ReturnDemo {
    static int tambah(int a, int b){
        return a + b;
    }
    static boolean IsGenap(int angka){
        return angka % 2 == 0;
    }
    static void main(String[]args){
        int hasil = tambah(15, 7);
        System.out.println("Hasil Tambah : " + hasil);

        System.out.println("apakah 8 genap? " + IsGenap(8));
        System.out.println("apakah 7 genap? " + IsGenap(7));
    }
}
