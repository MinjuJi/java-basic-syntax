package exception;

public class ExceptionApp6 {
    public static void main(String[] args) {
        // String str = "1";
        String str = "일";
        int pageNo = NumberUtils.toInt(str, 1);
        int start = (pageNo - 1) * 10 + 1;
        int end = pageNo * 10;

        System.out.println("페이지 번호: " + pageNo);
        System.out.println("조회 시작 번호: " + start);
        System.out.println("조회 종료 번호: " + end);
    }
}