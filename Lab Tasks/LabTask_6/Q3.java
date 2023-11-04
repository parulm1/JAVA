//3. A person has his money deposited Rs 10000, Rs 15000 and Rs 2000 in banks-Bank
//A, Bank B and Bank C respectively. We have to print the money deposited by him in a
//particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three
//subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name
//'getBalance' which returns the amount deposited in that particular bank. Call the method
//'getBalance' by the object of each of the three banks.

package LabTask_6;

class Bank
{
    public int getBalence()
    {
        return 0;
    }
}
class BankA extends Bank
{
    @Override
    public int getBalence() 
    {
        return 10000;
    }   
}
class BankB extends Bank
{
    @Override
    public int getBalence() 
    {
        return 15000;
    }   
}
class BankC extends Bank
{
    @Override
    public int getBalence() 
    {
        return 2000;
    }  
}
public class Q3 
{
    public static void main(String[] args) 
    {
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        
        int BalanceA=a.getBalence();
        int BalanceB=b.getBalence();
        int BalanceC=c.getBalence();
        
        System.out.println("Balance in Bank A: Rs " + BalanceA);
        System.out.println("Balance in Bank B: Rs " + BalanceB);
        System.out.println("Balance in Bank C: Rs " + BalanceC);
    }  
}