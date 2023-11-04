package pattern;
//Static size
//
//public class Diamond 
//{
//    void upperTri()
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=4;j>i;j--)
//            {
//                System.out.print(" ");
//            }
//             for(int j=0;j<=i;j++)
//             {
//             System.out.print("* ");
//             }
//             System.out.println("\n");
//        }
//    }
//    void lowerTri()
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int space=0;space<=i;space++)
//             {
//             System.out.print(" ");
//             }
//            for(int j=4;j>i;j--)
//            {
//                System.out.print("* ");
//            }
//           
//             System.out.println("\n");
//        }
//    }
//    public static void main(String[] args) 
//    {
//        Diamond d=new Diamond();
//        d.upperTri();
//        d.lowerTri();
//    }
//}

//Dynamic size
import java.util.Scanner;
public class Diamond 
{
    int num;
    void upperTri()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max no. of * in a row : ");
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int space=num-1;space>i;space--)
            {
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++)
             {
             System.out.print("* ");
             }
             System.out.println("\n");
        }
    }
    void lowerTri()
    {
        for(int i=0;i<num;i++)
        {
            for(int space=0;space<=i;space++)
             {
             System.out.print(" ");
             }
            for(int j=num-1;j>i;j--)
            {
                System.out.print("* ");
            }
           
             System.out.println("\n");
        }
    }
    public static void main(String[] args) 
    {
        Diamond d=new Diamond();
        d.upperTri();
        d.lowerTri();
    }
}