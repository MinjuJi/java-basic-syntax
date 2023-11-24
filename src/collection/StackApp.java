package collection;

import java.util.Stack;

public class StackApp {
    /*
     * Stack 클래스
     * - 후입선출 자료구조
     * - Stack은 List 인터페이스의 구현 클래스
     * - Stack의 메소드를 사용하기 위해서는 Stack 타입의 참조변수에 객체를 대입해야 한다.
     * - List<> stack = new Stack<>(); ( X ) / Stack<> stack = new Stack<>(); ( O )
     *
     * - 주요 메소드 ------------------------------------------------------
     * - E push(E item): 지정된 객체를 스택의 맨 위에 추가한다.
     * - E pop(): 스택의 맨위에 있는 객체를 삭제하고, 그 객체를 반환한다.
     * - E peek(): 스택의 맨 위에 있는 객체를 삭제없이 반환한다.
     * -----------------------------------------------------------------
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("홍길동");
        stack.push("김유신");
        stack.push("강감찬");

        System.out.println(stack);

    }

}
