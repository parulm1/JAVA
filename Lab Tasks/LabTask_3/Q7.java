//Q7. WAP in java to find sum of Array.

package LabTask_3;

public class Q7 
{
    public static void main(String[] args) 
    {
        int arr[] ={1, 2, 3, 4, 5};  
        int sum = 0;  
          
        for (int i = 0; i < arr.length; i++) 
        {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }
}
