package laba5;

public class ChangeSubline {
    public static String change(String text) {
        String newText = text.replaceAll("бяка", "[вырезано цензурой]");
        return newText;
    }

    public static void main(String[] args) {
        String text = "Что за бяка, бяка-забияка";
        System.out.println(change(text));
    }
}
