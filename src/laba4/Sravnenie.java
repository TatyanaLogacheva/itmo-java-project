package laba4;

import java.util.Scanner;

public class Sravnenie {
    public static boolean compare (int a, int b, int c){
        if (b>a && c>b){
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();
        System.out.print("Результат: " + compare(num1, num2, num3));

    }
}
