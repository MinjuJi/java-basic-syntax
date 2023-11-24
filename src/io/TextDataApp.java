package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextDataApp {
    public static void main(String[] args) throws IOException {

        // data.txt에서 데이터를 한 줄씩 읽어온다.
        String path = "src/io/data.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String txt = null;
        while ((txt = reader.readLine()) != null) {
            System.out.println(txt);
        }

        reader.close();
    }
}
