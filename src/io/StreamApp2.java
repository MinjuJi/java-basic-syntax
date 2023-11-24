package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamApp2 {

    public static void main(String[] args) throws IOException {

        System.out.println("백업 파일 생성 시작!");
        long startTime = System.currentTimeMillis();

        String src = "c:/Users/jhta/Downloads/live.mp4";
        String dest = "c:/Users/jhta/Downloads/live_backup.mp4";

        // byte 배열을 이용해서 읽고 쓰기
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest);

        byte[] buf = new byte[1024 * 8];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        in.close();
        out.close();

        System.out.println("백업 파일 생성 완료!");
        long endTime = System.currentTimeMillis();

        long runningTime = endTime - startTime;
        System.out.println("소요시간: " + runningTime + " 밀리초");
    }
}
