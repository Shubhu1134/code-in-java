// Question4_Private_Property_Access.java
// How to update and retrieve the value of a particular property of an object from another class
// (Let suppose the property is private)?

/*
ACCESSING PRIVATE PROPERTIES FROM ANOTHER CLASS:

Since private properties cannot be directly accessed from outside the class,
we need to use PUBLIC methods to access and modify them:

1. GETTER METHODS: To retrieve/read private property values
2. SETTER METHODS: To update/modify private property values
3. PUBLIC METHODS: That internally work with private properties

This maintains ENCAPSULATION while providing controlled access.
*/

// Class with private properties
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String pin;
    private boolean isActive;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, 
                      double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.pin = pin;
        this.isActive = true;
    }
    
    // GETTER METHODS - To retrieve private property values
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    // Note: PIN is sensitive, so we don't provide direct getter
    // Instead, we provide a method to verify PIN
    public boolean verifyPin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }
    
    // SETTER METHODS - To update private property values
    public void setAccountHolderName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.accountHolderName = name;
        }
    }
    
    public void setPin(String oldPin, String newPin) {
        if (verifyPin(oldPin) && newPin != null && newPin.length() >= 4) {
            this.pin = newPin;
            System.out.println("PIN updated successfully");
        } else {
            System.out.println("PIN update failed - invalid credentials or PIN format");
        }
    }
    
    public void setAccountStatus(boolean status) {
        this.isActive = status;
    }
    
    // SPECIAL METHODS to work with balance (with business logic)
    public boolean deposit(double amount) {
        if (amount > 0 && isActive) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
            return true;
        }
        System.out.println("Invalid deposit amount or account inactive");
        return false;
    }
    
    public boolean withdraw(double amount, String pin) {
        if (verifyPin(pin) && amount > 0 && amount <= balance && isActive) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        }
        System.out.println("Withdrawal failed - invalid PIN, insufficient funds, or account inactive");
        return false;
    }
    
    // Method to display account info (uses private properties internally)
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("PIN: [HIDDEN]");
    }
}

// Another class that needs to access BankAccount's private properties
class BankManager {
    
    // Method to retrieve account information
    public void retrieveAccountInfo(BankAccount account) {
        System.out.println("===