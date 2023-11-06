package Sorting;
public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
//                System.out.println("Iteration " + i + ":");
//                printArray(arr);
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int arr[]={50, 10, 30, 60, 80, 20, 100, 40};
        System.out.println("*********INSERTION SORT*********");
        System.out.println();                                
        System.out.println("Original Array: ");            
        printArray(arr);                                     
        System.out.println();                                
        System.out.println("****************************");
        System.out.println();
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
    }
}

    

    