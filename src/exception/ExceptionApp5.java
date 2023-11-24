package exception;

public class ExceptionApp5 {
    public static void main(String[] args) {
        String str = "1";
        // String str = "일";

        int pageNo = 0;
        try {
            pageNo = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            pageNo = 1;
        }
        System.out.println("요청한 페이지 번호: " + pageNo);

        int start = (pageNo - 1) * 10 + 1;
        int end = pageNo * 10;

        System.out.println("조회 시작 번호: " + start);
        System.out.println("조회 종료 번호: " + end);
    }
}