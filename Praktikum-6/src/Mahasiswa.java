public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //Contruktor default (tanpa parameter)
    public Mahasiswa(){
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }
    public Mahasiswa(String nama, String nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public void tampilkanData(){
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("ipk: " + ipk);
    }
    public boolean isCumlaude(){
        return ipk >= 3.5;
    }
}
