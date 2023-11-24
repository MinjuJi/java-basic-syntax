package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapApp2 {
    public static void main(String[] args) {
        Map<String, Object> item1 = new HashMap<>();
        item1.put("no", 100);
        item1.put("name", "iphone 15");
        item1.put("maker", "apple");
        item1.put("price", 1_300_000);
        item1.put("discountRate", 0.03);

        Map<String, Object> item2 = new HashMap<>();
        item2.put("no", 101);
        item2.put("name", "iphone 16");
        item2.put("maker", "apple");
        item2.put("price", 1_500_000);
        item2.put("discountRate", 0.0);

        List<Map<String, Object>> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        for (Map<String, Object> map : items) {
            int no = (Integer) map.get("no");
            String name = (String) map.get("name");
            String maker = (String) map.get("maker");
            int price = (Integer) map.get("price");
            Double discountRate = (Double) map.get("discountRate");

            System.out.println(no);
            System.out.println(name);
            System.out.println(maker);
            System.out.println(price);
            System.out.println(discountRate);
        }
    }
}