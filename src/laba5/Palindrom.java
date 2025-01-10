package laba5;

public class Palindrom {
    public static boolean palindromCheck(StringBuilder word) {
        String word2 = word.toString().toLowerCase();
        word.reverse();
        String word1 = word.toString().toLowerCase();
        if (word2.equals(word1)) {
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
