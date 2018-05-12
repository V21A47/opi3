public class IllegalCarOperation extends RuntimeException {
    public IllegalCarOperation() {
        super();
    }

    public IllegalCarOperation(String message) {
        super(message);
    }

    public IllegalCarOperation(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalCarOperation(Throwable cause) {
        super(cause);
    }
}