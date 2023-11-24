package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamApp {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src/io/app1.txt");

        int value = 0;
        while ((value = in.read()) != -1) {
            System.out.print((char) value);
        }
        in.close();
    }
}
