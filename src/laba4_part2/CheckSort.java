package laba4_part2;

public class CheckSort {
    public static void main(String[] args) {
        boolean result = true;
        int[] arr = {-2, 1, 8, 12, 25};
        for (int i = 0; i < arr.length - 2; ++i) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                result = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (result) {
            System.out.println("ОК");
        }
    }
}
