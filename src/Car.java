abstract class Car implements Movable {
    private Human carHolder;
    private Position currPos;
    private double volumeOfFuel;
    Cloud cl;
    private String number;

    static class Number {
        private static int first = 9;
        private static char second = 'A' - 1;
        private static int third = 11;

        static String giveNumber() throws IllegalCarOperation {

            if (third == 99) throw new IllegalCarOperation("Машине не удалось присвоить новый номер," +
                    " так как все возможные номера уже задействованы!");
            first++;
            second++;
            third++;
            return first + "" + second + "" + (char) (second + 10) + "" + third;
        }
    }

    Car(Human owner, Position position, double volumeOfFuel) {
        this.carHolder = owner;
        this.currPos = position;
        this.volumeOfFuel = volumeOfFuel;
        this.number = Number.giveNumber();
    }

    public String getNumber() {
        return number;
    }

    public void moveTo(Position position) {
        System.out.println("Едем, едем ");
        riseDust();

        class Fuel {
            private double fuel = volumeOfFuel;
            private int consumption = 12;

            private boolean isFuelEnough() {
                return currPos.distance(position) < fuel * consumption;
            }
        }

        Fuel fuelTank = new Fuel();
        if (fuelTank.isFuelEnough()) {
            volumeOfFuel -= currPos.distance(position) * fuelTank.consumption;
            currPos = position;
            carHolder.setPosition(position);

        } else {
            System.out.println("Топлива не хватит!");
        }
    }

    private void riseDust() {
        cl = new Cloud(Cloud.CloudState.DUST, currPos);
        cl.moveTo(currPos);
    }

    Human getHolder() {
        return carHolder;
    }

    public boolean equals(Object b) {
        if (!(b instanceof Car)) return false;
        Car bc = (Car) b;
        return this.number.equals(bc.number);
    }

    public int hashCode() {
        if(this==null) return 0;
        return carHolder.hashCode();
    }

    public String toString() {
        return "Машина " + carHolder;
    }
}