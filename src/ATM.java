public class ATM {
    String name;
    double balance;

    public ATM(String userName, double userBalance) {
        this.name = userName;
        this.balance = userBalance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void updateBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public String toString() {
        return "" + this.name + " has $" + this.balance + " on their account.";
    }
}
