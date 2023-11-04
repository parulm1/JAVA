//Q1. Write a Java program that declares an array of integers and tries to access an
//element at an index beyond the array’s length. Handle the
//ArrayIndexOutOfBoundsException by providing a meaningful message.

package LabTask_14;

public class Q1 
{
    int arr[]={10,20,30,40};
    void show()
    {
        try
        {
            arr[5]=11;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) 
    {
        Q1 q = new Q1();
        q.show();
    }
}
