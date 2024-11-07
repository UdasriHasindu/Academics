package Question03;

public class BankAccount {

    private double balance = 0.0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    public void withdraw(double amount) {

        if( amount > balance ) {
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }
    // method for return current balance
    public double getBalance() {
        return balance;
    }
}
