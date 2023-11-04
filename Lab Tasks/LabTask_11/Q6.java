//6.Write a program to remove all the spaces from a given string.

package LabTask_11;

public class Q6 
{
    public static void main(String[] args) 
    {
        String input = "My name is Parul Mankar";
        String result = input.replace(" ", "");
        System.out.println("Original string: " + input);
        System.out.println("String without spaces: " + result);
    }
}
