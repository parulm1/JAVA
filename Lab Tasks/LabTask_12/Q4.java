//4.Write a program to convert a primitive int to Integer object, float to Float object.
package LabTask_12;

public class Q4 
{
    void Integer()
    {
        int x=10;
        Integer i=new Integer(x); //unboxing
        int a= i.intValue(); //boxing
        System.out.println("Primitive x = "+x);
        System.out.println("Refrence i = "+i);
    }
    void Float()
    {
        float x=10.45f;
        Float i=new Float(x); //unboxing
        float a= i.floatValue(); //boxing
        System.out.println("Primitive x = "+x);
        System.out.println("Refrence i = "+i);
    }
    public static void main(String[] args) 
    {
        Q4 q=new Q4();
        q.Integer();
        q.Float();
    }
}
