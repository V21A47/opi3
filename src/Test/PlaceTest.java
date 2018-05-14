package l4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlaceTest{

    @Test
    public void equals(){
        Place pl1 = new Place("place!");
        Place pl2 = new Place("place!");

        assertTrue(pl1.equals(pl1));
        assertTrue(pl1.equals(pl2));
        assertTrue(pl2.equals(pl1));

        try {
            pl1.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
            pl2.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
        } catch (NoFreeSpaceExeption e) {
            System.out.println("Everything is bad");
        }

        assertTrue(pl1.equals(pl1));
        assertTrue(pl1.equals(pl2));
        assertTrue(pl2.equals(pl1));
    }

    @Test
    public void addPremise(){
        Place pl = new Place("place!");

        try{
            pl.addPremise(Terrain.HOUSE, 1, new Position(20, 0, 0));
        } catch (NoFreeSpaceExeption e) {}

        assertEquals(Terrain.HOUSE, pl.getObject(1));
    }

    @Test(expected = NoFreeSpaceExeption.class)
    public void addPremiseGetException() throws NoFreeSpaceExeption{
        Place pl = new Place("place!");

        pl.addPremise(Terrain.HOUSE, 102, new Position(20, 0, 0));
    }
}
