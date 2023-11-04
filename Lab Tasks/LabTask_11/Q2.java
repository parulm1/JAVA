//2.Create a program to validate if a string represents a valid email address.

package LabTask_11;
import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String email = scanner.nextLine();
        if (isValidEmail(email)) 
        {
            System.out.println("Valid email address.");
        } 
        else
        {
            System.out.println("Invalid email address.");
        }
        scanner.close();
    }
    private static boolean isValidEmail(String email) 
    {
        int atIndex = email.indexOf('@');
        if (atIndex == -1) 
        {
            return false;
        }
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1) 
        {
            return false;
        }
        if (dotIndex == email.length() - 1)
        {
            return false;
        }
        return true;
    }
}
