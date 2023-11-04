package LabTask_22;

public class Q2
{
    // Method to swap elements in an array
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 != index2 && index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "orange", "pear", "grape"};

        System.out.println("Before swapping:");
        printArray(numbers);
        printArray(words);

        swapElements(numbers, 1, 3);
        swapElements(words, 0, 4);

        System.out.println("\nAfter swapping:");
        printArray(numbers);
        printArray(words);
    }

    // Method to print arrays
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
