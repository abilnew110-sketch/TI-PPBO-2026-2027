public class tampilSiswa {
    public static void main(String[]args){
        Siswa siswa1 = new Siswa();
        siswa1.setNilai(85.5);
        System.out.println("Nilai angka: " + siswa1.getNilai());
        System.out.println("Nilai huruf: " + siswa1.getNilaiHuruf());
    }
}
