public class Anjing extends Hewan{
    private String nama;
    public Anjing(String nama) {
        super(nama);

        System.out.println("nama: " + nama);
        System.out.println("bersuara: " + bersuara());
    }
        public String bersuara(){
            return " gok gok ";
    }
}
