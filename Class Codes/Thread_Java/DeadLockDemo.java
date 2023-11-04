package Thread_Java;

public class DeadLockDemo 
{
    public static void main(String[] args) 
    {
        String rec1="Ram";
        String rec2="Shyam";
        
        Thread t1=new Thread()
        {
            @Override
            public void run() 
            {
                synchronized (rec1) 
                {
                    System.out.println("Thread 1 uses Resorce 1 "+rec1);
                    try
                    {
                        sleep(100);
                    }
                    catch(Exception e){}
                }    
                synchronized (rec2) 
                {
                    System.out.println("Thread 1 uses Resorce 2 "+rec2);
                }
                
        }            
        };
        
        Thread t2=new Thread()
        {
            @Override
            public void run() 
            {
                synchronized (rec2) 
                {
                    System.out.println("Thread 2 uses Resorce 2 "+rec2);
                    try
                    {
                        sleep(100);
                    }
                    catch(Exception e){}
                }    
                    synchronized (rec1) 
                    {
                        System.out.println("Thread 2 uses Resorce 1 "+rec1);
                    }
            }            
        };    
        t1.start();
        t2.start();
    }             
}
