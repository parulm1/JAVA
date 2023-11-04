//Q2. WAP in Java to check whether a number is divisible according to
//the following conditions.
//1. no is divisible by 8 & 5;
//2.no is divisible by 8;
//3.no is divisible by 5;
//4.no is divisible neither by 8 nor by 5;

package LabTask_3;

import java.util.Scanner;

public class Q2 
{
    float num,div;
    void takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        num=sc.nextFloat();   
    }
    void showOutput()
    {
        if(num%8==0 && num%5==0)
        {
            System.out.println(num+" is divisible by 8 & 5");
        }
        else if(num%8==0)
        {
            System.out.println(num+" is divisible by 8");
        }
        else if(num%5==0)
        {
            System.out.println(num+" is divisible by 5");
        }
        else if(num%8!=0 && num%5!=0)
        {
            System.out.println(num+" is divisible neither by 8 nor by 5");
        }
    }        
    public static void main(String[] args) 
    {
        Q2 q=new Q2();
        q.takeInput();
        q.showOutput(); 
    }
}
