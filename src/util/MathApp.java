package util;

public class MathApp {
    public static void main(String[] args) {
        /* java.lang.Math 클래스
         * - 수학연산과 관련된 정적메소드를 제공하는 클래스
         * - Math 클래스는 상수와 정적 메소드만으로 구성된 클래스다.
         * */
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println("절대값: " + Math.abs(10));
        System.out.println("절대값: " + Math.abs(-10));

        System.out.println("최솟값: " + Math.min(12, 200));
        System.out.println("최댓값: " + Math.max(12, 200));

        System.out.println("제곱값: " + Math.pow(2, 3));

        System.out.println("반올림: " + Math.round(3.14));
        System.out.println("반올림: " + Math.round(3.56));

        System.out.println("내림: " + Math.floor(1.5));
        System.out.println("내림: " + Math.floor(1.8));
        System.out.println("내림: " + Math.floor(2.0));

        System.out.println("올림: " + Math.ceil(1.0));
        System.out.println("올림: " + Math.ceil(1.5));
        System.out.println("올림: " + Math.ceil(1.8));

    }
}
