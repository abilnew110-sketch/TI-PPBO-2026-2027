public class TampilSemua {
    public static void main(String[]args){
        Manager mr1 = new Manager("Abdul Razak","2025573010068",2500000,200000);
        Staff st1 = new Staff("Fajar","2025573010010",3000000,100000);
        Direktur dr1 = new Direktur("Farhan","2025573010080",4000000,400000,100000);
        mr1.tampilkanData();
        st1.tampilkanData();
        dr1.tampilkanData();
    }
}
