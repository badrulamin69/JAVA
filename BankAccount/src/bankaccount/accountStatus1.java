
package bankaccount;

public class accountStatus1 {
    
    private int accNo;
    private int balance;
    private int deposit;
    private int withdraw;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
    
    public double deposit(){
        balance += deposit;
        return balance;
    }
    
    public double withdraw(){
        
        if (balance >= withdraw){
            balance -= withdraw;
        }
        else {
            System.out.println("insuffecient amount");
        
        }
        return balance;
    }
    
    
    
    
}
