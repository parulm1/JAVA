//1.Write a Java program that creates two threads to find and print even and odd numbers from 1
//to 20. ...

//3.Write a java program to call run method directly from the Main method.
//4.Write a Java program that calculates the sum of all prime numbers up to a given limit using
//multiple threads.
//Exercise 5: Bank Account with Synchronization
//Problem: Simulate a bank account in Java. Create multiple withdrawal and deposit threads. Use
//synchronization to prevent race conditions and ensure that the balance is correct.

package LabTask_20;

public class Q1 extends Thread
{
    public static void main(String[] args) 
    {
        Q1 t1=new Q1()
        {
            public void run() 
            {
                for(int i=1;i<=20;i++)
                {
                    if(i%2==0)
                        System.out.println("Even : "+i);
                }
            }
        };
        Q1 t2=new Q1()
        {
            public void run() 
            {
                for(int i=1;i<=20;i++)
                {
                    if(i%2!=0)
                    {
                        try
                        {
                            sleep(100);
                        }
                        catch (Exception e){}
                        System.out.println("Odd : "+i);
                    }
                        
                }
            }
        };
        t1.start();
        t2.start();
    }
}
