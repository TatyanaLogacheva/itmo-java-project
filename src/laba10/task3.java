package laba10;

import java.io.*;

public class task3 {
    public static void unite(File file1, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file2));
             DataOutputStream writer = new DataOutputStream(new FileOutputStream(file1, true))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.writeBytes(str + "\n");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("FilePack/ NewText.txt");
        File addFile = new File("FilePack/Text.txt");
        unite(file, addFile);
    }
}
