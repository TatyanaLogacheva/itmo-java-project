package laba5;

public class Palindrom {
    public static boolean palindromCheck(StringBuilder word) {
        String word2 = word.toString();
        word.reverse();
        if (word2.equalsIgnoreCase(word.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("Топот");
        System.out.println(palindromCheck(word));
    }
}
