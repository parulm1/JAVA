//5.Create a program to count the number of vowels and consonants in a string.

package LabTask_11;

public class Q5 
{
    public static void main(String[] args) 
    {
        String input = "Parul Mankar";
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive counting

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if ((ch >= 'a' && ch <= 'z'))
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
                else 
                {
                    consonants++;
                }
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
