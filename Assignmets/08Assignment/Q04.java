class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display balance
    public void showBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Test {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber("1234567890");
        obj.setHolderName("Amit Kumar");
        obj.setBalance(15000.50);

        obj.showBalance();
    }
}