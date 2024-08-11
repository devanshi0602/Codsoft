import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance ;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        return remainingBalance;
       
    }
}

class ATM {
    private BankAccount account;
    private Scanner x;

    public ATM(BankAccount account) {
        this.account = account;
        this.x = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = x.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Current Balance: $" + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = x.nextDouble();
        account.deposit(amount);
    }

    
}
    private void withdraw() {
    System.out.print("Enter withdrawal amount: $");
    double amount = x.nextDouble();
    double remainingBalance = account.withdraw(amount); // Get the remaining balance after withdrawal
    System.out.println("Remaining Balance: $" + remainingBalance); // Display the remaining balance
}


public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000.00); 
        ATM atm = new ATM(account);
        atm.start();
    }
}

