package Validation;
import java.util.*;
public class Email 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your Email ");
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        if(str.contains("@") )
        {
//            if(int s=str.lastIndexOf("."))
//        {
//            
//        }
            for(int i=0;i<str.length();i++)
            {
               char a=str.charAt(i);
              
               if(a>=97 && a<=123)
               {
                    count++;   
               }  
            }   
            if(count !=0)
                System.out.println("vaild");
            else
                System.out.println("invalid");        
        }
    }
}
