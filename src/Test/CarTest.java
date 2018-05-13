package l4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest{

    @Test
    public void moveToMovesToThePosition(){
        Car car1 = new Car(new Human("JORA", HumanState.NORMAL, new Position(0, 0, 0)), new Position(0, 0, 0), 100) {};
        Car car2 = new Car(new Human("FEDA", HumanState.NORMAL, new Position(0, 0, 0)), new Position(0, 0, 0), 0) {};

        Position p = new Position(10, 10, 10);

        car1.moveTo(p);
        car2.moveTo(p);

        assertEquals(p, car1.getPosition());
        assertEquals(new Position(0, 0, 0), car2.getPosition());
    }

    @Test
    public void giveNumberReturnsCarNumber(){
        String t1 = Car.Number.giveNumber();
        String t2 = Car.Number.giveNumber();
        String t3 = Car.Number.giveNumber();
        assertEquals("13DN15 is not " + t1, "13DN15", t1);
        assertEquals("14EO16 is not " + t2, "14EO16", t2);
        assertEquals("15FP17 is not " + t3, "15FP17", t3);

        for(int i = 0; i < 100; i++){
            System.out.print("   " + Car.Number.giveNumber());
        }
    }

    @Test
    public void equalsWorksWell(){
        Car car1 = new Car(new Human("JORA", HumanState.NORMAL, new Position(0, 0, 0)), new Position(0, 0, 0), 100) {};
        Car car2 = car1;

        assertEquals(true, car1.equals(car1));
        assertEquals(true, car1.equals(car2));
        assertEquals(true, car2.equals(car1));
    }



}
