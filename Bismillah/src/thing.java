public class thing {
    public static void main(String[] args) {
        int[] test = new int[20];
        test[0] = 1;
        System.out.println(sumOf(4, 5));
        System.out.println(test[4]);
    }

    public static int sumOf(int numOne, int numTwo) {
        return (numOne + numTwo);
    }
}
