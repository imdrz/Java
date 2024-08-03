package euler;

import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Scanner;

public class LargeSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\euler\\numbers.txt"))) {
            BigInteger sum = BigInteger.valueOf(0);
            for (int x = 0; x < 100; x++) {
                BigInteger test = scanner.nextBigInteger();
                sum = sum.add(test);
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
