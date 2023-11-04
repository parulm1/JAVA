//1.Write a program in java which shows no argument
//constructor.
package Day5_Labtask;
import java.util.*;
public class Default_Constructor
{
    int num;
    Default_Constructor()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the last no. : ");
        num=s.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
                Default_Constructor dc=new Default_Constructor();
    }
}
