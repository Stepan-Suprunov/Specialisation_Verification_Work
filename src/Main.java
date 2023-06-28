// Промежуточная контрольная работа по блоку специализация. Супрунов Степан.

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Lego> legos = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        List<Doll> dolls = new ArrayList<>();

        Queue<Toy> toys = new PriorityQueue<>(QueueFiller.weightComparator);

        Lego lego1 = new Lego(1, "lego");
        Lego lego2 = new Lego(2, "lego");
        Lego lego3 = new Lego(3, "lego");
        Lego lego4 = new Lego(4, "lego");
        Robot robot1 = new Robot(5, "robot");
        Robot robot2 = new Robot(6, "robot");
        Robot robot3 = new Robot(7, "robot");
        Robot robot4 = new Robot(8, "robot");
        Doll doll1 = new Doll(9, "doll");
        Doll doll2 = new Doll(10, "doll");
        Doll doll3 = new Doll(11, "doll");
        Doll doll4 = new Doll(12, "doll");

        legos.add(lego1);
        legos.add(lego2);
        legos.add(lego3);
        legos.add(lego4);
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        robots.add(robot4);
        dolls.add(doll1);
        dolls.add(doll2);
        dolls.add(doll3);
        dolls.add(doll4);

        QueueFiller.fill(toys, legos);
        QueueFiller.fill(toys, robots);
        QueueFiller.fill(toys, dolls);

        System.out.println("СПИСОК ИГРУШЕК ДО РОЗЫГРЫША:");
        System.out.println(toys);
        System.out.println("*********************************");
        Chooser.get(toys);
        System.out.println("СПИСОК ИГРУШЕК ОСТАВШИХСЯ ПОСЛЕ 10 РОЗЫГРЫШЕЙ:");
        System.out.println(toys);
        System.out.println("*********************************");
    }
}