package Exception_Handling;

public class TestThrow 
{
    int a=10;
    int b=0;
    void show()throws Exception
    {
        System.out.println(a/b);
        Class.forName("");
    }
    void display()
    {
        System.out.println("Display");
    }
    void test()
    {
        System.out.println("Test");
        display();
    }
}
