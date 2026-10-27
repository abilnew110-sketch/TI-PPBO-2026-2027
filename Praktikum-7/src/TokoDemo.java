public class TokoDemo {
    public static void main(String[]args){
        Produk[] daftarProduk = new Produk[5];
        daftarProduk[0] = new Produk("Pb01","Laptop Tuf", 12000000, 10);
        daftarProduk[1] = new Produk("Pb02","monitor", 5000000, 2);
        daftarProduk[2] = new Produk("Pb03","mouse", 200000, 7);
        daftarProduk[3] = new Produk("Pb04","PC", 3000000, 5);
        daftarProduk[4] = new Produk("Pb05","headset", 240000, 8);

        for(Produk p : daftarProduk){
            p.tampilkanData();
        }
        System.out.println("Membeli 2 " + daftarProduk[1].namaProduk);
        daftarProduk[1].kurangStock(2);
        System.out.println("Membeli 5 " + daftarProduk[2].namaProduk);
        daftarProduk[2].kurangStock(5);

        Produk produkMahal = daftarProduk[0];
        for(int i = 0; i < daftarProduk.length; i++){
            if(daftarProduk[i].harga > produkMahal.harga){
                produkMahal = daftarProduk[i];
            }
        }
        System.out.println("Produk Termahal: " + produkMahal.namaProduk +
                " dengan harga: " + produkMahal.harga);
    }
}
