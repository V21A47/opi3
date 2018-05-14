package l4;

public class Place {
    private String name;
    private Position currPos;
    private Terrain[] objects = new Terrain[101];

    Place(String name) {
        this.name = name;
        currPos = new Position(0, 0, 0);
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
        if (pos.isSmthNear(this.currPos) || ind < 0  || ind > 101) throw new NoFreeSpaceExeption("Нет свободного места!");
        else {
            this.objects[ind] = type;
            System.out.println("Строение " + type + " построено");
        }
    }

    public Position getPosition(){
        return currPos;
    }

    public Terrain getObject(int index){
        if(index >= 0 && index <= 101){
            return objects[index];
        } else {
            return null;
        }
    }

    public boolean equals(Object pl) {
        if (!(pl instanceof Place)) return false;
        Place place = (Place) pl;

        for(int i = 0; i < 101; i++){
            if(objects[i] != place.getObject(i)){
                System.err.println(i);
                return false;
            }
        }

        return name.equals(place.name) && currPos.equals(place.getPosition());
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return "Локация " + this.name;
    }
}
