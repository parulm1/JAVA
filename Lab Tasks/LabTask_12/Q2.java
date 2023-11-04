//2.Create a method that takes an Integer and increments its value by 1.
package LabTask_12;

public class Q2 
{
    public static void main(String[] args) 
    {
        Integer originalValue = 5;

        System.out.println("Original value: " + originalValue);

        incrementInteger(originalValue);
    }
    private static void incrementInteger(Integer value) 
    {
        value = value + 1;

        System.out.println("Incremented value: " + value);
    }
}
