package laba4_part1;

public class div_3_and_5 {
    public static void search(int div) {
        for (int i = 1; i < 101; ++i) {
            if (i % div == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Делится на 3: ");
        search(3);
        System.out.print("\n" + "Делится на 5: ");
        search(5);
        System.out.print("\n" + "Делится на 3 и на 5: ");
        search(3 * 5);
    }
}
