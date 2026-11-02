public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening){
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }
    public String getNomorRekening(){
        return nomorRekening;
    }
    public String getPemilik(){
        return pemilik;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getJenisRekening(){
        return jenisRekening;
    }
    public void setor(double jumlah){
        if (jumlah <= 0){
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("setor berhasil. Saldo: " + saldo);
    }
    public void tarik(double jumlah){
        if(jumlah <= 0){
            System.out.println("jumlah tarik harus lebih dari 0");
        }else if(jumlah > saldo){
            System.out.println("Saldo tidak mencukupi");
        }else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }
    public void transferKe(RekeningBank tujuan, double jumlah){
        if(jumlah <= 0){
            System.out.println("Transfer gagal, harus lebih dari 0");
        } else if(this.saldo < jumlah){
            System.out.println("Saldo Kurang");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer Berhasil Mengirim sejumalah Rp " + jumlah + " dari " + this.pemilik + " ke " + tujuan.getPemilik());
        }
    }
    public void cetakMutasi(){
        System.out.println("    LAPORAN MUTASI      ");
        System.out.println("Nomor Rekening: " + this.nomorRekening);
        System.out.println("Pemilik: " + this.pemilik);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Jenis Rekening: " + this.jenisRekening);
    }
}
