
package bankbalancehw;

public class CheckBalance {
    
    private double balance;
    private double deposite;
    private double withdraw;

    public CheckBalance() {
    }

    public CheckBalance(double balance, double deposite, double withdraw) {
        this.balance = balance;
        this.deposite = deposite;
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    

    public double getDeposite() {
        return balance = balance + deposite;
        
    }
    public void setDeposite(double deposite) {
        this.deposite = deposite;
        System.out.println("Deposited Balance " + deposite);
    }
    
    

    public double getWithdraw() {
        return balance = balance - withdraw;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        System.out.println("Withdrawal Balance " + withdraw );
    }
    
     
}
