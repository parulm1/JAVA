/*
//gives multiple values according to the processor because no synchronization
package Thread_Java;

public class Synchronization_Demo implements Runnable
{
    static int x=0;
    
    @Override
    public void run() 
    {
        for(int i=0;i<1000;i++)
        {
            //1 step forward and -- i.e 1 step backward
            x++;
            x--;
        }
    }
    
    public static void main(String[] args) 
    {
        Synchronization_Demo sync=new Synchronization_Demo();
        
        Thread th[]=new Thread[1000];
        
        for(int i=0;i<th.length;i++)
        {
            th[i]=new Thread(sync);
            th[i].start();
        }
        System.out.println("Final value of x is "+x);
    }
}
*/

package Thread_Java;

public class Synchronization_Demo implements Runnable
{
    static int x=0;
    
    @Override
    public void run() 
    {
        synchronized (this) //runs the loop successfully
        {
            for(int i=0;i<1000;i++)
            {
                //1 step forward and -- i.e 1 step backward
                x++;
                x--;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Synchronization_Demo sync=new Synchronization_Demo();
        
        Thread th[]=new Thread[1000];
        
        for(int i=0;i<th.length;i++)
        {
            th[i]=new Thread(sync);
            th[i].start();
        }
        System.out.println("Final value of x is "+x);
    }
}