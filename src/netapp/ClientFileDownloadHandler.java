package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClientFileDownloadHandler implements Handler {
    private Scanner scanner;

    public ClientFileDownloadHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void handle(DataInputStream in, DataOutputStream out) throws IOException {
        System.out.println("파일 서버에서 파일 다운로드를 요청함");

        // 파일 서버에서 파일 다운로드 요청을 보냄
        out.writeInt(Cmd.REQ_DOWNLOAD);

        System.out.print("다운로드할 파일명 입력: ");
        String fileName = scanner.nextString();
        out.writeUTF(fileName);

        // 파일 서버가 파일 다운로드 요청에 대해서 보낸 응답을 클라이언트가 처리함.
        int resCmd = in.readInt();
        if (resCmd == Cmd.RES_MESSAGE) {
            String messsage = in.readUTF();
            System.out.println("서버 메시지: " + messsage);
        }
        if (resCmd == Cmd.RES_FILE) {
            String downloadFilename = in.readUTF();
            long size = in.readLong();
            System.out.println("다운로드할 파일 이름: " + downloadFilename);
            System.out.println("다운로드할 파일 크기: " + size);

            File fIle = new File(new File("C:\\Users\\jhta\\Downloads"), downloadFilename);
            FileOutputStream fos = new FileOutputStream(fIle);

            long readBytes = 0;
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
                readBytes += len;
                if (readBytes == size) {
                    break;
                }
            }
            fos.close();
            System.out.println("파일 다운로드가 완료되었습니다.");
        }

    }
}
