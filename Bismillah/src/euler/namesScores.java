package euler;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;

public class namesScores {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\names.txt"))) {
        //try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\smallNames.txt"))) {
            String line = scanner.nextLine();
            String[] names = line.split(",");
            Arrays.sort(names);
            long sum = 0;
            int index = 1;
            for (String name: names) {
                long score = 0;
                for (int x = 1; x < name.length()-1; x++) {
                    score += alphabet.indexOf(name.charAt(x)) + 1;
//                    System.out.println(name + ", " + score + ", " + index);
                }
                score *= index;
                sum += score;
                index++;
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
