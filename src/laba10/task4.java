package laba10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void change(File file, char sym) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            List<Character> items = new ArrayList<>();
            int item;

            while ((item = reader.read()) != -1) {
                if (Character.isDigit((char) item) || Character.isLetter((char) item)) {
                    items.add((char) item);
                } else {
                    items.add(sym);
                }
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter(file))) {
                wr.write("");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

            for (Character i : items) {
                writer.append(i);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("FilePack/ForTask4.txt");
        char symbol = '$';
        change(file, symbol);
    }
}
