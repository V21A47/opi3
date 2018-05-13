package l4;

import java.io.Console;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Place pl = new Place("Городская местность", new Position(100, 100, 100));
        try {
            pl.addPremise(Terrain.HOUSE, 0, new Position(5, 0, 0));
            pl.addPremise(Terrain.HOUSE, 1, new Position(8, 0, 0));
            pl.addPremise(Terrain.HOUSE, 2, new Position(11, 0, 0));
        } catch (NoFreeSpaceExeption e) {
            System.out.println(e.getMessage());
        }
        Shorty[] group = new Shorty[3];
        group[0] = new Shorty("Первый", HumanState.FEAR, new Position(0, 0, 0));
        group[1] = new Shorty("Второй", HumanState.FEAR, new Position(1, 0, 0));
        group[2] = new Shorty("Третий", HumanState.FEAR, new Position(0, 1, 0));

        Shorty znaika = new Shorty("Знайка", HumanState.NOFEARLESS, new Position(1, 1, 0));

        Shorty bublik = new Shorty("Бублик", HumanState.NORMAL, new Position(1500, 1500, 0));
        Shorty shurupchik = new Shorty("Шурупчик", HumanState.NORMAL, new Position(1502, 1500, 0));
        Shorty gvozdik = new Shorty("Гвоздик", HumanState.NORMAL, new Position(1504, 1500, 0));

        DieselTruck c1 = new DieselTruck(bublik, new Position(1500, 1500, 0), 255);
        DieselTruck c2 = new DieselTruck(shurupchik, new Position(1502, 1500, 0), 235);
        DieselTruck c3 = new DieselTruck(gvozdik, new Position(1504, 1500, 0), 311);

        System.out.println(c1.putFruit(Fruit.APPLE));
        System.out.println(c2.putFruit(Fruit.PEAR));
        System.out.println(c3.putFruit(Fruit.PLUMS));


        c1.moveTo(group[0].getPosition());
        c2.moveTo(group[1].getPosition());
        c3.moveTo(group[2].getPosition());

        for (Shorty sh : group) {
            c1.cl.reactionOnCloud(sh);
            sh.hide();
        }
        znaika.hide();
    }

}
