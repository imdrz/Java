import java.math.BigDecimal;
import java.math.MathContext;

public class car {
    public static void main(String[] args) {
        func(22000, 60, 366.67);
        // for (int x = 24; x<64; x+=4) {
        //     System.out.println((double) 22000/x);
        // }
    }

    public static void func(int amt, int months, double monthly) {
        BigDecimal a = BigDecimal.valueOf(amt);
        BigDecimal rate = BigDecimal.valueOf(0/12);
        BigDecimal m = BigDecimal.valueOf(monthly);
        BigDecimal intrest = rate.add(BigDecimal.valueOf(1));
        for (int x = 1; x<months+1; x++) {
            a = a.multiply(intrest);
            a = a.subtract(m);
            System.out.println(x + "-> " + a.round(MathContext.DECIMAL32));
        }
        
    }
}
