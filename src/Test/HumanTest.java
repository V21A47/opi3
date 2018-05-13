package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HumanTest{

    @Test
    public void moveToPosition(){
        Human a = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));
        Position newPos1 = new Position(100, 100, 100);
        Position newPos2 = new Position(0, 0, 0);

        a.moveTo(new Position(100, 100, 100));

        assertEquals(newPos1, a.getPosition());

        a.moveTo(new Position(0, 0, 0));

        assertEquals(newPos2, a.getPosition());
    }

    @Test
    public void setPosition(){
        Human a = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));
        Position newPos = new Position(250, 100, 0);

        a.setPosition(new Position(250, 100, 0));

        assertEquals(newPos, a.getPosition());
    }

    @Test
    public void setState(){
        Human a = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));

        a.setState(HumanState.NOFEARLESS);

        assertEquals(HumanState.NOFEARLESS, a.getState());
    }

    @Test
    public void equals(){
        Human a = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));
        Human b = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
}
