package netapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 서버 측과 클라이언트 측에서 요청과 응답을 처리하는 핸들러에 대한 언터페이스이다.
 */
public interface Handler {
    /**
     * 서버 측과 클라이언트 측에서 요청과 응답을 처리하는 메소드이다.
     *
     * @param in
     * @param out
     * @throws IOException
     */
    void handle(DataInputStream in, DataOutputStream out) throws IOException;
}
