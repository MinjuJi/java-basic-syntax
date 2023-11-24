package generic;

/*
 * <T extends 타입>으로 타입 매개변수를 제한할 수 있다.
 */
public class FruitBox<T extends Fruit> {
    T fruit;

    public void add(T t) {
        this.fruit = t;
    }

    public T get() {
        return fruit;
    }
}
