
package assignment;

import java.util.Scanner;


public class Main {    
   
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        Scanner s= new Scanner(System.in);
        
        int choice;
        String name;
        int aNum;
        double balance;
        double rate;
        double ammount;
        Customer c1 = new Customer();
        Account account=null;                                                
        Account account2=null;   
        
        do
        {                                            
            System.out.println("1.Add new Account\n2.deposit\n3.withdraw\n4.transfer\n5.Change Interest Rate\n6.Update the balance after adding the interest amount\n7.Get an Account\n8.Number of Active Accounts\n9.Show Accounts\n10.Exit");
            System.out.print("Select Any Option : ");
            choice=input.nextInt();	       		             			
            
            switch(choice){
                case 1:
                    
                    System.out.println("Account Type:\n1.Savings Account\n2.Current Account\n");
                    int option=input.nextInt();
                    switch(option){
                        case 1:
                            System.out.print("Enter account holder : ");
                            name=s.nextLine();
                            System.out.print("Enter Account Number : ");
                            aNum=input.nextInt();
                            System.out.print("Enter Account Balance : ");
                            balance = input.nextDouble();
                            System.out.print("Enter Interest Rate : ");
                            rate=input.nextDouble();
                            account= new SavingsAccount(name,aNum,balance ,rate);
                            c1.insertAccount(account);
                            break;
                        case 2:
                            System.out.print("Enter account holder : ");
                            name=s.nextLine();
                            System.out.print("Enter Account Number : ");
                            aNum=input.nextInt();
                            System.out.print("Enter Account Balance : ");
                            balance = input.nextDouble();
                            account2= new CurrentAccount(name,aNum,balance);
                            c1.insertAccount(account2);
                            break;
                    }
                    break;
                case 2:
                                       
                    System.out.print("Enter account no:");
                    aNum=input.nextInt();
                    account=c1.getAccount(aNum);                            
                    System.out.print("Enter ammount you want to deposit : ");                    
                    ammount=input.nextDouble();
                    c1.showAccounts();
                    account.deposit(ammount);
                    account.showInfo();                                     
                    break;
                    
                case 3:
                                                                                            
                    System.out.print("Enter account no:");
                    aNum=input.nextInt();
                    account=c1.getAccount(aNum);
                    System.out.print("Enter ammount you want to Withdraw : ");
                    ammount=input.nextDouble();
                    account.withdraw(ammount);
                    account.showInfo();
                    
                    break;
                    
                case 4:
                                        
                    System.out.println("Enter ammount you want to transfer :");
                    ammount=input.nextInt();                   
	 	    account.transfer(account2,ammount);                           
                    account.showInfo();                    
                    break;
                
                case 5:
                    System.out.print("Enter new Interest rate: ");
                    rate=input.nextDouble();
                    SavingsAccount sc=new SavingsAccount();
                    sc.setInterestRate(rate);
                    account.showInfo();
                    break;
                case 6:                          
                    account.GiveInterest();
                    account.showInfo();
                    
                case 7:
                    
                    System.out.println("Enter Account Number:");
                    aNum=input.nextInt();
                    c1.getAccount(aNum);                   
                    break;
                case 8:                   
                    c1.activeAccount();
                    break;
                case 9:                    
                    c1.showAccounts();
                    break;
                case 10:
                    System.out.println("Invalid Option!! Please try again!!");
                    break;
            }
           
            
            
            
        }while(choice!=10);
    }
  
    
}
