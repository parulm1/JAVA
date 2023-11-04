//7.Create a program to check if a given string is empty or null.

package LabTask_11;

public class Q7 
{
    public static void main(String[] args)
    {
        String str1 = "Parul Mankar";
        String str2 = null;
        String str3 = "";

        checkAndPrint(str1);
        checkAndPrint(str2);
        checkAndPrint(str3);
    }

    public static void checkAndPrint(String str)
    {
        if (str == null)
        {
            System.out.println("The string is null.");
        }
        else if (str.isEmpty()) 
        {
            System.out.println("The string is empty.");
        }
        else 
        {
            System.out.println("The string is neither null nor empty: " + str);
        }
    }
}
