public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    //Contruktor default (tanpa parameter)
    public Mahasiswa(){
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
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
