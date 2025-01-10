package laba5;

public class ChangeSubline {
    public static String change(String text, String substr, String replace) {
        String newText = text.replaceAll(substr, replace);
        return newText;
    }

    public static void main(String[] args) {
        String text = "Что за бяка, бяка-забияка";
        String line = "бяка";
        String insert = "[вырезано цензурой]";
        System.out.println(change(text, line, insert));
    }
}
