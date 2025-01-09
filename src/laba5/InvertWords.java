package laba5;

public class InvertWords {
    public static String invert(String str) {
        String newStr = new String();
        String[] arrWords = str.split(" ");
        for (String word : arrWords) {
            StringBuilder Word2 = new StringBuilder(word);
            Word2.reverse();
            newStr = newStr.concat(Word2.toString() + " ");
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "This is the test string";
        System.out.println("The given string is:" + str);
        System.out.println("The string reversed word by word is:" + invert(str));
    }
}
