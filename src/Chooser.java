import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;


public class Chooser {

    static Saver saver = new Saver();

    public static void get(Queue<Toy> queue) {
        List<Toy> toyList = new ArrayList<>(queue);
        List<Integer> getWeight = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 3, 3, 3));
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            flag = 0;
            int random = (int) (Math.random() * getWeight.size());
            int gotWeight = getWeight.get(random);

            for (int j = 0; j < toyList.size(); j++) {
                if (toyList.get(j).getWeight() == gotWeight) {
                    System.out.println(toyList.get(j));
                    saver.saveToFileRaffle(toyList.get(j));
                    toyList.remove(j);
                    System.out.println(toyList);
                    System.out.println("_____________________");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int k = 0; k < getWeight.size(); k++) {
                    if (getWeight.get(k) == random) {
                        getWeight.remove(k);
                    }
                }
                i--;
            }
        }
        queue.clear();
        queue.addAll(toyList);
    }
}
