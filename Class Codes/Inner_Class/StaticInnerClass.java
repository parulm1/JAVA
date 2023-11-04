package Inner_Class;

class Outer
{
    int x=10;
    static class InnerStatic
    {
        int y=20;
        void show()
        {
            Outer o =new Outer();
            System.out.println("static inner class"+(o.x+y));
        }
    }
}
public class StaticInnerClass 
{
    public static void main(String[] args) 
    {
        Outer.InnerStatic obj = new Outer.InnerStatic();
        obj.show();
    }
}



























