package exceptions;

public class DAOExceptions extends Exception {
    public DAOExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    public DAOExceptions(String message) {
        super(message);
    }
}
