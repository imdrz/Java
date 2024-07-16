package euler;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class FibonacciNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            BigDecimal num = binetFormula(i);
            int numDigits = num.precision();
            System.out.println(i + ":" + numDigits);
            if (numDigits == 1000) {
                System.out.println(num);
                break;
            }
        }
    }
    public static int fSequence (int index) {
        int n1 = 1;
        int n2 = 1;
        for (int x = 0; x < index-1; x ++) {
            
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            //System.out.println(n1);

        }
        return n1;
    }
    public static int returnDigits(long num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num/10;
        }
        return digits;
    }
    public static long binetFormula(long n) {
        double num = (1/Math.sqrt(5))*(Math.pow((((1+Math.sqrt(5))/2)), n)-Math.pow(((1-Math.sqrt(5))/2), n));
        return (long)num;
    }

    static BigDecimal SQ_5 = new BigDecimal(5).sqrt(MathContext.DECIMAL32);
    static MathContext mc = new MathContext(2, RoundingMode.HALF_UP) ;

    public static BigDecimal binetFormula(int n) {

        BigDecimal a = BigDecimal.valueOf(1).add(SQ_5).divide(BigDecimal.valueOf(2)).pow(n);
        BigDecimal b = BigDecimal.valueOf(1).subtract(SQ_5).divide(BigDecimal.valueOf(2)).pow(n);
        BigDecimal c = BigDecimal.valueOf(1).divide(SQ_5, mc);
        BigDecimal res = c.multiply(a.subtract(b));
        res = res.setScale(0, RoundingMode.DOWN);
        return res;
    }
}