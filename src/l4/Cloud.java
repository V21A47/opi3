package l4;

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

    public Position getPosition(){
        return currPos;
    }

    public void moveTo(Position position) {
        System.out.println("Облако поплыло..");
        this.currPos = position;
    }

    public void reactionOnCloud(Human hum) {
        if (currPos.isSmthSeemed(new Position(0, 0, 0))) hum.getState().reaction();
    }

    public CloudState getState(){
        return state;
    }

    public boolean equals(Object b) {
        if (!(b instanceof Cloud)) return false;
        Cloud bc = (Cloud) b;
        return this.state.equals(bc.getState()) && this.currPos.equals(bc.getPosition());
    }

    public int hashCode() {
        return state.hashCode() + currPos.hashCode();
    }

    public String toString() {
        return "Я тучка-тучка-тучка, я вовсе не медведь " + this.state;
    }
}
