package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class HumanTest{
    private Human a = null;

    @Before
    public void setHuman(){
        a = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));
    }

    @Test
    public void moveToDifferentPositions(){
        a.moveTo(new Position(100, 100, 100));
        assertEquals("Can't move to 100,100,100", new Position(100, 100, 100), a.getPosition());

        a.moveTo(new Position(0, 0, 0));
        assertEquals("Can't move to 0,0,0", new Position(0, 0, 0), a.getPosition());

        a.moveTo(new Position(-100, -100, -100));
        assertEquals("Can't move to -100,-100,-100", new Position(-100, -100, -100), a.getPosition());

        a.moveTo(new Position(1, 2, 3));
        assertEquals("Can't move to 1,2,3", new Position(1, 2, 3), a.getPosition());

        a.moveTo(new Position(25, -12, 1000));
        assertEquals("Can't move to 25,-12,1000", new Position(25, -12, 1000), a.getPosition());

        a.moveTo(new Position(-1, -234, -10000));
        assertEquals("Can't move to -1,-234,-10000", new Position(-1, -234, -10000), a.getPosition());
    }

    @Test
    public void setPositionWorks(){
        Position newPos = new Position(250, 100, 0);
        a.setPosition(new Position(250, 100, 0));

        assertEquals("Position wasn't set!", newPos, a.getPosition());
    }

    @Test
    public void setStateWorks(){
        a.setState(HumanState.NOFEARLESS);
        assertEquals("State wasn't set to NOFEARLESS", HumanState.NOFEARLESS, a.getState());

        a.setState(HumanState.FEAR);
        assertEquals("State wasn't set to FEAR", HumanState.FEAR, a.getState());
    }

    @Test
    public void equalsWorks(){
        Human h1 = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));
        Human h2 = new Human("Abvgdezh", HumanState.NORMAL, new Position(0, 0, 0));

        assertTrue("h1 is not equals to h1", h1.equals(h1));
        assertTrue("h1 is not equals to h2", h1.equals(h2));
        assertTrue("h2 is not equals to h1", h2.equals(h1));
    }
}
