package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hong", "홍길동");
        map.put("kim", "김유신");
        map.put("kang", "강감찬");
        map.put("lee", "이순신");

        String value1 = map.get("hong");
        String value2 = map.get("kim");
        String value3 = map.get("ahn"); // null 출력

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        map.put("kim", "김좌진");
        System.out.println(map);
    }
}