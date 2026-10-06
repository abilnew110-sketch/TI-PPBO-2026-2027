public class MethodDemo {
    static void sapa(String nama){
        System.out.println("halo, " + nama + "!");
    }
    static void TampilkanBiodata(String nama, int umur, String Kota){
        System.out.println(nama +" (" + umur +" tahun) - " + Kota);
    }

    public static void main(String[]args){
        sapa("Razak");
        sapa("Abdul");
        sapa("Abil");
        TampilkanBiodata("Razak", 20, "Krueng Geukueh");
    }
}
