import java.util.Scanner;
import java.io.FileWriter;
import java.nio.file.Paths;

public class fileRead {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("C:\\\\Users\\\\imadr\\\\OneDrive\\Desktop\\\\testout.txt.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        try (FileWriter w = new FileWriter(
            Paths.get("C:\\Users\\imadr\\OneDrive\\Desktop\\testout.txt.txt").toFile(), true)) {
                w.append("Alhamdulillah\n");       
        }
        catch (Exception e) {
            e.printStackTrace();;
        }
    }
}