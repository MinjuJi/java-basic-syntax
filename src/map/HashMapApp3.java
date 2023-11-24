package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp3 {
    static class User {
        String name;            // 고객명
        String[] senderTypes;   // 메세지 발신방법들
    }

    static interface MessageSender {
        void send();
    }

    static class SMSMessageSender implements MessageSender {
        public void send() {
            System.out.println("SMS로 메세지를 보낸다.");
        }
    }

    static class EmailMessageSender implements MessageSender {
        public void send() {
            System.out.println("Email로 메세지를 보낸다.");
        }
    }

    static class KaKaoTalkMessageSender implements MessageSender {
        public void send() {
            System.out.println("kakaotalk으로 메세지를 보낸다.");
        }
    }

    public static void main(String[] args) {
        Map<String, MessageSender> map = new HashMap<>();
        map.put("sms", new SMSMessageSender());
        map.put("email", new EmailMessageSender());
        map.put("kakaotalk", new KaKaoTalkMessageSender());

        User user1 = new User();
        user1.name = "홍길동";
        user1.senderTypes = new String[]{"sms", "kakaotalk"};
        System.out.println(user1.name + "에게 이벤트 메세지 전송하기");
        for (String type : user1.senderTypes) {
            MessageSender ms = map.get(type);
            ms.send();
        }
    }
}