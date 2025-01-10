package laba5;

public class InvertWords {
    public static StringBuilder invert(String str) {
        StringBuilder newStr = new StringBuilder();
        String[] arrWords = str.split(" ");
        for (String word : arrWords) {
            StringBuilder word2 = new StringBuilder(word);
            word2.reverse();
            newStr = newStr.append(word2 + " ");
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "This is the test string";
        System.out.println("The given string is:" + str);
        System.out.println("The string reversed word by word is:" + invert(str));
    }
}
