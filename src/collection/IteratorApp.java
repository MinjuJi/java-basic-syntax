package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김유신", "강감찬", "이순신", "류관순");

        System.out.println("일반 for문을 사용해서 반복처리");
        int size = list.size();
        for (int index = 0; index < size; index++) {
            String name = list.get(index);
            System.out.println(name);
        }

        System.out.println("\n향상된 for문을 사용해서 반복처리");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("\nIterator를 사용해서 반복처리");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        System.out.println("\nStream을 사용해서 반복처리하기");
        list.stream().forEach(System.out::println);
    }
}