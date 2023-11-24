package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTranslationApp {
    // 이 메소드에서 발생하는 FileNotFoundException, IOException 대신 HtaException을 발생시킴
    public static String readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String text = reader.readLine();
            return text;
        } catch (FileNotFoundException e) {
            // 사용자 정의 예외를 대신 발생시킴
            throw new HtaException("sample.txt", e);
        } catch (IOException e) {
            // 사용자 정의 예외를 대신 발생시킴
            throw new HtaException(e);
        }
    }

    // 이 메소드에서 발생한 PaseException 대신 HtaException을 발생시킴
    public static Date toDate(String text) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(text);
            return date;
        } catch (ParseException e) {
            // 사용자 정의 예외를 대신 발생시킴
            throw new HtaException(text, e);
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
            toDate("이천이십상년십일월이십이일");
        } catch (HtaException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
