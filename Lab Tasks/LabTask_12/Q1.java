//1.Write a program to demonstrate autoboxing and unboxing using Integer and int.
package LabTask_12;

public class Q1 
{
    public static void main(String[] args) {
        // Autoboxing
        int primitiveInt1 = 10;
        int primitiveInt2 = 100;
        Integer wrappedInt1 = primitiveInt1; 
        Integer wrappedInt2 = primitiveInt2; // Autoboxing

        System.out.println("Autoboxing");
        System.out.println("Primitive int 1: " + primitiveInt1);
        System.out.println("Primitive int 2: " + primitiveInt2);
        System.out.println("Wrapped Integer 1: " + wrappedInt1);
        System.out.println("Wrapped Integer 2: " + wrappedInt2);

       
        Integer sum = wrappedInt1 + wrappedInt2; 

        System.out.println("Sum of autoboxed Integers: " + sum);

        int result = sum; // Unboxing

        System.out.println("\nUnboxing");
        System.out.println("Result after unboxing: " + result);
    }
}
