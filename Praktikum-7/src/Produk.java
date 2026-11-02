public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stock;

    public Produk(String kodeProduk, String namaProduk, double harga, int stock) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        if(stock >= 0){
            this.stock = stock;
        } else {
            this.stock = 0;
            System.out.println("Stock tidak boleh negatif");
        }
    }
    public String getKodeProduk(){
        return this.kodeProduk;
    }
    public String getNamaProduk(){
        return this.namaProduk;
    }
    public double getHarga(){
        return this.harga;
    }
    public int getStock(){
        return this.stock;
    }
    public void setKodeProduk(String kodeProduk){
        this.kodeProduk = kodeProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public void setHarga(double harga){
        if(harga >= 0){
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }
    public void tambahStock(int jumlah){
        if(jumlah > 0){
            this.stock += jumlah;
        } else {
            System.out.println("Jumlah harus positif");
        }
    }
    public void kurangiStock (int jumlah){
        if (jumlah <= 0) {
            System.out.println("jumlah pengurangan harus lebih dari 0");
        } else if(this.stock - jumlah < 0){
            System.out.println("Stok tidak mencukupi maka operasi ditolak");
        } else {
            this.stock -= jumlah;
        }
    }
    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;
    }
    public void tampilkanData(){
        System.out.println("Kode Produk: " + this.kodeProduk);
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
        System.out.println("Stok: " + this.stock);
    }
}
