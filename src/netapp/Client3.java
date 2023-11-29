package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client3 {
    private Map<Integer, Handler> map = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client3() {
        // Map 객체에 메뉴별 핸들러 객체를 저장한다.
        map.put(Cmd.MENU_LIST, new ClientFileListHandler());
        map.put(Cmd.MENU_DOWNLOAD, new ClientFileDownloadHandler(scanner));
        map.put(Cmd.MENU_UPLOAD, new ClientFileUploadHandler(scanner));
        map.put(Cmd.MENU_EXIT, new ClientExitHandler());
    }

    /**
     * 파일 서버로 연결요청을 보내고, 스트림을 연결해서 서버와 통신할 준비를 마친다.
     *
     * @throws IOException
     */
    public void startUp() throws IOException {
        socket = new Socket("192.168.0.7", 30_000);

        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());

        showMenu();
    }

    public void showMenu() {
        try {
            System.out.println("\n1.목록조회 2.다운로드 3.업로드 0.종료");

            System.out.println("메뉴선택: ");
            int menu = scanner.nextInt();

            Handler handler = map.get(menu);
            handler.handle(in, out);

            showMenu();
        } catch (IOException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Client3 client = new Client3();
        client.startUp();
    }
}
