
package bankaccount;


public class BankAccount {

    
    public static void main(String[] args) {
        
        accountStatus1 as1 = new accountStatus1();
        
        as1.setDeposit(700);
        as1.deposit();
        System.out.println(as1.getBalance());
        
        as1.setWithdraw(800);
        as1.withdraw();
        
        System.out.println(as1.getBalance());
        
    }
    
}
