package laba5;

public class Palindrom {
    public static boolean PalindromCheck(StringBuilder word) {
        String word2 = word.toString();
        word.reverse();
        if (word2.equals(word.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("камаз");
        System.out.println(PalindromCheck(word));
    }
}
