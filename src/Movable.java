public interface Movable {
    default void moveTo(Position pos) {
        System.out.println("двигается");
    }
}