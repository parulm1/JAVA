//2.Write a Java program to demonstrate that overridden method can be called from sub-class.

package LabTask_6;

class Birds
{
    void color()
    {
        System.out.println("Any Color");
    }
    void size()
    {
        System.out.println("Any Size");
    }
}
class Parrot extends Birds
{
    @Override
    void color()
    {
        System.out.println("Parrot color Green");
    }
    void size()
    {
        System.out.println("Small");
    }
}
class Pecock extends Birds
{
    @Override
    void color()
    {
        System.out.println("Pecock color Blue");
    }
    void size()
    {
        System.out.println("Big");
    }
}
public class Q2
{
    public static void main(String[] args) 
    {
        Parrot pa=new Parrot();
        pa.color();
        pa.size();
        Pecock pe=new Pecock();
        pe.color();
        pe.size();
    }
}
