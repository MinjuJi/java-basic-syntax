package exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionApp10 {

    public static void main(String[] args) {
        try {
            int point1 = getPoint("gold", 100_000);
            System.out.println("포인트: " + point1);

            int point2 = getPoint("silver", 60_000);
            System.out.println("포인트: " + point2);

            int point3 = getPoint("guest", 60_000);
            System.out.println("포인트: " + point3);
        } catch (InvalidCustomerGradeException e) {
            e.printStackTrace();
        }
    }

    public static int getPoint(String grade, int orderPrice) {
        Map<String, Double> map = new HashMap<>();
        map.put("gold", 0.05);
        map.put("silver", 0.03);
        map.put("bronze", 0.01);

        if (!map.containsKey(grade)) {
            throw new InvalidCustomerGradeException(grade);
        }

        double rate = map.get(grade);
        int point = (int) (orderPrice * rate);
        return point;
    }
}
