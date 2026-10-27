public class Daftar_Persegi {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = new Persegi[4];
        daftarPersegi[0] = new Persegi(4.0);
        daftarPersegi[1] = new Persegi(12.0);
        daftarPersegi[2] = new Persegi(6.0);
        daftarPersegi[3] = new Persegi(9.4);

        Persegi persegiTerbesar = daftarPersegi[0];
        for (Persegi p : daftarPersegi){
            if (p.hitungLuas() > persegiTerbesar.hitungLuas()){
                persegiTerbesar = p;
            }
        }
        System.out.println("Sisi Persegi Terbesar: " + persegiTerbesar.getSisi());
        System.out.println("Luas Persegi Terbesar: " + persegiTerbesar.hitungLuas());
    }
}
