package collection;

import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("다");
        set.add("라");
        set.add("가");
        set.add("나");

        for (String str : set) {
            System.out.println(str);
        }
    }
}
