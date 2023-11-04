/*
package Thread_Java;

public class ThreadsDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            //System.out.println(i);
            System.out.println(getName()+i);
        }
    }    
    public static void main(String[] args) 
    {
        ThreadsDemo t1=new ThreadsDemo();
        ThreadsDemo t2=new ThreadsDemo();
        
        t1.setName("First");
        t2.setName("Second");
        
        t1.start();
        t2.start();
    }
}
*/

/*
package Thread_Java;

public class ThreadsDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(this.getName().equals("Second"))
            {
                try
                {
                    sleep(1000);
                }
                catch(Exception e){}
            }
            System.out.println(getName()+i);
        }
    }    
    public static void main(String[] args) 
    {
        System.out.println(Thread.currentThread());
        ThreadsDemo t1=new ThreadsDemo();
        ThreadsDemo t2=new ThreadsDemo();
        
        t1.setName("First");
        t2.setName("Second");
        
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e){}
        System.out.println("Main Thread Exited");
    }
}
*/
package Thread_Java;

public class ThreadsDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(getName()+i);
        }
    }    
    public static void main(String[] args) 
    {
        System.out.println(Thread.currentThread());
        ThreadsDemo t1=new ThreadsDemo();
        ThreadsDemo t2=new ThreadsDemo();
        
        t1.setName("First");
        t2.setName("Second");
        
        t1.start();
        t2.start();
        
        t2.setPriority(10);
        System.out.println("T2 : "+t2.getPriority());
        System.out.println("T1 : "+t1.getPriority());

        System.out.println("Main Thread Exited");
    }
}