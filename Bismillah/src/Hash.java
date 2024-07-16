import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> scores = new HashMap<>();
        scores.put("Bob", "100");
        scores.put("John", "89");
        scores.put("Billy Bob", "100");
        System.out.println(scores.get("Bob"));
        System.out.println(scores.values());
    }    
}
