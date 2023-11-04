/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;
import java.util.Scanner;


 // Step 1: Create the InsufficientFundException class
class InsufficientFundException1 extends Exception {
    public InsufficientFundException1(String message) {
        super(message);
    
    }
}

// Step 2: Create the BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException1 {
        if (amount > balance) {
            throw new InsufficientFundException1("Insufficient funds: Unable to withdraw " + amount + ", balance is " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Step 3: Write the Java program to test the BankAccount class
public class InsufficientFundException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.deposit(500.0);
            System.out.println("Current balance after deposit: " + account.getBalance());

            account.withdraw(700.0);
            System.out.println("Current balance after withdrawal: " + account.getBalance());

            // Attempt to withdraw more than the balance (should throw InsufficientFundException)
            account.withdraw(1000.0);
        } catch (InsufficientFundException1 e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
