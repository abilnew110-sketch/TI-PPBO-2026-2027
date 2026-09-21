import java.util.Scanner;
public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan berat badan (kg) ");
        double berat = input.nextDouble();
        System.out.println("masukkan tinggi badan (cm) ");
        double tinggiCM = input.nextDouble();

        double tinggiM = tinggiCM / 100;
        double bmi = berat / (tinggiM * tinggiM);
        bmi = Math.round(bmi * 100) / 100;
        System.out.println("skor bmi : " + bmi);

        if(bmi < 18.5){
            System.out.println("kategori : kurus");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.println("kategori : normal");
        } else if(bmi >= 25 && bmi < 30){
            System.out.println("kategori : gemuk");
        } else {
            System.out.println("kategori : obesitas");
        }
    }
}