//4.Write a Java program to reverse a given string.

package LabTask_11;

public class Q4
{
    public static void main(String[] args) 
    {
        String original = "Parul Mankar";
        String reversed = reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) 
    {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}
