package exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp8 {
    public static void main(String[] args) {

        /*try ~ catch ~ resource 블록
         * - try 블록에 자원객체를 전달하면, try 블록이 끝나면 자동으로 자원을 반납하는 기능이 지원되는 블록이다.
         * - try(자원객체){ *** }
         * - 자바7부터 지원
         * - AutoCloseable 인터페이스를 구현한 클래스는 사용했던 자원을 자동으로 반납처리한다.
         * - 세미콜론(;)을 사용해서 자원객체를 여러 개 전달할 수 있다.
         * */

        try (FileWriter writer = new FileWriter("app8.txt")) {
            writer.write("자동 반납 연습");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}