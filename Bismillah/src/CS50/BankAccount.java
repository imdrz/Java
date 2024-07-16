package CS50;

import java.math.BigDecimal;
import java.math.RoundingMode;
/* Author: Imad Riaz
 * Date: 7/10/24
 * Purpose: purpose of this file (and the project)
 * This code is based on a template from Dr. Bezaire
 */
import java.util.Random;

public class BankAccount {
    // Add your fields here
    private String name;
    private int pinNumber;
    private double balance;

    // Add your constructors here
    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
        this.pinNumber = 1234;

    }

    public BankAccount(String n) {
        Random r = new Random();
        int randNum = (r.nextInt(9999 - 1000 + 1) + 1000);
        this.name = n;
        this.pinNumber = randNum;
        this.balance = 0.0;
    }

    public BankAccount(String n, double balance) {
        Random r = new Random();
        int randNum = (r.nextInt(9999 - 1000 + 1) + 1000);
        this.name = n;
        this.balance = balance;
        this.pinNumber = randNum;
    }

    // Add your other methods here
    public String getName() {
        return name;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", pinNumber=" + pinNumber + ", balance=" + balance + "]";
    }

    public void deposit(double amt) {
        if (amt >= 0.0) {
            this.balance = round(this.balance + amt, 2);
        } else {
            System.out.println("Transaction cancelled - Invalid amount");
        }
    }

    public double withdraw(double amt) {
        if (amt >= 0.0) {
            if (amt > this.balance) {
                double x = this.balance;
                this.balance = 0.0;
                return x;
            } else {
                this.balance -= amt;
                return amt;
            }
        } else {
            System.out.println("Transaction cancelled - Invalid amount");
            return 0.0;
        }
    }

    public boolean validateAccount(String n, int p) {
        if (n == this.name && p == this.pinNumber) {
            return true;
        } else {
            return false;
        }
    }
    private static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
