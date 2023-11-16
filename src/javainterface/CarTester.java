package javainterface;

public class CarTester {
    public void testCar(Car car) {
        // 운전 기능
        car.go();
        car.stop();

        // 에어콘 기능
        if (car instanceof AirConditioner) {
            AirConditioner airConditioner = (AirConditioner) car;
            airConditioner.airControl();
        }

        // 내비게이션 기능
        if (car instanceof Navigation) {
            Navigation navigation = (Navigation) car;
            navigation.navi();
        }
    }

    public static void main(String[] args) {
        Tico tico = new Tico();
        Sonata sonata = new Sonata();

        CarTester tester = new CarTester();
        tester.testCar(tico);
        tester.testCar(sonata);
    }
}
