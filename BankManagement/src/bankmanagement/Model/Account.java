package bankmanagement.Model;

public class Account {

    private double balance;
    private double deposit;
    private double withdraw;

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        setBalance(balance + deposit);
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        setBalance(balance - withdraw);
    }

}
