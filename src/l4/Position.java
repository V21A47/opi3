package l4;

public class Position {
    private int x;
    private int y;
    private int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Position pos) {
        return Math.sqrt((this.x - pos.x) * (this.x - pos.x) + (this.y - pos.y) * (this.y - pos.y) + (this.z - pos.z) * (this.z - pos.z));
    }

    public boolean isSmthNear(Position pos) {
        return Math.abs(this.z - pos.z) < 3 & Math.abs(this.y - pos.y) < 3 & Math.abs(this.x - pos.x) < 3;
    }

    public boolean isSmthSeemed(Position pos) {
        return Math.abs(this.z - pos.z) < 500 && Math.abs(this.x - pos.x) < 500 && Math.abs(this.y - pos.y) < 500;
    }

    public void getPos() {
        System.out.println(x + " " + y + " " + z);
    }

    public boolean equals(Object b) {
        if (!(b instanceof Position)) return false;
        Position bc = (Position) b;
        return x == bc.x && y == bc.y && z == bc.z;
    }

    public int hashCode() {
        return x + y + z;
    }

    public String toString() {
        return "Положение (" + x + ", " + y + ", " + z + ")";
    }
}
