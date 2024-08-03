package euler;

import java.util.Arrays;

public class PermutedMultiples {
    public static void main(String[] args) {
        // Answer = 142857
        for (int i = 0; i < 999999; i++) {
            int[] x = returnDigits(i);
            int[] xx = returnDigits(i);
            sort(xx);
            int[] x2 = returnDigits(i*2);
            sort(x2);
            int[] x3 = returnDigits(i*3);
            sort(x3);
            int[] x4 = returnDigits(i*4);
            sort(x4);
            int[] x5 = returnDigits(i*5);
            sort(x5);
            int[] x6 = returnDigits(i*6);
            sort(x6);
            if (checkArraysEqual(xx, x2) && checkArraysEqual(xx, x3) && checkArraysEqual(xx, x4) && checkArraysEqual(xx, x5) && checkArraysEqual(xx, x6)) {
                for (int f = 0; f < x.length; f++) {
                    System.out.println(x[f]);
                }
            }
        }
    }

    public static int[] returnDigits(int num) {
        int[] digits = new int[getNumLength(num)];
        int x = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num/10;
            digits[x] = digit;
            x++;
            //System.out.println(digit);
        }
        return digits;
    }

    public static void sort(int[] input) {
        Arrays.sort(input);
    }
    public static int getNumLength(int num) {
        int count = 0;
        while (num > 0) {
            num = num/10;
            count++;
        }
        return count;
    }
    public static boolean checkArraysEqual(int[] x, int[] y) {
        int l = x.length;
        for (int i = 0; i < l; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;

    }
}
