public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok){
        this.nama = nama;
        this.nip = nip;
        setgajiPokok(gajiPokok);
    }
    public void setgajiPokok(double gajiPokok){
        if(gajiPokok < 0){
            this.gajiPokok = 0;
            System.out.println("Gaji Pokok tidak valid");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }
    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("nip: " + nip);
        System.out.println("gajiPokok: " + gajiPokok);
    }
}
