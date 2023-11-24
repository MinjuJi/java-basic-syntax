package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamApp2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src/io/app2.txt");

        // 한글을 읽어오면 글자가 깨짐
        // int value = 0;
        // while ((value = in.read()) != -1) {
        //     System.out.print((char) value);
        // }

        // 해결 방법
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            String text = new String(buf, 0, len);
            System.out.println(text);
        }
        in.close();
    }
}
