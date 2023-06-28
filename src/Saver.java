import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    public void saveToFileRaffle(Toy toy) {
        String fileName = "raffle.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"ID\":\"" + toy.getId() + "\",\n");
            writer.write("\"Toy\":\"" + toy.getName() + "\",\n");
            writer.write("\"Weight\":" + toy.getWeight() + "\n");
            writer.write("}\n");
            writer.write("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
