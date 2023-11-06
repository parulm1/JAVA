package Sorting;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i=0;i<size-1;i++) {
            int arr2 = i;
            for (int j=i+1;j<size;j++) {
                if (arr[j] < arr[arr2]) {
                    arr2 = j;}}
            swap(arr,i,arr2);
            
//            System.out.println("Iteration " + (i + 1) + ":");
//            printArray(arr);
            }}
    
    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");}
        System.out.println();}
    
    public static void main(String[] args) {
        int arr[]={50, 10, 30, 60, 80, 20, 100, 40};
        System.out.println("*********SELECTION SORT*********");
        System.out.println();                                
        System.out.println("Original Array: ");            
        printArray(arr);                                     
        System.out.println();                                
        System.out.println("****************************");
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
    }

    
}
