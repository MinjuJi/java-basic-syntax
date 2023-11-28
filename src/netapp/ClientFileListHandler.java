package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ClientFileListHandler implements Handler {
    @Override
    public void handle(DataInputStream in, DataOutputStream out) throws IOException {
        out.writeInt(Cmd.REQ_FILE_LIST);

        int cmd = in.readInt();
        if (cmd != Cmd.RES_FILE_LIST) {
            return;
        }

        String text = in.readUTF();
        String[] items = text.split("___XXX___");

        System.out.println("파일 서버의 파일 목록");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
