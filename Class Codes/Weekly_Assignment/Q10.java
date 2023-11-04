//10.Create an array of integers and initialize it with some values.
//i)Calculate the sum and average of the array elements.
//ii)Find the maximum and minimum values in the array.
//iii)Print the results.

package Weekly_Assignment;

public class Q10 
{
    public static void main(String[] args) 
    {
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for (int number : num) 
        {
            sum += number;
        }

        double average = (double) sum / num.length;
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) 
        {
            if (num[i] > max) 
            {
                max = num[i];
            }
            if (num[i] < min) 
            {
                min = num[i];
            }
        }
        System.out.println("Array: " + java.util.Arrays.toString(num));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

