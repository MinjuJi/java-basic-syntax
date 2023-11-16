package overriding;

public class ColorPrinter extends Printer {
    String black = "자식 클래스의 멤버변수";

    public void print() {
        System.out.println("컬러로 인쇄합니다.");
    }

}
