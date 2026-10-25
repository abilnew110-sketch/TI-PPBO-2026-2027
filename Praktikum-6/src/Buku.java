public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(){
        judul = "langit berwarna biru";
        pengarang = "Abdul";
        tahunTerbit = 2025;
    }
    public Buku(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public void tampilkanBuku(){
        System.out.println("judul : " + judul);
        System.out.println("pengarang : " + pengarang);
        System.out.println("tahun Terbit : " + tahunTerbit);
    }
}
