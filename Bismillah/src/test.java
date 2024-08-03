import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //ArrayList<String> tupleItems = new ArrayList<String>();
        //tupleItems.add("one");
        //tupleItems.add("two");
        //tupleItems.add("three");
        //tupleItems.add("bob");
        //tupleItems.add("billy");
        //tupleItems.add("john");
        //Tuple<String> tuple = new Tuple<String>(tupleItems);
        //System.out.println(tuple);
        //ArrayList<Tuple> tupleTuples = new ArrayList<Tuple>();
        //tupleTuples.add(tuple);
        //Tuple<Tuple> tuple2 = new Tuple<Tuple>(tupleTuples);
        //System.out.println(tuple.toArray());
        //System.out.println(tuple2.toArray());
        Scanner scanner = new Scanner(System.in);
        TicTacToe test = new TicTacToe(scanner);
    }
}