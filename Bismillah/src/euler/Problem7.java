package euler;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(wilsonTH(5));
    }
    public static BigDecimal wilsonTH(int n) {
        BigDecimal x = factorial(n);
        System.out.println(x);
        BigDecimal a = x.remainder(BigDecimal.valueOf(n+1)).divide(BigDecimal.valueOf(n));
        BigDecimal b = BigDecimal.valueOf(n-1);
        BigDecimal c = BigDecimal.valueOf(2);
        System.out.println(a + ", " + b + ", " + c);
        BigDecimal result = a.round(new MathContext(1, RoundingMode.FLOOR)).multiply(b).add(c);
        return result;
    }
    public static BigDecimal factorial(int n) {
        BigDecimal factorial = BigDecimal.valueOf(n);
        while (n > 1) {
            factorial = factorial.multiply(BigDecimal.valueOf(n-1));
            n--;
            //System.out.println(factorial + ", " + n);
        }

        return factorial;
    }
}
