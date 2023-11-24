package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/io/user.txt"; // 직렬화가 된 데이터가 저장된 파일
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));

        // 역직렬화가 일어난다.
        User user = (User) in.readObject();

        System.out.println(user.getNo());
        System.out.println(user.getId());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
    }
}
