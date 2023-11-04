//Q4. WAP in Java to calculate the factorial of a number.

package LabTask_3;

import java.util.Scanner;

public class Q4 
{
    int num,f;
    void fact()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find its FACTORIAL : ");
        num=scan.nextInt();
        
        for(int i=1;i<=num;i++)
        {
           f=f*i;
        }
        System.err.println("FACTORIAL of "+num+" = " +f);
    }
    
    public static void main(String[] args) 
    {
        Q4 q=new Q4();
        q.fact();
    }
}
