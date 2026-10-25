public class Tampil_Produk {
    public static void main(String[]args){
        Produk laptop = new Produk("Laptop", 15000000);
        Produk mouse = new Produk("Mouse", 250000);

        double batas = 500000;

        System.out.println("Apakah " + laptop.namaProduk + " Mahal? " + laptop.isMahal(batas));
        System.out.println("Apakah " + mouse.namaProduk + " Mahal? " + mouse.isMahal(batas));
    }
}
