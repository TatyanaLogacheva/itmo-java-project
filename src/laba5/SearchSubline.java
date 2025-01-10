package laba5;

public class SearchSubline {
    public static int search(String string, String substring) {
        int counter = 0;
        int index = 0;
        while (string.indexOf(substring, index) >= 0) {
            index = string.indexOf(substring, index) + 1;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String string1 = "Каждый год , 31 января люди отмечают новый год . И этот новый год не исключение .";
        String string2 = "НОВЫЙ ГОД";
        if (string1.length() < string2.length()) {
            System.out.println(search(string2.toLowerCase(), string1.toLowerCase()));
        } else {
            System.out.println(search(string1.toLowerCase(), string2.toLowerCase()));
        }
    }
}
