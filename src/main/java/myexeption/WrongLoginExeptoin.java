package myexeption;

public class WrongLoginExeptoin extends RuntimeException{
    public WrongLoginExeptoin() {
    }

    public WrongLoginExeptoin(String message) {
        super(message);
    }

    public WrongLoginExeptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginExeptoin(Throwable cause) {
        super(cause);
    }

    public WrongLoginExeptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
