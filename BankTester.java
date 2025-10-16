import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get initial balance and name from user
        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();
        input.nextLine(); // consume newline
        System.out.print("Enter account holder's name: ");
        String name = input.nextLine();

        // Create BankAccount object
        BankAccount myAccount = new BankAccount(initialBalance, name);

        // Deposit $505.22
        myAccount.deposit(505.22);

        // Print current balance
        System.out.println("Current balance: $" + myAccount.getBalance());

        // Withdraw $100
        myAccount.withdraw(100);

        // Print final balance
        System.out.printf("The %s account balance is, $%.2f%n",
                          myAccount.getName(), myAccount.getBalance());

        input.close();
    }
}
