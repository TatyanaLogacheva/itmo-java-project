package laba4_part1;

public class ArrayInclude1or3 {
    public static String search1or3(int[] arr) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == 3) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            return "Массив не содержит 1 и 3";
        } else {
            return "Массив содержит 1 или 3";
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 6, -16, 20, 48};
        System.out.println(search1or3(arr));

    }
}
