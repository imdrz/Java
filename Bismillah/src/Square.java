public class Square

{

    private double side;

    public Square(double a)

    {

        double side = a;

    }

    public double area()

    {

        return side * side;

    }

    public static void main(String[] args)

    {

        Square r = new Square(10.0);

        System.out.println(r.area());

    }

}