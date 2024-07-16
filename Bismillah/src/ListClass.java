import java.util.ArrayList;

public class ListClass {
    private ArrayList<String> listClass;
    public ListClass() {
        this.listClass = new ArrayList<>();
    }

    public void addItem(String item) {
        this.listClass.add(item);
    }
    public void removeItem(String item) {
        this.listClass.remove(item);
    }
    public void clearList() {
        this.listClass.clear();
    }
    public ArrayList<String> returnItems() {
        return this.listClass;
    }
}
