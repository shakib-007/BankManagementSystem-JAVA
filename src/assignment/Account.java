
package assignment;

public abstract class Account implements Transactions{
    private int accountNumber;
    public double balance;
    String accountHolder;
    public Account(){
        balance=0;
        accountNumber=0;
        accountHolder="fahim";
    }
    public abstract void showInfo();
    public abstract void GiveInterest();
    
    public void  setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public void  setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber()
    {
	return accountNumber;
    }
     double getBalance()
    {
	return balance;
    }
    @Override
    public void deposit(double ammount){
        
        if(ammount>0){
            this.balance=this.balance+ammount;
            System.out.println("Deposit Successful!!!\n");
        }
        else {
            System.out.println("Invalid\n");
        }
    }
    @Override
    public void withdraw(double amount)
    {
	if(this.balance>=amount && amount>100){	 
            this.balance=this.balance-amount;
   	    System.out.println("Withdraw Successful !!!\n");
	}
        else{
	    System.out.println("Less Balance..Transaction Failed..");
	}

    }
    @Override
    public void transfer(Account ac,double amount){
	
	if (this.balance>=amount) {          
  	    this.withdraw(amount);
	    ac.deposit(amount);
            System.out.println("\nTransfer succesful. Tansfered Account Balance: " + ac.getBalance());
        }   
        else{
           System.out.println("\nTransfer failed, not enough balance!");
        }
    }
}
