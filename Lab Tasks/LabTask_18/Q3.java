package LabTask_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3
{
    public static void main(String[] args) 
    {
        List<String> names = new ArrayList<>();
        names.add("Atishay");
        names.add("Laveena");
        names.add("Purti");
        names.add("Parul");
        names.add("Priya");
        names.add("Poornita");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search for: ");
        String searchName = scanner.nextLine();
        if (names.contains(searchName)) 
        {
            System.out.println(searchName + " is found in the collection.");
        } 
        else 
        {
            System.out.println(searchName + " is not found in the collection.");
        }
        scanner.close();
    }
}
