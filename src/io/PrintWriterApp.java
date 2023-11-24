package io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("src/io/data2.csv");

        writer.println("김유신,100,100");
        writer.println("강감찬,100,100");
        writer.println("이순신,100,100");

        writer.close();
        // data2.csv = "김유신,100,100 \n 강감찬,100,100 \n 이순신,100,100" 저장
    }
}
