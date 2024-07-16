import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        Boolean add = true;
        for (String item: this.meals) {
            if (item == meal) {
                add = false;
            }
        }
        if (add == true) {
            this.meals.add(meal);
        }
    }
    public void printMeals() {
        for (String item: this.meals) {
            System.out.println(item);
        }
    }
    public void clearMenu() {
        this.meals.clear();
    }
}