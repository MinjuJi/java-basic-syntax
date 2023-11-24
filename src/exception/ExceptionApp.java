package exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("예외처리 연습 중");
        } catch (IOException e) {
            System.out.println("파일 쓰기 작업 중 오류가 발생하였습니다.");
        }
    }
}