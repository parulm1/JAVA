package Stack;
class MyStack{
    final int SIZE=5;
    int arr[] = new int[SIZE];
    int top=-1;
    
    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isFull(){
        if(top==SIZE-1){
            return true;
        }else{
            return false;
        }
    }
    
    public void Push(int value){
        if(isFull()){
            System.out.println("Stack is full......");
        }else{
            ++top;
            arr[top]=value;
        }
    }
    
    public void Pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty......");
        }else{
            System.out.println(arr[top]+" is popped...");
            top--;
        }
    }
    
    public void Peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty......");
            return;}    
        System.out.println("Peeked Element: "+arr[top]);
        return;}
    
    public void displayStackData() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;}
        System.out.println("Data in the stack:");
        for (int i = top; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.Push(10);
        System.out.println("10 is pushed...");        
        stack.Push(20);
        System.out.println("20 is pushed...");        
        stack.Push(30);
        System.out.println("30 is pushed...");       
        stack.Push(40);
        System.out.println("40 is pushed...");
        stack.Push(50);
        System.out.println("50 is pushed...");
        stack.Push(60);
        stack.Pop();
        stack.Pop();
        stack.Pop();
        stack.Pop();
        stack.displayStackData();
    }
}
