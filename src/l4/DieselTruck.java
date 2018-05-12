package l4;

import java.util.Comparator;

class DieselTruck extends Car implements Comparator<DieselTruck> {

    DieselTruck(Shorty own, Position position, double volumeOfFuel) {
        super(own, position, volumeOfFuel);
    }

    String putFruit(Fruit fr) {
        return fr.lang() + " теперь в кузове!";
    }

    public String toString() {
        return "Грузовая машина " + super.getHolder();
    }

    public int compare(DieselTruck d1, DieselTruck d2) {
        return d1.getNumber().compareTo(d2.getNumber());
    }
}
