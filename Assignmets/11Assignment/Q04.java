abstract class BankAccount {
    String accountNumber; double balance;
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
    void showBalance() { ... }
}

interface LoanEligible { void checkLoanEligibility(); }

class SavingsAccount extends BankAccount implements LoanEligible { ... }
class CurrentAccount extends BankAccount { ... }
