//3.Write a method that takes a Double and return its square.
package LabTask_12;
import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (double): ");
        double userInput = scanner.nextDouble();
     
        Double result = calculateSquare(userInput);
        System.out.println("The square of " + userInput + " is: " + result);
    }
    private static Double calculateSquare(Double number)
    {
        return Math.pow(number, 2);
    }
}
