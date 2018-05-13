 package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PositionTest{

    @Test
    public void distanceMethodWorks(){
        Position pos = new Position(0, 0, 0);

        assertEquals(1, pos.distance(new Position(0, 0, 1)), 0.1);
        assertEquals(1, pos.distance(new Position(0, 1, 0)), 0.1);
        assertEquals(1, pos.distance(new Position(1, 0, 0)), 0.1);
        assertEquals(1.732050, pos.distance(new Position(1, 1, 1)), 0.00001);
    }

    @Test
    public void isSmthNear(){
        Position a = new Position(0, 0, 0);
        Position b = new Position(1, 1, 1);
        Position c = new Position(0, 0, 1);
        Position d = new Position(2, 2, 2);
        Position e = new Position(3, 3, 4);

        assertTrue(a.isSmthNear(b));
        assertTrue(b.isSmthNear(a));
        assertTrue(c.isSmthNear(d));
        assertTrue(d.isSmthNear(e));
        assertFalse(a.isSmthNear(e));
    }

    @Test
    public void isSmthSeemed(){
        Position a = new Position(0, 0, 0);
        Position b = new Position(500, 1, 1);
        Position c = new Position(450, 450, 450);
        Position d = new Position(2, 1000, 2);

        assertFalse(a.isSmthSeemed(b));
        assertFalse(b.isSmthSeemed(a));
        assertTrue(c.isSmthSeemed(b));
        assertTrue(a.isSmthSeemed(c));
        assertFalse(a.isSmthSeemed(d));
    }

    @Test
    public void equalsWorks(){
        Position a = new Position(0, 0, 0);
        Position b = new Position(0, 0, 0);

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

}
