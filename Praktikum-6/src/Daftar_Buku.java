public class Daftar_Buku {

    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku("Laskar Pelangi", 2011);
        daftarBuku[1] = new Buku("Bumi", 2014);
        daftarBuku[2] = new Buku("Filosofi Teras", 2018);
        daftarBuku[3] = new Buku("Laut Bercerita", 2019);

        System.out.println("Buku yang terbit setelah tahun 2015 adalah: ");
        for(Buku b : daftarBuku){
            if(b.tahunTerbit > 2015){
                System.out.println(" - " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}
