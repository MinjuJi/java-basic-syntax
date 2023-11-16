package javainterface;

public class Sonata implements Car, AirConditioner, Navigation {
    @Override
    public void airControl() {
        System.out.println("소나타의 실내온도를 조절합니다.");
    }

    @Override
    public void go() {
        System.out.println("소나타를 웁직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("소나타를 멈춥니다.");
    }

    @Override
    public void navi() {
        System.out.println("소나타의 길 안내 기능을 사용합니다.");
    }
}
