package Thread_Synchro_Bank;

public class Account 
{
    private int balance=10000;
    
    public boolean isSufficientBalance(int amount)
    {
        if(balance<amount)
            return false;
        else
            return true;
    }
    
    public void Withdraw(int amount)
    {
            balance=balance-amount;
            System.out.println("Remaining balance is INR "+balance+"/-");
    }
}
