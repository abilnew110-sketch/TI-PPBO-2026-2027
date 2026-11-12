public class Lingkaran extends BangunDatar{
    private double Radius;

    public Lingkaran(double Radius){
        super("Lingkaran");
        this.Radius = Radius;
    }

    @Override
    public double hitungLuas(){
        return Math.PI * Radius * Radius;
    }
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * Radius;
    }
}
