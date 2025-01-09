package laba4_part2;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 4};
        for (int i = 0; i < arr.length; ++i) {
            boolean check = true;
            for (int j = 0; j < arr.length; ++j) {
                if (i == j) continue;
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("First unique number: " + arr[i]);
                break;
            }
        }
    }
}
