
package bankbalancehw;

public class BankBalanceHw {
 
    public static void main(String[] args) {
        
        CheckBalance c = new CheckBalance();
        c.setBalance(10000);
        System.out.println("First Balance " + c.getBalance());
        
        c.setDeposite(5000);
        System.out.println("After Deposite " + c.getDeposite());
        
        c.setWithdraw(7000);
        System.out.println("Remaining Balance " + c.getWithdraw());
        
    }
    
}
