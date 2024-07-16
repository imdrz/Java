import java.util.ArrayList;

public class classes {
    public static void main(String[] args) {
        /* 
        System.out.println("Hello world");
        Person person = new Person(14, "Bob", "Billy");
        System.out.println(person.getMoney());
        person.transaction(-100);
        System.out.println(person.getMoney());
        ListClass list = new ListClass();
        list.addItem("One");
        list.addItem("Banana");
        ArrayList<String> itemList;
        itemList = list.returnItems();
        System.out.println(itemList);
        list.clearList();
        itemList = list.returnItems();
        System.out.println(itemList);
        
        Menu menu = new Menu();
        menu.addMeal("Pasta");
        menu.printMeals();
        menu.addMeal("Pasta");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
        */
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }   
}

