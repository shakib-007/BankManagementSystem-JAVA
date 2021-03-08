
package assignment;

public class CurrentAccount extends Account{
    public CurrentAccount(){}
    public CurrentAccount(String name,int aNum,double balance){
        super.setAccountHolder(name);
        super.setAccountNumber(aNum);
        super.setBalance(balance);
       
    }
    @Override
    public void GiveInterest(){}
    @Override
    public void showInfo()
	{
		System.out.println("Account Holder Name is: "+super.getAccountHolder());
		System.out.println("Account Number is: "+super.getAccountNumber());
		System.out.println("Balance is: "+super.getBalance());
	}

}
