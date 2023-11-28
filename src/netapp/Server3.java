package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server3 {
    private Map<Integer, Handler> map = new HashMap<>();

    public Server3() {
        map.put(Cmd.REQ_UPLOAD, new ServerFileUploadHandler());
        map.put(Cmd.REQ_DOWNLOAD, new ServerFileDownloadHandler());
        map.put(Cmd.REQ_FILE_LIST, new ServerFileListHandler());
    }

    public void startUp() throws IOException {
        System.out.println("파일 서버가 기동됨");
        ServerSocket serverSocket = new ServerSocket(30_000);

        while (true) {
            try {
                System.out.println("파일 서버가 클라이언트의 요청을 대기중");
                Socket socket = serverSocket.accept();
                System.out.println("파일 서버가 클라이언트의 연결요청을 접수받음");

                System.out.println("파일 서버가 클라이언트와 통신할 스트림을 생성함");
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                System.out.println("파일 서버가 클라이언트 요청을 분석함");
                // cmd는 1,2,3, 중의 하나다.
                // 1은 Cmd.REQ_FILE_UPLOAD 요청이다.
                // 2는 Cmd.REQ_FILE_DOWNLOAD 요청이다.
                // 3은 Cmd.REQ_FILE_LIST 요청이다.
                int cmd = in.readInt();
                System.out.println("클라이언트 요청: " + cmd);

                // Map 객체에서 cmd에 해당하는 Handler 객체를 가져온다.
                Handler handler = map.get(cmd);
                System.out.println("Handler 구현객체: " + handler.getClass().getName());
                // 획득된 Handler 객체의 handle() 메소드를 실행해서 클라이언트의 요청을 처리한다.
                handler.handle(in, out);
            } catch (IOException e) {

            }
        }
    }

    public static void main() throws IOException {
        Server3 server = new Server3();
        server.startUp();

    }
}