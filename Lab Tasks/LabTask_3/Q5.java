//Q5. WAP in Java to find the Fibonacci series upto given terms.

package LabTask_3;

import java.util.Scanner;

public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int t1=1,t2=1;
        int nextterm=t1+t2;
        System.out.println("Enter the no. of terms : ");
        int no=scan.nextInt();
        System.out.println("Febonacci Series : \n"+ t1+"\n"+ t2 );
        for(int i=3;i<=no;i++)
        {
            System.out.println(nextterm);
            t1=t2;
            t2=nextterm;
            nextterm=t1+t2;
        }
    }
}