public class Direktur extends Manager{
    private double TunjanganSaham;
    public Direktur(String nama, String nip, double gajiPokok, double TunjanganJabatan, double TunjanganSaham){
        super(nama, nip, gajiPokok, TunjanganJabatan);
        this.TunjanganSaham= TunjanganSaham;
    }
    public double getTunjanganSaham(){
        return TunjanganSaham;
    }
}
