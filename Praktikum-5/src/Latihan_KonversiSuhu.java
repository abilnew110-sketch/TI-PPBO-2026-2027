public class Latihan_KonversiSuhu {
    static double KonversiSuhu(double Celsius){
        return (Celsius * 9/5) + 32;
    }
    static double KonversiSuhu(double Celsius, String skalaTujuan){
        if(skalaTujuan.equals("Kelvin")){
            return Celsius + 273.15;
        } else if(skalaTujuan.equals("Fahrenheit")){
            return (Celsius * 9/5) + 32;
        } else {
            System.out.println("skala Tujuan tidak dikenali");
            return Celsius;
        }
    }
    public static void main(String[]args){
        double SuhuCelsius = 25.0;
        double SuhuKeFahrenheit = KonversiSuhu(SuhuCelsius, "Fahrenheit");
        double SuhuKeKelvin = KonversiSuhu(SuhuCelsius, "Kelvin");
        System.out.println("Celsius ke Fahrenheit : " + SuhuKeFahrenheit);
        System.out.println("Celsius ke Kelvin : " + SuhuKeKelvin);
    }
}
