package Searching;
public class LinearSearch {
    public int linearSearch(int arr[],int size, int key){
        int i;
        for(i=0;i<=size;i++){
            if(arr[i]==key)
                return 1;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int num[]={86,91,34,50,0};
        int key=50;
        LinearSearch obj = new LinearSearch();
        if(obj.linearSearch(num, num.length, key)==1)
            System.out.println("Search Found");
        else
            System.out.println("Search not Found");            
    }
}
