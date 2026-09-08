public class OperatorDemo {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("Jumlah: " + (a + b));
        System.out.println("Selisih: " + (a - b));
        System.out.println("kali: " + (a * b));
        System.out.println("bagi: " + (a / b));
        System.out.println("sisa bagi: " + (a % b));

        int nilaiUjian = 80;
        boolean hadir = true;
        System.out.println("Lulus (>=75): " + (nilaiUjian >=75));
        System.out.println("Lulus DAN hadir: " + (nilaiUjian >= 75 && hadir));
    }
}
