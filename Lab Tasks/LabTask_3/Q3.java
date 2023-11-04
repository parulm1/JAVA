//Q3. WAP in Java to find number is palindrome or not.

package LabTask_3;

import java.util.Scanner;

public class Q3 
{
    int num,i,d1,d2,d3,d4,rev;
    void takeInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        num=scan.nextInt();
    }
    void showOutput()
    { 
    i=num;
    d4=i%10;i=i/10;
    d3=i%10;i=i/10;
    d2=i%10;i=i/10;
    d1=i%10;i=i/10;  
    rev=d4*1000+d3*100+d2*10+d1;
    if(rev==num)
    {
        System.out.println(num+" is a Palindrome Number");
    }
    else
    {
        System.out.println(num+" is not a Palindrome Number");
    }
    }
    public static void main(String[] args) 
    {
         Q3 q=new Q3();
        q.takeInput();
        q.showOutput(); 
    }
}
