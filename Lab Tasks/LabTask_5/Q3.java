//3.Create a class with multiple constructors, including a
//default constructor and a parameterized constructor.
//Demonstrate how to use each constructor
package LabTask_5;

public class Q3 {
    int value;
    
    public Q3(){
        value=0;
}
    
    public Q3(int v){
        value=v;
    }
    
    int getValue(){
        return value;
    }
    
    public static void main(String[] args) {
        Q3 p = new Q3();
        System.out.println("Using Default Constructor: " + p.getValue());

        Q3 p1 = new Q3(42);
        System.out.println("Using Parameterized Constructor: " + p1.getValue());
    }
}