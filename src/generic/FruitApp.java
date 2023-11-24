package generic;

public class FruitApp {
    public static void main(String[] args) {
        FruitBox<Apple> box1 = new FruitBox<>();
        box1.add(new Apple());
        Apple apple = box1.get();

//        <T extends 타입>으로 타입 매개변수를 제한
//        FruitBox<String> box2 = new FruitBox<>();
//        box2.add("홍길동");
//        String value1 = box2.get();

        FruitBox<Fruit> box3 = new FruitBox<>();
        box3.add(new Fruit());
        box3.get();

//        제네릭 객체의 타입 파라미터 간에는 형변환이 불가능하다.
//        FruitBox<Fruit> box4 = new FruitBox<Apple>();

//        와일드 카드를 사용하면 제네릭 객체의 타입 파라미터 간에는 형변환 가능
        FruitBox<? extends Fruit> box5 = new FruitBox<Apple>();

    }
}