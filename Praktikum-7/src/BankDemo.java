public class BankDemo {
    public static void main(String[]args){
        RekeningBank rekA = new RekeningBank("001","Budi", 100000,"Tabungan");
        RekeningBank rekB = new RekeningBank("002","Andi",200000, "Giro");
        //skenario 1
        rekA.setor(50000);
        rekA.tarik(30000);

        rekB.tarik(500000);
        rekB.setor(50000);
        //skenario 2
        rekA.transferKe(rekB,15000);
        //skenario 3
        rekB.transferKe(rekA,1500000);
        //skenario 4
        rekA.transferKe(rekB,-20000);

        System.out.println("=== MUTASI AKHIR ===");
        rekA.cetakMutasi();
        System.out.println("---------------------");
        rekB.cetakMutasi();
    }
}
