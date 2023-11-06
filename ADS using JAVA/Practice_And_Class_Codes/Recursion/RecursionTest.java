package Recursion;

import java.util.Scanner;

public class RecursionTest {
   public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial: ");
        int num = sc.nextInt();
        long result=factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
     
}
