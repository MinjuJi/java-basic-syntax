package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamApp {

    public static void main(String[] args) throws IOException {

        System.out.println("백업 파일 생성 시작!");
        long startTime = System.currentTimeMillis();

        String src = "c:/Users/jhta/Downloads/live.mp4";
        String dest = "c:/Users/jhta/Downloads/live_backup.mp4";

        // 1byte씩 읽고 쓰기
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest);

        // 입력 스트림의 끝에 도달하기 전까지 in.read() 메소드를 1byte를 읽어서 value에 저장한다.
        // value에 저장된 값을 출력 스트림으로 기록한다.
        int value = 0;
        while ((value = in.read()) != -1) {
            out.write(value);
        }

        in.close();
        out.close();

        System.out.println("백업 파일 생성 완료!");
        long endTime = System.currentTimeMillis();

        long runningTime = endTime - startTime;
        System.out.println("소요시간: " + runningTime + " 밀리초");
    }
}
