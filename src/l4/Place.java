package l4;

public class Place {
    private String name;
    private Position currPos;
    private Terrain[] objects = new Terrain[101];

    Place(String name) {
        this.name = name;
        currPos = null;
        System.out.println("Место - " + name + " успешно создано");
    }

    public Place(String name, Position pos) {
        this.name = name;
        currPos = pos;
        System.out.println("Место - " + name + " успешно создано");
    }

    String getName() {
        return name == null ? "..." : name;
    }

    public void addPremise(Terrain type, int ind, Position pos) throws NoFreeSpaceExeption {
        if (pos.isSmthNear(this.currPos)) throw new NoFreeSpaceExeption("Нет свободного места!");
        else {
            this.objects[ind] = type;
            System.out.println("Строение " + type + " построено");
        }
    }

    public boolean equals(Object pl) {
        if (!(pl instanceof Human)) return false;
        Place place = (Place) pl;
        return super.equals(pl) && name.equals(place.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return "Локация " + this.name;
    }
}
