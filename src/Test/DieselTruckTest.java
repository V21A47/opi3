package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DieselTruckTest{

    @Test
    public void putFruit(){
        DieselTruck dt = new DieselTruck(new Shorty("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0)), new Position(0, 0, 0), 0.0D);
        String s1 = "Большое краснобокое яблоко теперь в кузове!";
        String s2 = "Спелая груша теперь в кузове!";
        String s3 = "Полдесятка слив теперь в кузове!";

        assertEquals(s1, dt.putFruit(Fruit.APPLE));
        assertEquals(s2, dt.putFruit(Fruit.PEAR));
        assertEquals(s3, dt.putFruit(Fruit.PLUMS));
    }
}
