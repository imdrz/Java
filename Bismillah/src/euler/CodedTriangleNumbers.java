package euler;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class CodedTriangleNumbers {
    public static void main(String[] args) {
        // Longest string, "ADMINISTRATION", has 16 characters, 14 letters
        // Largest letter score is 26
        // Largest word value = 14*26 = 364
        //
        // Triangle number at n = 27 is 378

        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\txtDocuments\\words.txt"))) {
            String line = scanner.nextLine();
            String[] words = line.split(",");
            Arrays.sort(words);
            int count = 0;
            for (int x = 0; x < words.length; x++) {
                int value = wordValue(words[x]);
                for (int i = 1; i < 28; i++) {
                    if (value == triangleNumber(i)) {
                        count++;
                    }
                }
            }
            System.out.println("There are " + count + " triangle words in the given file.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int wordValue(String word) {
        // Works when word is surrounded by non-alphabet characters
        // "SKY", 'BOB'
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int value = 0;
        for (int x = 1; x < word.length()-1; x++) {
            value += alphabet.indexOf(word.charAt(x))+1;
        }
        return value;
    }

    public static int triangleNumber(int n) {
        int num = (int)(n*(n+1)*0.5);
        return num;
    }
}
