package MathProject;

public class Complex {
    public double numR;
    public double numI;

    public Complex(double r, double i) {
        numR = r;
        numI = i;
    }

    public Complex(Complex c) {
        this.numR = c.numR;
        this.numI = c.numI;
    }

    public String get() {
        return numR + "+" + numI + "i";
    }

    public void add(Complex c) {
        String complex = c.toString();
        complex = complex.replace("i", "");
        String[] s = complex.split("[+]");
        double r = Double.parseDouble(s[0]);
        double i = Double.parseDouble(s[1]);
        numR+=r;
        numI+=i;
    }

    public void multiply(Complex c) {
        String complex = c.toString();
        complex = complex.replace("i", "");
        String[] s = complex.split("[+]");
        double cx = Double.parseDouble(s[0]);
        double d = Double.parseDouble(s[1]);
        double a = numR;
        double b = numI;
        numR = a*cx-b*d;
        numI = a*d+cx*b;
    }

    public void square() {
        double i = numI;
        double r = numR;
        numR = r*r-i*i;
        numI = 2*r*i;
    }

    public String toString() {
        return numR + "+" + numI + "i";
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(Math.abs(numR), 2) + Math.pow(Math.abs(numI), 2));
    }

    public static void main(String[] args) {
        Complex c = new Complex(-1,1);

        System.out.println(runIterations(c));

    }

    public static int runIterations(Complex c) {
        Complex cConst = new Complex(c);
        System.out.println(cConst);
        int i = 0;
        System.out.println("------------");
        while (c.getMagnitude() < 2) {
            i++;
            c.square();
            System.out.println("1 " + c.get());
            c.add(cConst);
            System.out.println("2 " + c.get());
            if (i>6) {
                return 6;
            }
            
            
        }
        return i;
    }
}
