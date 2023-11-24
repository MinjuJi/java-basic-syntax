package exception;

public class InvalidCustomerGradeException extends RuntimeException {
    public InvalidCustomerGradeException() {
    }

    public InvalidCustomerGradeException(String message) {
        // super(message)는 RuntimeException
        super(message);
    }
}
