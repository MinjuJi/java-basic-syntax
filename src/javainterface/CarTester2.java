package javainterface;

public class CarTester2 {
    public void testCar(Car car) { // Car 타입이거나 Car 타입을 상속하거나 구현한 타입

    }

    public void testAirCon(AirConditioner airConditioner) {

    }

    public void testNavigation(Navigation navigation) {

    }

    public static void main(String[] args) {
        Tico tico = new Tico();
        Sonata sonata = new Sonata();

        CarTester2 tester2 = new CarTester2();

        // 운전 기능 테스트
        tester2.testCar(tico);
        tester2.testCar(sonata);
        // 에어컨 기능 테스트
        tester2.testAirCon(tico);
        tester2.testAirCon(sonata);
        // 네비 기능 테스트
//        tester2.testNavigation(tico);
        tester2.testNavigation(sonata);
    }
}
