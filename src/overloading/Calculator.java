package overloading;

public class Calculator {
    /**
     * 정수 2개를 전달받아서 덧셈을 수행하고, 그 결과를 반환한다.
     * @param x 첫번째 정수
     * @param y 두번째 정수
     * @return 덧셈 결과값
     */
    public int sum(int x, int y){
        int result = x + y;
        return result;
    }

    /**
     * 정수 3개를 전달받아서 덧셈을 수행하고, 그 결과를 반환한다.
     * @param x 첫번째 정수
     * @param y 두번째 정수
     * @param z 세번째 정수
     * @return 덧셈 결과값
     */
    public int sum(int x, int y, int z){
        int result = x + y + z;
        return result;
    }
}
