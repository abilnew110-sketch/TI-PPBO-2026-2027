public class Kucing extends Hewan{
    private String nama;
    public Kucing(String nama){
        super(nama);

        System.out.println("Nama kucing: " + nama);
        System.out.println("Suara Kucing: " + bersuara());
    }
    public String bersuara(){
        return " Meong Meong ";
    }
}
