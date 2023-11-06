package Sorting;
public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
//                    printIteration(arr, i, j);
                }
            }    
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
//    public static void printIteration(int[] arr, int pass, int iteration) {
//        System.out.print("Pass " + pass + ": Iteration " + iteration + ": ");
//        printArray(arr);
//    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int arr[]={50, 10, 30, 60, 80, 20, 100, 40};
        System.out.println("*********BUBBLE SORT*********");
        System.out.println();                                
        System.out.println("Original Array: ");            
        printArray(arr);                                     
        System.out.println();                                
        System.out.println("****************************");
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
    }
}
