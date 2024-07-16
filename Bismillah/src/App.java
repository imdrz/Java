public class App {
    public static void main(String[] args) {
        // Write your program here
        Book testBook = new Book("One", "Two", 100);
        String bookName = testBook.getName();
        System.out.println(bookName);
        String full = testBook.toString();
        System.out.println(full);
    }
}