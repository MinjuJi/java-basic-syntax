package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BridgeStreamApp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력: ");
        String text = reader.readLine();
        System.out.println("입력내용: " + text);
    }
}
