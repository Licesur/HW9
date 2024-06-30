import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        answer(a);
    }
    public static boolean isChet(int number){
        return (number % 2 == 0);
    }
    public static void answer(int a){
        if (isChet(a)) System.out.println("Это число четное");
        else System.out.println("Это число нечетное");
    }
}
