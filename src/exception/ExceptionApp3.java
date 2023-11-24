package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExceptionApp3 {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            prop.load(new FileReader("config.properties"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}