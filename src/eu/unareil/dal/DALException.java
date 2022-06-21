package eu.unareil.dal;

public class DALException extends Exception {
    public DALException(String message) {
        super("DALException " + message);
    }

    public DALException(String message, Throwable cause) {
        super("DALException " + message, cause);
    }

    public DALException(Throwable cause) {
        super(cause);
    }
}
