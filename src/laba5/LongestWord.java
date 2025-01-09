package laba5;

public class LongestWord {
    public static String SearchWord(String text) {
        String[] word = text.split(" ");
        int indexMax = 0;
        for (int i = 1; i < word.length; ++i) {
            if (word[indexMax].length() < word[i].length()) {
                indexMax = i;
            }
        }
        return word[indexMax];
    }

    public static void main(String[] args) {
        String text = "Написать метод для поиска самого длинного слова в тексте";
        System.out.println(SearchWord(text));

    }
}
