public class Buku {
    String judul;
    String pengarang;
    String tahunTerbit;

    public Buku(){
        judul = "langit berwarna biru";
        pengarang = "Abdul";
        tahunTerbit = "2025";
    }
    public Buku(String judul, String pengarang, String tahunTerbit) {
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
