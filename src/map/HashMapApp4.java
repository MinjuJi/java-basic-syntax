package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp4 {
    public static void main(String[] args) {
        String[] names = {"김유신", "홍길동", "이순신", "이황", "이이", "김구", "김좌진", "안중근", "윤봉길", "류관순", "강감찬"};
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            String key = name.substring(0, 1);
            boolean isContains = map.containsKey(key);
            map.put(key, map.getOrDefault(key, 1) + 1);
        }
        for (Map.Entry<String, Integer> subMap : map.entrySet()) {
            System.out.println(subMap.getKey() + " : " + subMap.getValue());
        }
    }
}