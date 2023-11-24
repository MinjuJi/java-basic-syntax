package exception;

// 사용자 정의 예외 클래스 예제
public class UserException extends RuntimeException {
    private String errorCode;

    public UserException(String errorCode) {
        this.errorCode = errorCode;
    }

    public UserException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return "[" + errorCode + "]" + super.getMessage();
    }
}
