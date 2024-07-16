package CS50;

/* Author: Imad Riaz
 * Date: 7/10/24
 * Purpose: purpose of this file (and the project)
 * This code is based on a template from Dr. Bezaire
 */

public class Bank {
    // Add your fields here
    private String name;
    public final int MAX_ACCOUNTS = 3;
    private int numAccounts;
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;

    // Add your constructor here
    public Bank(String n) {
        this.name = n;
        this.numAccounts = 0;
        this.account1 = null;
        this.account2 = null;
        this.account3 = null;
    }

    // Add your other methods here
    public int addAccount(String n, double b) {
        if (this.numAccounts == this.MAX_ACCOUNTS) {
            return 0;
        } else {
            BankAccount account = new BankAccount(n, b);
            int pin = account.getPinNumber();

            if (this.account1 == null) {
                this.account1 = account;
            } else if (this.account2 == null) {
                this.account2 = account;
            } else {
                this.account3 = account;
            }
            this.numAccounts += 1;
            return pin;
        }
    }

    public boolean deposit(String name, int pin, double amt) {
        if (findAccount(name, pin) != null) {
            findAccount(name, pin).deposit(amt);
            return true;
        }
        return false;
    }

    public double withdraw(String name, int pin, double amt) {
        if (findAccount(name, pin) != null) {
            // System.out.println(findAccount(name, pin).withdraw(amt));
            return findAccount(name, pin).withdraw(amt);
        }
        return -1;
    }

    public String showAccount(String name, int pin) {
        if (findAccount(name, pin) != null) {
            return findAccount(name, pin).toString();

        }
        return null;
    }

    private BankAccount findAccount(String name, int pin) {
        if (this.account1 != null) {
            if (this.account1.validateAccount(name, pin)) {
                return this.account1;
            }
        }
        if (this.account2 != null) {
            if (this.account2.validateAccount(name, pin)) {
                return this.account2;
            }
            if (this.account3 != null) {
                if (this.account3.validateAccount(name, pin)) {
                    return this.account3;
                }
            }
        }
        return null;
    }
}
