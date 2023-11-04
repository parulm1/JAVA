/*
package Thread_Java;

public class Runnable_Implementation implements Runnable
{
    @Override
    public void run() 
    {
        for(int i=0;i<=9;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        Runnable_Implementation t1=new Runnable_Implementation();
        Runnable_Implementation t2=new Runnable_Implementation();
        
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        
        th1.start();
        th2.start();
    }
}
*/

package Thread_Java;

public class Runnable_Implementation implements Runnable
{
    String name;

    public Runnable_Implementation(String name) 
    {
        this.name=name;
    }
    
    @Override
    public void run() 
    {
        for(int i=0;i<=9;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        Runnable_Implementation t1=new Runnable_Implementation("ONE");
        Runnable_Implementation t2=new Runnable_Implementation("TWO");
        
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        
        th1.start();
        th2.start();
    }
}