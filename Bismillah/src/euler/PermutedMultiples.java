package euler;

import java.util.Arrays;

public class PermutedMultiples {
    public static void main(String[] args) {
        int[] digits = returnDigits(125874);
        System.out.println(digits.length);
        sort(digits);
        for (int x = 0; x < digits.length; x ++) {
            System.out.println(digits[x]);
        }
    }

    public static int[] returnDigits(int num) {
        int[] digits = new int[100];
        while (num > 0) {
            int digit = num % 10;
            num = num/10;
            //System.out.println(digit);
        }
        return new int[] {1, 2, 3, 4};
    }

    public static void sort(int[] input) {
        Arrays.sort(input);
    }
}
