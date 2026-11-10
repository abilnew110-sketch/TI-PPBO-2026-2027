public class Staff extends Pegawai{
    private double tunjanganKerja;
    public double getTunjanganKerja(){
        return tunjanganKerja;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok + tunjanganKerja;
    }

    public Staff(String nama, String nip, double gajiPokok, double tunjanganKerja){
        super(nama, nip, gajiPokok);
        this.tunjanganKerja = tunjanganKerja;
    }
}
