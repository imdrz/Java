import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // ArrayList<String> tupleItems = new ArrayList<String>();
        // tupleItems.add("one");
        // tupleItems.add("two");
        // tupleItems.add("three");
        // tupleItems.add("bob");
        // tupleItems.add("billy");
        // tupleItems.add("john");
        // Tuple<String> tuple = new Tuple<String>(tupleItems);
        // System.out.println(tuple);
        // ArrayList<Tuple> tupleTuples = new ArrayList<Tuple>();
        // tupleTuples.add(tuple);
        // Tuple<Tuple> tuple2 = new Tuple<Tuple>(tupleTuples);
        // System.out.println(tuple.toArray());
        // System.out.println(tuple2.toArray());
        // Scanner scanner = new Scanner(System.in);
        // TicTacToe test = new TicTacToe(scanner);
        // // TestClass test = new TestSubClass(3);
        // System.out.println((int)Math.rint(360*0.6473));
        // int n = 40;
        // int a = ((n/10)%10);
        // int b = ((n/100)%10);
        // System.out.println(a + " - " + b);
        // System.out.println(n-((n/100)%10)*100-((n/10)%10)*10 + ((n/10)%10)*100 +
        // ((n/100)%10)*10);
        // Xyz l = new Xyz();
        // l.c();
        // int m = 4;
        // int na = 12;
        // System.out.println(m % (na + 1) + na % (m + 1));

        // int f = 3;
        // f*=2;
        // f/=5;
        // f++;
        // System.out.println(f);

        // System.out.println(Math.sqrt(-1));

        // int a = 1;
        // int b = 1;

        // System.out.println(4.0==4);

        palindromeChecker("level up");
        System.out.println(!false);

        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = numbers[0] + 1;
        numbers[numbers[0]] = numbers[1];

        for (int x = 3; x < numbers.length; x++) {
            numbers[x] = numbers[x-1]*2;
        }

        System.out.println(Arrays.toString(numbers));

        int[] test = new int[]{2, 3, 4, 5, 0};
        for (int i = test.length - 1; i > 1; i--) {
            test[i] = test[i-1];
        }
        test[1] = 100;
        System.out.println(Arrays.toString(test));

        String str = "AP";
        str += "CS" + 1 + 2;
        System.out.println(str);

        HiddenWord w = new HiddenWord("HARPS");
        System.out.println(w.getHint("HEART"));

    }

    public static String wordPlay(String word) {
        String str = "";
        for (int k = 0; k < word.length(); k++) {
            if (k % 3 == 0) {
                str = word.substring(k, k + 1) + str;
            }
        }
        return str;
    }

    public static String changeStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= str.length() / 2; i -= 2) {
            result += str.substring(i, i + 1);
        }
        return result;
    }

    public static String negative(String n) {
        n = n.replaceAll("0", "a");

        n = n.replaceAll("1", "b");

        n = n.replaceAll("-", "1");

        n = n.replaceAll("d", "0");
        System.out.println(n);
        return n;

    }

    public static String q4b(String dateStr) {
        int i = 0;
        String f = "";

        i = dateStr.indexOf("/");
        String m = dateStr.substring(0, i);
        if (Integer.valueOf(m) < 10 && m.startsWith("0") == false) {
            m = "0" + m;
        }
        dateStr = dateStr.replace(dateStr.substring(0, i + 1), "");

        i = dateStr.indexOf("/");
        String d = dateStr.substring(0, i);
        dateStr = dateStr.replace(dateStr.substring(0, i + 1), "");

        if (Integer.valueOf(d) < 10 && d.startsWith("0") == false) {
            d = "0" + d;
        }

        f = f + "" + d + "-" + m;
        f = f + "-" + dateStr.substring(0, dateStr.length());
        return f;

    }

    public static String reverseString(String str) {
        String result = "";
        for (int x = str.length()-1; x >= 0; x--) {
            result = result + str.charAt(x);
        }
        return result;
    }

    public static void palindromeChecker(String str) {
        str = removeSpaces(str);
        if (str.equals(reverseString(str))) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

}