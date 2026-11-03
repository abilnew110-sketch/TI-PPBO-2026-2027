public class Motor extends Kendaraan{
    private String jenisMotor;

    public Motor(String merk, double kecepatanMaks, String jenisMotor){
        super(merk,kecepatanMaks);
        this.jenisMotor = jenisMotor;
        System.out.println("merek: " + merk);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks);
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}
