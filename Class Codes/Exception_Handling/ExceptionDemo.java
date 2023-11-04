package Exception_Handling;

public class ExceptionDemo 
{
    int a=10;
    int b=0;
    int arr[]={1,2,3};
    void display()
    {
        System.out.println("Display");
    }
    void show()
    {
        try
        {
            System.out.println("C");
            System.out.println("a/b");
            //System.out.println("D");   no line execute after the exception line
            //arr[2]=12;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
         finally
        {
            System.out.println("D");
        }
    }
        public static void main(String[] args)
        {
            System.out.println("A");
            ExceptionDemo obj = new ExceptionDemo();
            System.out.println("B");
            obj.show();
            System.out.println("E");
            obj.display();
        }            
}

