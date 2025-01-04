package laba4;

import java.util.Arrays;

public class ArrayInclud3 {
    public static boolean check(int a, int b) {
        if (a == 3 || b == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3};
        if (array.length >= 2) {
            System.out.println("array = " + Arrays.toString(array));
            System.out.print(check(array[0], array[array.length - 1]));
        } else {
            System.out.println("Массив не отвечает условиям");
        }
    }
}