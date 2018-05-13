package l4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest{
    @Test
    public void giveNumberReturnsCarNumber(){
        // assert
        String t1 = Car.Number.giveNumber();
        String t2 = Car.Number.giveNumber();
        String t3 = Car.Number.giveNumber();
        assertEquals("10BK12 is not " + t1, "10BK12", t1);
        assertEquals("11BL13 is not " + t2, "11BL13", t2);
        assertEquals("12CM14 is not " + t3, "12CM14", t3);
    }
}
