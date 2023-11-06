/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  pIndex=partition(arr,start,end); */
package Sorting;

import static Sorting.HeapSort.heapSort;
import static Sorting.HeapSort.printArray;

public class QuickSort {
    int pIndex;
    public static void quickSort(int arr[],int start,int end){   
        if(start <= end){
                int pIndex=Partition(arr,start,end);
                quickSort(arr, start, pIndex-1);
                quickSort(arr, pIndex+1, end);
            }
    }
    
    public static int Partition(int arr[], int start, int end){
        int pIndex=start;
        int pivot=arr[end];
        for (int i=start; i<end; i++) {
            if(arr[i]<pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,end);
        return pIndex;
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
        System.out.println("*********QUICK SORT*********");
        System.out.println();                                
        System.out.println("Original Array: ");            
        printArray(arr);                                     
        System.out.println();                                
        System.out.println("****************************");
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: ");
        printArray(arr);
        System.out.println();
        System.out.println("****************************");
        
    }
}