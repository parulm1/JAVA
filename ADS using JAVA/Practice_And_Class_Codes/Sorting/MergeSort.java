package Sorting;
public class MergeSort {
    public static void mergeSort(int arr[], int start, int end){
        if(start < end){
            int mid =(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void merge(int arr[],int start, int mid, int end){
        int temp[]=new int[end-start+1];
        
        int i,j,k;
        i=start;
        j=mid+1;
        k=0;
        
        //Compare and insert smaller element into temp
        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        
        //for remaining elements of First array
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        
        //for remaining elements of Second array
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }
        
        //Copy temp to Original Array 
        k=0;
        for(i=start;i<=end;i++)
            arr[i]=temp[k++];
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
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
    }
}
