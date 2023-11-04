//Q2. Create a user-defined exception class NegativeValueException that extends
//Exception. Write a Java program that takes an integer as input and throws a
//NegativeValueException if the input is a negative number.

package LabTask_14;
import java.util.*;
public class Q2 
{
    int a;
    void check_value()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number ");
        a=scan.nextInt();
        
        if(a>0)
        {
            System.out.println("You Entered +ve Number");
        }
        else
        {
            try
            {
                throw new Q2_Exception("You Have Entered -ve Number");
            }
            catch(Q2_Exception ed)
            {
                 System.out.println(ed.getMessage());
            }
        }
    }
    public class Q2_Exception extends RuntimeException
    {
        public Q2_Exception(String msg) 
        {
            super(msg);
        }
    }
    public static void main(String[] args) 
    {
        Q2 q = new Q2();
        q.check_value();
    }
}
