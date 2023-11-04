//1.Write a Java program to demonstrate Overriding and Access-Modifiers.
package LabTask_6;

class Birds
{
    public void color()
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
    public void color()
    {
        System.out.println("Parrot color Green");
    }
    protected void size()
    {
        System.out.println("Small");
    }
}
class Pecock extends Birds
{
    @Override
    public void color()
    {
        System.out.println("Pecock color Blue");
    }
    protected void size()
    {
        System.out.println("Big");
    }
}
public class Q1
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
