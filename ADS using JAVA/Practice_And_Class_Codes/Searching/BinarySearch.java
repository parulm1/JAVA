package Searching;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start= 0;
        int end = arr.length;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {10,23,45,70,90,100,111,123};
        int key = 45;
        int result = binarySearch(arr, key);

        if (result != 0) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}

