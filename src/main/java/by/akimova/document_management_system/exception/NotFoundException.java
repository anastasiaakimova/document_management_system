package by.akimova.document_management_system.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
    }

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final Exception e) {
        super(e);
    }

    public NotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
