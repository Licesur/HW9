import java.util.Scanner;
public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        a = inputDouble();
        b = inputDouble();

        sum(a,b);      //Метод суммирования чисел
        multiply(a,b); //Метод умножения чисел
        diff(a,b);     //Метод вычитания чисел
        divide(a,b);   //Метод деления чисел
    }

    private static void divide(double a, double b) {
        System.out.println(a/b);
    }

    private static void diff(double a, double b) {
        System.out.println(a-b);
    }

    private static void multiply(double a, double b) {
        System.out.println(a*b);
    }

    private static void sum(double a, double b) {
        System.out.println(a+b);
    }


    private static double inputDouble(){
        return new Scanner(System.in).nextDouble();
    }
}
