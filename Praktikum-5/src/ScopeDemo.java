public class ScopeDemo {
    static void methodA(){
        int x = 10;
        System.out.println("Di methodA, x = " + x);
    }
    static void methodB(){
        int x = 99;
        System.out.println("Di methodB, x = " + x);
    }
    public static void main(String[]args){
        methodA();
        methodB();
    }
}
