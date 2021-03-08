
package assignment;

public class Customer implements IOperations{
    public int totalCount=0;
    public final int Len=100;
    Account accounts[]=new Account[Len];
    public Customer(){
        
    }
    @Override
    public void insertAccount(Account ac)
    {
	for (int i = 0; i < Len; i++) {
            if (accounts[i] == null) {
                accounts[i] = ac;
                totalCount++;               
                return;
            }
        }
    }
    
    @Override
    public Account getAccount(int accountNumber){
        
        for (int i = 0; i < totalCount; i++) {           
            if(accounts[i].getAccountNumber()==accountNumber){
                System.out.println("Account Found!!!");
                 return accounts[i];
            }                                 
        }
        System.out.println("Account not found");
        return null;
    }
    public void activeAccount(){
        System.out.println("Number of Active Account : "+this.totalCount);
    }
    @Override
    public void showAccounts(){				
        for(int i=0;i<totalCount;i++){
            System.out.println("Account Holder Name : "+accounts[i].getAccountHolder()); 
            System.out.println("Account Number : "+accounts[i].getAccountNumber());                                              
	    System.out.println("Account Balance : "+accounts[i].getBalance());
	}
    }
}
