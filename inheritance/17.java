
// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount {
    protected double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to savings account. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from savings account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in savings account.");
        }
    }
}

 class CurrentAccount extends BankAccount {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to current account. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from current account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in current account.");
        }
    }
}

class myaccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(1000.0);
        currentAccount.withdraw(500.0);
    }
}
