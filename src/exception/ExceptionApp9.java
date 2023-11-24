package exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionApp9 {
    /**
     * @param grade
     * @param orderPrice
     * @return 적립포인트
     */
    public static int getPoint(String grade, int orderPrice) {
        Map<String, Double> map = new HashMap<>();
        map.put("gold", 0.05);
        map.put("silver", 0.03);
        map.put("bronze", 0.01);

        if (!map.containsKey(grade)) {
            throw new RuntimeException("[grade]가 비어있거나, 유효한 고객등급이 아닙니다.");
        }

        double rate = map.get(grade);
        int point = (int) (orderPrice * rate);
        return point;

    }

    public static void main(String[] args) {
        int point1 = getPoint("gold", 1_000_000);
        int point2 = getPoint("silver", 1_000_000);
        int point3 = getPoint("", 1_000_000);
    }
}