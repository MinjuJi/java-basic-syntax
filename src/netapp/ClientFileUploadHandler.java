package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClientFileUploadHandler implements Handler {
    private Scanner scanner;

    public ClientFileUploadHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void handle(DataInputStream in, DataOutputStream out) throws IOException {
        System.out.println("파일 서버에 파일 업로드를 요청함");
        // 파일 서버에 요청 명령어를 전달
        out.writeInt(Cmd.REQ_UPLOAD);

        System.out.println("업로드할 파일 경로 입력:");
        String path = scanner.nextString();
        File file = new File(path);
        String fileName = file.getName();
        long size = file.length();

        // 파일 서버에 파일명과 파일 크기를 전달
        out.writeUTF(fileName);
        out.writeLong(size);

        FileInputStream fis = new FileInputStream(file);
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = fis.read(buf)) != -1) {
            // 파일 서버에 파일 데이터 전달
            out.write(buf, 0, len);
        }
        fis.close();

        // 서버가 보낸 응답 처리하기
        int resCmd = in.readInt();
        if (resCmd == Cmd.RES_MESSAGE) {
            String message = in.readUTF();
            System.out.println("메시지" + message);
        }
    }
}