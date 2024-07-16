package CS50;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank("bank1");
        int pin = bank.addAccount("Bob", 1000);
        System.out.println(bank.withdraw("Bob", pin, 99.9));
        System.out.println(bank.showAccount("Bob", pin));
        System.out.println(bank.deposit("Bob", pin, 15.32));
        System.out.println(bank.showAccount("Bob", pin));
        System.out.println(900.1+15.32);
    }
}