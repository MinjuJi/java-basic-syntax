package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("파일 클라이언트가 기동됨");
        System.out.println("파일 서버에 연결요청을 보냄");
        Socket socket = new Socket("192.168.0.7", 30_000);
        System.out.println("파일 서버와 연결이 완료됨");

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());

        // 업로드할 파일을 표현하는 File 객체를 생성한다.
        File file = new File("src/net/coffee.png");

        // 업로드할 파일을 읽어오는 fileInputStream 객체를 생성한다.
        FileInputStream fis = new FileInputStream(file);

        // 업로드할 파일명과 파일사이즈를 조회한다.
        String filename = file.getName();
        long size = file.length();

        // 파일명과 파일사이즈를 파일 서버로 보낸다.
        System.out.println("파일명과 사이즈를 파일 서버로 전송함");
        out.writeUTF(filename);
        out.writeLong(size);

        // 파일 데이터를 파일 서버로 보내기
        System.out.println("파일 데이터를 파일 서버로 전송하기 시작함");
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        fis.close();
        System.out.println("파일 데이터를 파일 서버로 전송 완료함");
    }
}
