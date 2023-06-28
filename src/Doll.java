public class Doll extends Toy {

    int weight;

    public Doll(int id, String name) {
        super(id, name);
        this.weight = 3;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return String.format("id: %d; name: %s; weight: %d;", id, name, weight);
    }
}
