import java.util.Random;
import java.util.Scanner;
public class r {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int randInt = r.nextInt(100);
        System.out.println(randInt);
        if (randInt > 50) {
            System.out.println("Greater than 50");
        }
        System.out.println(generateRandom(1000, 9999));
    }

    public static int generateRandom(int numOne, int numTwo) {
        Random r = new Random();
        int randNum = (r.nextInt(numTwo - numOne + 1) + numOne);
        return randNum;
    }
}
