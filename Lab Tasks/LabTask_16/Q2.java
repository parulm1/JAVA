//Q2.Parsing Strings into Dates:
//a. Create a SimpleDateFormat object to parse a date string in the "yyyy-MM-dd" format. Parse
//the string "2023-10-23" and print the Date object.
//b. Parse a date string in the "dd/MM/yyyy" format from user input and print the parsed Date
//object. Handle any potential ParseException.

package LabTask_16;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
public class Q2 
{
    public static void main(String[] args) {
        // Create a SimpleDateFormat object for the "yyyy-MM-dd" format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner=new Scanner(System.in);
        try {
            // Parse the date string
            String dateString = "2023-10-23";
            Date parsedDate = dateFormat.parse(dateString);

            // Print the parsed Date object
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            // Handle any potential ParseException
            System.out.println("Error parsing the date: " + e.getMessage());
        }
        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String userInput = scanner.nextLine();

        try {
            // Parse the user input date string
            Date parsedDate = dateFormat.parse(userInput);

            // Print the parsed Date object
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            // Handle any potential ParseException
            System.out.println("Error parsing the date: " + e.getMessage());
        }

        // Close the Scanner
        scanner.close();
    }
}
