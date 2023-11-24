package generic;

public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        box1.add("홍길동");
//        box1.add(1) // 컴파일 과정에서 잘못된 값이 저장되는 것을 바로 확인 가능
        System.out.println(box1.get());

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.add(100);
        int value2 = box2.get();
    }
}