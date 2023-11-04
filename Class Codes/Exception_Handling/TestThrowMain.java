package Exception_Handling;

public class TestThrowMain 
{
    public static void main(String[] args) 
    {
        TestThrow tt=new TestThrow();
        //tt.show();
        tt.test();
        try
        {
            tt.show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}