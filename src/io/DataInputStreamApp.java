package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamApp {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("src/io/item.txt"));

        String value1 = in.readUTF();
        String value2 = in.readUTF();
        int value3 = in.readInt();
        double value4 = in.readDouble();
        boolean value5 = in.readBoolean();

        System.out.println("상품명: " + value1);
        System.out.println("제조사: " + value2);
        System.out.println("가격: " + value3);
        System.out.println("할인율: " + value4);
        System.out.println("절판여부: " + value5);

        in.close();
    }
}
