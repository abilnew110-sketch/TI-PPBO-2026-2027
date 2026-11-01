import java.util.Scanner;
public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik){
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    public int getJam(){
        return jam;
    }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("jam tidak valid harus diantara 0 - 23");
        }
    }

    public int getMenit(){
        return menit;
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("menit tidak valid harus diantara 0 - 59");
        }
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("detik tidak valid harus diantara 0 - 59");
        }
    }

    public int getDetik(){
        return detik;
    }

    public void TampilkanWaktu(){
        System.out.println("jam sekarang : " + jam);
        System.out.println("menit sekarang : " + menit);
        System.out.println("detik sekarang : " + detik);
    }
}
