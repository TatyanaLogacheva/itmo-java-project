package laba4_part2;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Array length: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Numbers of array: ");
        for (int i=0; i<length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }

}
