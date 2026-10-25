public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stock;

    public Produk(String kodeProduk, String namaProduk, double harga, int stock) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stock = stock;
    }
    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;
    }
    public void kurangStock (int jumlahStock){
        if (this.stock >= jumlahStock) {
            this.stock -= jumlahStock;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    public void tampilkanData(){
        System.out.println("Kode Produk: " + this.kodeProduk);
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
        System.out.println("Stok: " + this.stock);
    }
}
