import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class QueueFiller {

    public static Queue<Toy> fill(Queue<Toy> toyQueue, List toyList) {
        toyQueue.addAll(toyList);
        return toyQueue;
    }

    public static Comparator<Toy> weightComparator = new Comparator<Toy>() {
        @Override
        public int compare(Toy c1, Toy c2) {
            return (int) (c1.getWeight() - c2.getWeight());
        }
    };
}
