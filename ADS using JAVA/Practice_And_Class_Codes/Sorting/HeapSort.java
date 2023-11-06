package Sorting;
public class HeapSort {
    
    public static void heapSort(int arr[]){
        int size=arr.length-1;
        BuildHeap(arr, size);
        while(size>0){
            swap(arr, 0, size);
            size--;
            Heapify(arr, 0, size);
        }
    }

    public static void BuildHeap(int arr[], int size){
        int i;
        for(i=size/2;i>=0;i--)
            Heapify(arr,i,size);
    }
    
    public static void Heapify(int arr[],int index,int size){
        int left = 2*index+1;
        int right = left+1;
        int max=index;
        if(left<=size && arr[left]>arr[max])
            max=left;
        if(right<=size && arr[right]>arr[max])
            max=right;
        if(index != max){
            swap(arr,max,index);
            Heapify(arr,max,size);
        }
    }
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={50, 10, 30, 60, 80, 20, 100, 40};
        System.out.println("*********MERGE SORT*********");
        System.out.println();                                
        System.out.println("Original Array: ");            
        printArray(arr);                                     
        System.out.println();                                
        System.out.println("****************************");
        System.out.println();
        heapSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
        
    }
}
