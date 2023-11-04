package LabTask_17;

import java.util.ArrayList;

public class Q3 
{
    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String str = "Orange";
        colors.add(0, str);

        System.out.println("ArrayList after inserting at the first position:");
        for (String color : colors) 
        {
            System.out.println(color);
        }
    }
}
