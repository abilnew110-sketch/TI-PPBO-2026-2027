public class Tampil_Produk {
    public static void main(String[]args){
        Produk laptop = new Produk("P001","Laptop", 15000000,10);
        Produk mouse = new Produk("POO2","Mouse", 250000,10);

        double batas = 500000;

        System.out.println("Apakah " + laptop.namaProduk + " Mahal? " + (laptop.harga > batas));
        System.out.println("Apakah " + mouse.namaProduk + " Mahal? " + (mouse.harga > batas));
    }
}
