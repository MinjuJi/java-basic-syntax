package io;

import java.io.File;

public class FileApp3 {
    public static void main(String[] args) {
        File file = new File("src/io/app4.txt");
        File root = new File("c:/");

        boolean isExists = file.exists();
        System.out.println("파일이 존재하는가? " + isExists);

        /*
         * String[] list(): 하위 폴더명 및 파일명을 배열에 담아서 반환한다.
         * File[] listFiles(): 하위 폴더 및 파일을 표현한 File 객체를 전부 생성해서 배열에 담아 반환한다.
         *
         * */

        String[] list = root.list();
        for (String item : list) {
            System.out.println(item);
        }

        File[] items = root.listFiles();
        for (File item : items) {
            if (!item.isHidden()) {
                continue;
            }
            String name = item.getName();
            if (item.isDirectory()) {
                System.out.println("[ " + name + " ]");
            }
            if (!item.isDirectory()) {
                System.out.println(name);
            }
        }
    }
}