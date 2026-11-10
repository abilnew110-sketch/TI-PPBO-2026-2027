public class Lingkaran extends BangunDatar{
    private double Radius;

    public Lingkaran(double Radius){
        this.Radius = Radius;
    }

    @Override
    public double hitungLuas(){
        return Math.PI * Radius * Radius;
    }
}
