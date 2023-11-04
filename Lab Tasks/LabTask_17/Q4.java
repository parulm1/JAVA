package LabTask_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        Scanner sc = new Scanner(System.in);
        System.out.print("Index you want to retrieve: ");
        int indexToRetrieve = sc.nextInt();

        if (indexToRetrieve >= 0 && indexToRetrieve < colors.size()) 
        {
            String element = colors.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } 
        else 
        {
            System.out.println("Index is out of bounds.");
        }
    }
}
