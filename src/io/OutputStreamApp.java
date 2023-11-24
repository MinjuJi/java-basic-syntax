package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamApp {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("src/io/app3.txt");

        out.write(65); // A
        out.write(66); // B
        out.write(67); // C
        out.write(68); // D
        out.write(69); // E
        out.write(70); // F

        String str = "안녕하세요";
        byte[] buf = str.getBytes();
        out.write(buf, 0, buf.length);

        out.close();
        // app3.txt = "ABCDEF안녕하세요" 저장
    }
}
