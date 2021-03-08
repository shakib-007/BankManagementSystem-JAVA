
package assignment;

public class SavingsAccount extends Account{
    private double interestRate;
    
    public SavingsAccount(){}      
    
    public SavingsAccount(String name,int aNum,double balance ,double rate){
        super.setAccountHolder(name);
        super.setAccountNumber(aNum);
        super.setBalance(balance);
        this.setInterestRate(rate);
    }
    @Override
    public void GiveInterest(){
            balance+=balance*((interestRate)/100);
    }
    public void setInterestRate(double rate){
        this.interestRate=rate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    @Override
    public void showInfo(){
        System.out.println("Account Holder Name : "+super.getAccountHolder());
        System.out.println("Account Number : "+super.getAccountNumber());
        System.out.println("Current Balance : "+super.getBalance());
        System.out.println("Interst Rate : "+this.getInterestRate()+"%");
    }
}
