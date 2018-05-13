package l4;

import java.util.Comparator;

class DieselTruck extends Car {

    public DieselTruck(Shorty own, Position position, double volumeOfFuel) {
        super(own, position, volumeOfFuel);
    }

    public String putFruit(Fruit fr) {
        return fr.lang() + " теперь в кузове!";
    }

    public String toString() {
        return "Грузовая машина " + super.getHolder();
    }
}
