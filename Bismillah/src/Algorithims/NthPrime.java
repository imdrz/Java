package Algorithims;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nth = 100; //541
        int size = nth * 2;
        int[] primes = getPrimes(size);
        for (int x = 0; x < primes.length; x++) {
            System.out.println(primes[x]);
        }
    }
    public static int[] getPrimes(int size) {
        int[] primes = new int[size];
        int index = 0;
        for (int i = 2; i < size; i++) {
            primes[index] = i;
            index++;
        }
        System.out.println(primes[primes.length-1]);
        for (int i = 0; i < primes.length; i++) {
            if (checkPrime(primes[i])) {
                //System.out.println("john");
                for (int j = i + 1; j < primes.length; j++) {
                    System.out.println(j + ", " + i);
                    System.out.println(primes[j] + ", " + primes[i]);
                    if (primes[j] % primes[i] == 0) {
                        primes[j] = 0;
                        //System.out.println("bob");
                    }
                }                
            }
        }



        return primes;
    }
    public static boolean checkPrime(int num) {
        for (int x = 2; x < Math.floor(num/2); x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
    
}
