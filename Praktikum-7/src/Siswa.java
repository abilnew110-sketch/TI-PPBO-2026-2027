public class Siswa {
    private double nilai;
    public void setNilai(double nilai){
        if(nilai >= 0 && nilai <= 100){
            this.nilai = nilai;
        } else {
            System.out.println("nilai tidak valid");
        }
    }
    public double getNilai(){
        return this.nilai;
    }
    public char getNilaiHuruf(){
        if(this.nilai >= 80 && this.nilai <= 100){
            return 'A';
        } else if(this.nilai >= 60 && this.nilai < 80){
            return 'B';
        } else if(this.nilai >= 40 && this.nilai < 60){
            return 'C';
        } else if(this.nilai >= 20 && this.nilai < 40){
            return 'D';
        } else {
            return 'E';
        }
    }
}
