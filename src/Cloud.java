class Cloud implements Movable {
    private CloudState state;
    private Position currPos;

    Cloud(CloudState state, Position position) {
        this.state = state;
        currPos = position;
    }

    public enum CloudState {
        DUST,
        WATER
    }

    public void moveTo(Position position) {
        System.out.println("Облако поплыло..");
        this.currPos = position;
    }

    public void reactionOnCloud(Human hum) {
        if (currPos.isSmthSeemed(new Position(0, 0, 0))) hum.getState().reaction();
    }

    public boolean equals(Object b) {
        if (!(b instanceof Cloud)) return false;
        Cloud bc = (Cloud) b;
        return super.equals(b) && currPos.equals(bc.currPos);
    }

    public int hashCode() {
        return state.hashCode() + currPos.hashCode();
    }

    public String toString() {
        return "Я тучка-тучка-тучка, я вовсе не медведь " + this.state;
    }
}