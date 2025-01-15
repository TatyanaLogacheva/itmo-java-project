package laba6;

import java.util.Scanner;

public class UserAge {
    int age;
    Scanner scanner = new Scanner(System.in);

    public void receiveInfo() {
        int ag = scanner.nextInt();
        age = ag;
    }


}
