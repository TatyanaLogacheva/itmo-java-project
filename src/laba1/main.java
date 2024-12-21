package laba1;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Я \nхорошо \nзнаю \nJava.");


        double result1 = (46 + 10) * (10 * 1.0 / 3);
        short result2 = 29 * 4 * (-15);


        short number = 10500;
        int result3 = (number / 10) / 10;
        System.out.println(result3);


        double result4 = 3.6 * 4.1 * 5.9;


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }


        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (b % 2 == 0 && b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        }


    }
}

