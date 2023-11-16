package overloading;

public class CalculatorApp {
    public static void main(String[] args) {

        final Calculator calculator = new Calculator();

        int result1 = calculator.sum(10,20,30);
        int result2 = calculator.sum(10,20);

        System.out.println(result1);
        System.out.println(result2);

    }
}