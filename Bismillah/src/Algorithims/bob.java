package Algorithims;

public class bob {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        int[] numsFinal = filterPrimes(nums);
        printArray(numsFinal);
    }
    public static int[] filterPrimes(int[] arr) {
        for (int num: arr) {
            
        }
        return new int[]{1, 2, 3};
    }
    public static void printArray(int[] arr) {
        for (int x = 0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}
