package LabTask_17;

import java.util.ArrayList;
import java.util.Collections;

public class Q6
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original list: " + numbers);
        int deletingelement= 2;
        System.out.println("Element is deleted: "+numbers.remove(Integer.valueOf(deletingelement)));

        int searchingelement = 8;
        boolean found = numbers.contains(searchingelement);
        System.out.println("Is " + searchingelement + " found? " + found);

        System.out.print("Iterating through the list: ");
        for (Integer number : numbers) 
        {
            System.out.print(number + " ");
        }
        System.out.println();

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
