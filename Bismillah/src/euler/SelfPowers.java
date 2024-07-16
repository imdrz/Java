package euler;

import java.math.BigInteger;

public class SelfPowers {
    public static void main(String[] args) {
        int max = 1000;
        BigInteger sum = BigInteger.valueOf(0);
        for (int x = 1; x < max+1; x++) {
            BigInteger num = BigInteger.valueOf(x).pow(x);
            System.out.println(x + ", " + num);
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
