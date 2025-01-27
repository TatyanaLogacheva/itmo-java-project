package laba10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class task1 {
    public static List<String> fileToStr(File file) {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                result.add(str + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        File file = new File("FilePack/Text.txt");
        List<String> strings = new ArrayList<>(fileToStr(file));
        System.out.println(strings);
    }
}
