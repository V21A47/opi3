package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CloudTest{

    @Test
    public void moveToPosition(){
        Cloud a = new Cloud(Cloud.CloudState.DUST, new Position(0, 0, 0));
        Position newPos1 = new Position(1, 1, 1);
        Position newPos2 = new Position(100, 1000, 10000);

        a.moveTo(newPos1);

        assertEquals(newPos1, a.getPosition());

        a.moveTo(newPos2);

        assertEquals(newPos2, a.getPosition());
    }

    @Test
    public void equalsWorks(){
        Cloud a = new Cloud(Cloud.CloudState.DUST, new Position(0, 0, 0));
        Cloud b = new Cloud(Cloud.CloudState.DUST, new Position(0, 0, 0));

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
}
