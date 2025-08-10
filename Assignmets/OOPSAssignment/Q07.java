// 7. Write a Java program to create a class called "Bank"
// with a collection of accounts and methods to add and remove accounts,
// and to deposit and withdraw money. Also define a class called "Account"
// to maintain account details of a particular customer.

import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    public Account() {}

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account a) {
        accounts.add(a);
        System.out.println("Account added: " + a.getAccountNumber());
    }

    public void removeAccount(Account a) {
        if (accounts.remove(a)) {
            System.out.println("Account removed: " + a.getAccountNumber());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAllAccounts() {
        for (Account a : accounts) {
            a.display();
            System.out.println();
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Account acc1 = new Account("101", "John Doe", 5000);
        Account acc2 = new Account("102", "Jane Smith", 8000);

        Bank bank = new Bank();
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        System.out.println("\nAll Accounts:");
        bank.displayAllAccounts();

        acc1.deposit(1500);
        acc2.withdraw(2000);

        System.out.println("\nAfter Transactions:");
        bank.displayAllAccounts();

        bank.removeAccount(acc1);

        System.out.println("\nAfter Removing Account 101:");
        bank.displayAllAccounts();
    }
}
