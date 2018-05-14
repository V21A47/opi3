package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class PlaceTest{
    private Place pl1 = null;
    private Place pl2 = null;

    @Before
    public void initPlaces(){
        pl1 = new Place("place!");
        pl2 = new Place("place!");
    }


    @Test
    public void equalsJustByConstructors(){
        assertTrue("Equals to itself doesn't work!", pl1.equals(pl1));
        assertTrue("pl1 is not equals to pl2!", pl1.equals(pl2));
        assertTrue("pl2 is not equals to pl1!", pl2.equals(pl1));
    }


    @Test
    public void equalsUsingElements(){
        try {
            pl1.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
            pl2.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
        } catch (NoFreeSpaceExeption e) {
            System.out.println("Everything is bad");
        }

        assertTrue("Equals to itself doesn't work!", pl1.equals(pl1));
        assertTrue("pl1 is not equals to pl2!", pl1.equals(pl2));
        assertTrue("pl2 is not equals to pl1!", pl2.equals(pl1));
    }


    @Test
    public void addPremiseAddedObjectCanBeAdded(){
        Place pl = new Place("place!");

        try{
            pl.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
        } catch (NoFreeSpaceExeption e) {}

        assertEquals("Added object is not in terrain!", Terrain.HOUSE, pl.getObject(1));
    }

    @Test(expected = NoFreeSpaceExeption.class)
    public void addPremiseGetException() throws NoFreeSpaceExeption{
        Place pl = new Place("place!");

        pl.addPremise(Terrain.HOUSE, 102, new Position(20, 0, 0));
    }
}
