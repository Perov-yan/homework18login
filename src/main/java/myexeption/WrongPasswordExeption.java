package myexeption;

public class WrongPasswordExeption extends RuntimeException{
    public WrongPasswordExeption() {
    }

    public WrongPasswordExeption(String message) {
        super(message);
    }

    public WrongPasswordExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordExeption(Throwable cause) {
        super(cause);
    }

    public WrongPasswordExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
