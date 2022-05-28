package by.akimova.document_management_system.exception;

public class NotExistException extends RuntimeException {

    public NotExistException() {
        super();
    }

    public NotExistException(final String message) {
        super(message);
    }

    public NotExistException(final Exception e) {
        super(e);
    }

    public NotExistException(final String message, final Exception e) {
        super(message, e);
    }
}
