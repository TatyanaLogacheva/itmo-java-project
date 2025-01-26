package laba10;

import java.io.*;

public class task2 {
    public static void strWriter(String str, File file) {
        try (DataOutputStream outPut = new DataOutputStream(new FileOutputStream(file, true))) {
            outPut.writeBytes(str);
            System.out.println("File has been written");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("FilePack/ NewText.txt");
        String string = "Contrary to popular belief, Lorem Ipsum is not simply random text." + "\n";
        strWriter(string, file);
    }
}
