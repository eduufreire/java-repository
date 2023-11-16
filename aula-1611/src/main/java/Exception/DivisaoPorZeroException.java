package Exception;

public class DivisaoPorZeroException extends Exception{

    public DivisaoPorZeroException() {
    }

    public DivisaoPorZeroException(String message) {
        super(message);
    }

    public DivisaoPorZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisaoPorZeroException(Throwable cause) {
        super(cause);
    }
}
