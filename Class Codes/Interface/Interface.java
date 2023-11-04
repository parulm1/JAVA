package Interface;

public interface Interface 
{
    int a=10;//by deafault public static final int a=10
    void showName(String name);//by default public abstract void showName
    void showAge(int age);
   
    default void Course()
    {
        System.out.println("Default Method of Interface");
    }
    static void institute()
    {
        System.out.println("This is static method");
    }
}


