package laba4_part2;

public class CheckSort {
    public static String checkSort(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] < nums[i + 1]) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            return "ОК";
        } else {
            return "Please, try again";
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 9, 8, 12, 25};
        System.out.println(checkSort(arr));

    }
}
