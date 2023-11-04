package LabTask_17;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        
        //Using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        //Using an Iterator
        System.out.println("\nIterating using an Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
