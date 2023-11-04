//Q3. Create a user-defined exception class InsufficientFundException that extends
//Exception. Write a Java program that simulates a bank account and throws an
//InsufficientFundsException when trying to withdraw more money than the
//account balance.

package LabTask_14;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds. Current balance is " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
public class Q3 
{
    public static void main(String[] args) {
     
        BankAccount myAccount = new BankAccount(1000);

        try 
        {
            myAccount.withdraw(1500);
        } 
        catch (InsufficientFundsException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
