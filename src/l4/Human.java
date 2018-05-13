package l4;

class Human implements Movable {
    private HumanState state;
    private String name;
    private Position currPos;

    Human(String name, HumanState state, Position position) {
        this.state = state;
        this.name = name;
        this.currPos = position;
    }

    public void moveTo(Position position) {
        currPos = position;
        System.out.println(this.toString());
    }

    public String getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.currPos;
    }

    public void setPosition(Position pos) {
         this.currPos = pos;
    }

    public void setState(HumanState state) {
        this.state = state;
    }

    public HumanState getState() {
        return state;
    }

    public boolean equals(Object b) {
        if (!(b instanceof Human)) return false;
        Human bc = (Human) b;
        return this.name.equals(bc.name) && this.currPos.equals(bc.currPos) && this.state==bc.getState();
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return "Человек " + this.name;
    }
}
