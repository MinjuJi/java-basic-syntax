package util;

import java.util.Arrays;
import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        /*
         * int nextInt(int bound)
         * - 정수값의 범위는 0 <= 정수 < bound
         */
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        // 1 ~ 45 사이의 임의의 값을 조회하기
        System.out.println(random.nextInt(45) + 1);

        // 로또번호를 중복없이 추출하고, 추출한 결과를 오름차순으로 정렬한다.
        int[] lotto = new int[6];
        int position = 0;

        while (true) {
            int number = random.nextInt(45) + 1;

            boolean isExist = false;
            for (int index = 0; index < position; index++) {
                if (lotto[index] == number) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                lotto[position++] = number;
            }
            if (position == 6) {
                break;
            }
        }
        Arrays.sort(lotto);
        System.out.println("로또 번호: " + Arrays.toString(lotto));
    }
}