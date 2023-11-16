package overriding;

public class Printer {
    String black = "부모 클래스의 멤버변수";

    public void print() {
        System.out.println("흑백으로 인쇄합니다.");
    }
}
