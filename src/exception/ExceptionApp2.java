package exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp2 {
    public static void main(String[] args) {
        try {
            first();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("입출력 작업 중 오류가 발생하였습니다.");
        }
    }

    public static void first() throws IOException {
        second();
    }

    public static void second() throws IOException {
        FileWriter writer = new FileWriter("app3.txt");
        writer.write("예외처리 위임하기");
        writer.close();
    }
}