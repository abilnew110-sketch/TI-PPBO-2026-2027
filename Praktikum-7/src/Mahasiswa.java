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
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public double getIpk(){
        return ipk;
    }
    public void tampilkanData(){
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("ipk: " + ipk);
    }
    public boolean isCumlaude(){
        return ipk >= 3.5;
    }
    public void setIpk(double ipk){
        if(ipk >= 0.0 && ipk <= 4.0){
            this.ipk = ipk;
        } else {
            System.out.println("Ipk tidak valid, harus 0.0 - 4.0");
        }
    }
}
