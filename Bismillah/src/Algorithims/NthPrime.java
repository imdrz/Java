package Algorithims;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nth = 100; //541
        for (int x = 0; x < SieveOfEratosthenes(nth).length; x++) {
            System.out.println(SieveOfEratosthenes(nth)[x]);
        }
    }
    public static int[] SieveOfEratosthenes(int n) {
        int size = n*2;
        int[] nums = new int[size];
        int index = 0;
        for (int x = 2; x < size; x++) {
            nums[index] = x;
            index++;
        }
        return nums;
    }
}
