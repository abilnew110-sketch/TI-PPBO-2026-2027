public class Buku_Tampil {
    public static void main(String[] args) {
        Buku B1 = new Buku();
        B1.judul = "Matahari di langit";
        B1.pengarang = "Razak";
        B1.tahunTerbit = "2025";
        Buku B2 = new Buku("langit cerah","Abdul","2024");
        B2.tampilkanBuku();
        System.out.println(B1.judul + " - " + B1.pengarang + " - " + B1.tahunTerbit);
    }
}
