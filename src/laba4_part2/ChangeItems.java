package laba4_part2;

import java.util.Arrays;

public class ChangeItems {
    public static void change(int[]array){
        int temp=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=temp;
    }
    public static void main (String[] args){
        int[] nums={5, 6, 7, 2};
        System.out.println("Array 1: " +Arrays.toString(nums));
        change(nums);
        System.out.println("Array 2: " +Arrays.toString(nums));
    }

}
