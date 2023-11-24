package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamApp {
    public static void main(String[] args) throws IOException {
        User user = new User(100, "홍길동", "zxcv1234", "hong@gmail.com");
        String path = "src/io/user.txt";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));

        // 객체를 직렬화한다.
        out.writeObject(user);
        out.close();
    }
}
