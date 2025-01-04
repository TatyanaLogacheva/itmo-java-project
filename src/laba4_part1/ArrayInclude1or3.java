package laba4_part1;

public class ArrayInclude1or3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -16, 20, 48};
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == 3) {
                counter++;
                System.out.println("Массив содержит 1 или 3");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Массив не содержит 1 и 3");
        }
    }
}
