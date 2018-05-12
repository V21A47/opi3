package l4;

public class NoFreeSpaceExeption extends Exception {
    public NoFreeSpaceExeption() {
        super();
    }

    public NoFreeSpaceExeption(String message) {
        super(message);
    }

    public NoFreeSpaceExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFreeSpaceExeption(Throwable cause) {
        super(cause);
    }
}
