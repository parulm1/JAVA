package LabTask_17;

import java.util.ArrayList;

public class Q1 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors in the Array List:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
