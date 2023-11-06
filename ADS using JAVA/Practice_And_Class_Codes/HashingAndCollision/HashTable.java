package HashingAndCollision;
public class HashTable {
     static final int SIZE=5;
    int arr[] = new int[SIZE];
    
    public HashTable(){
        for(int i=0;i<SIZE;i++)
            arr[i]=-1;
    }
    
    int insert(int value){
        int key = value % SIZE;
        int index = key;
        while(arr[index] != value){
            index = (index+1) % SIZE;
            
            if(index == key)
                return 0;
        }
        arr[index] = -1;
    return 1;
}
    
int search(int value){
        int key = value % SIZE;
        int index = key;
        while(arr[index] != value){
            index = (index+1) % SIZE;
            
            if(index == key)
                return 0;
        }
        arr[index] = 1;
    return 1;
}

    public static void main(String[] args) {
        System.out.println("Hashing");
    }
}
