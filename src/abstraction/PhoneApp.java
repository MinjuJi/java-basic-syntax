package abstraction;

public class PhoneApp {
    public static void main(String[] args) {
        // 인터페이스 타입으로 참조 변수 선언
        NormalPhone p1 = new NormalPhone();
        Phone p2 = new Iphone();

        // 참조변수 타입에 따른 메소드 사용 범위
        // 참조변수 타입을 객체를 담는 그릇의 크기라고 생각하면 편함
        Iphone p3 = new Iphone();
        SmartPhone p4 = new Iphone();
        Phone p5 = new Iphone();

        p3.game();
        p3.internet();
        p3.call("010-1111-2222");
        p3.receive();
        p3.sms("010-1111-2222", "안녕하세요");

        p4.game();
        p4.internet();
//        p4.call("010-1111-2222");
//        p4.receive();
//        p4.sms("010-1111-2222", "안녕하세요");

//        p5.game();
//        p5.internet();
        p5.call("010-1111-2222");
        p5.receive();
        p5.sms("010-1111-2222", "안녕하세요");
    }
}
