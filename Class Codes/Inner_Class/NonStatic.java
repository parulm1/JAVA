package Inner_Class;

class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        
        void display()
        {
            System.out.println("non static inner class"+(x+y));
        }
    }
}
public class NonStatic
{
    public static void main(String[] args) 
    {
    Outer o = new Outer();
    Outer.Inner obj = o.new Inner();
    obj.display();
    }
}

