public class BankAccount {
    private int balance = 0;

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int money) {
        balance = balance + money;
    }

    public synchronized int retrieve(int money) {
        int result = getAvailable(money);
        balance = balance - result;
        return result;
    }

    private synchronized int getAvailable(int money) {
        return balance > money
                ? money
                : balance;
    }
}
