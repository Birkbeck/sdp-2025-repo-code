public class BankAccount1 {
    private double balance;

    public synchronized void deposit(double amount) {
            balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public synchronized double balance() {
        return balance;
    }
}
