package LabTask_3;

import java.util.Scanner;

public class Q1
{
    float t,per,arr[]=new float [3];
    void takeInput() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of 3 Subjects out off 30 : \n");
        System.out.println("Marks of English : ");
        arr[0]=sc.nextFloat();
        System.out.println("Marks of Maths : ");
        arr[1]=sc.nextFloat();
        System.out.println("Marks of Science : ");
        arr[2]=sc.nextFloat(); 
        t=arr[0]+arr[1]+arr[2];
        System.out.println("Total of Marks ="+t);
        per=(t/90)*100;
        System.out.println("Percentage = "+per);
    }   
    void showOutput()
    {
        if(per>=90)
        {
            System.out.println("Grade A+");   
        }
        else if(per>=80)
        {
            System.out.println("Grade A");   
        }
        else if(per>=70)
        {
            System.out.println("Grade B+");   
        }
        else if(per>=60)
        {
            System.out.println("Grade B");   
        }
        else if(per>=50)
        {
            System.out.println("Grade C");   
        }
        else if(per<=49)
        {
            System.out.println("Fail");   
        }
    } 
    static public void main(String a[])
{
    Q1 q1=new Q1();
    q1.takeInput();
    q1.showOutput(); 
} 
}
