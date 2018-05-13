package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ShortyTest{

    @Test
    public void feedWorks(){
        Shorty sh1 = new Shorty("Shorty_1", HumanState.NORMAL, new Position(0, 0, 0));
        Shorty sh2 = new Shorty("Shorty_2", HumanState.NORMAL, new Position(0, 0, 0));

        assertEquals("Коротышка Shorty_1 покормил Shorty_2", sh1.feed(sh2));
        assertEquals("Коротышка Shorty_2 покормил Shorty_1", sh2.feed(sh1));
    }

    @Test
    public void hideWorks(){
        Shorty sh1 = new Shorty("Shorty_1", HumanState.FEAR, new Position(0, 0, 0));

        assertEquals("Shorty_1 спрятался в доме и выглядывает в окно", sh1.hide());

        sh1 = new Shorty("Shorty_1", HumanState.NOFEARLESS, new Position(0, 0, 0));

        assertEquals("Shorty_1 остался на дороге", sh1.hide());

        sh1 = new Shorty("Shorty_1", HumanState.NORMAL, new Position(0, 0, 0));

        assertEquals("", sh1.hide());
    }
}
