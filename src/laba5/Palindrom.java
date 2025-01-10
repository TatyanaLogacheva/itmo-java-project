package laba5;

public class Palindrom {
    public static boolean palindromCheck(StringBuilder word) {
        String word2 = word.toString();
        word.reverse();
        word2 = word2.toLowerCase();
        String word1 = word.toString();
        word1 = word1.toLowerCase();
        if (word2.equals(word1.toLowerCase())) {
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
