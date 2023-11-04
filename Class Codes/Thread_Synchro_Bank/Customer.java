package Thread_Synchro_Bank;

import java.util.*;

public class Customer implements Runnable
{
    private  String name;
    private Account account;

    public Customer(String name,Account account) 
    {
        this.name = name;
        this.account=account;
    }
    
    @Override
    public void run() 
    {
        Scanner sc=new Scanner(System.in);
        
        synchronized (account) 
        {
            System.out.println("\nMr."+name+" Please enter amount to withdraw");
            int amount=sc.nextInt();

            if(account.isSufficientBalance(amount))
            {
                System.out.println(this.name+" is going to withdraw INR "+amount+"/-");
                account.Withdraw(amount);
            }
            else
            {
                System.out.println("Inufficient Balance");
            }
        }        
    } 
}
