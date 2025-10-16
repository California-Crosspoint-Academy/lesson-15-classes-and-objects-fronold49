public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getName() {
        return name;
    }
}
