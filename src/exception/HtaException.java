package exception;

public class HtaException extends RuntimeException {
    public HtaException() {

    }

    public HtaException(String message) {
        super(message);
    }

    public HtaException(Throwable cause) {
        super(cause);
    }

    public HtaException(String messasge, Throwable cause) {
        super(messasge, cause);
    }

}
