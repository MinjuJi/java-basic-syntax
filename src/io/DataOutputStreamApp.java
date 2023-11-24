package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
    public static void main(String[] args) throws IOException {
        String name = "iphone 15 pro";
        String company = "애플";
        int price = 1_500_000;
        double discountRate = 0.05;
        boolean soldOut = false;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/io/item.txt"));
        out.writeUTF(name);
        out.writeUTF(company);
        out.writeInt(price);
        out.writeDouble(discountRate);
        out.writeBoolean(soldOut);
    }
}
