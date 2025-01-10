package laba4_part1;

import java.util.Arrays;

public class ArrayInclud3 {
    public static boolean check(int[] arr) {
        if (arr[0] == 3 || arr[arr.length - 1] == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 0, 3};
        if (array.length >= 2) {
            System.out.println("array = " + Arrays.toString(array));
            System.out.print(check(array));
        } else {
            System.out.println("Массив не отвечает условиям");
        }
    }
}